<center><h1>Dyanmic Proxy: It is used for implementing transaction management.<h1></center>

@Transactional Annotation:used both at class level and method level

The annotation supports further configuration as well:

<li>the Propagation Type of the transaction</li>
<li>the Isolation Level of the transaction</li>
<li>a Timeout for the operation wrapped by the transaction</li>
<li>a readOnly flag – a hint for the persistence provider that the transaction should be read only</li>
<li>the Rollback rules for the transaction</li>

<p><strong>The checked exception does not trigger a rollback of the transaction</strong></p>


### Potential Pitfalls

#### Transactions and Proxies

*   At a high level, Spring creates proxies for all the classes annotated with @Transactional
*   The proxy allows the framework to inject transactional logic before and after the running method, mainly for starting and committing the transaction.
*   if the transactional bean is implementing an interface, by default the proxy will be a Java Dynamic Proxy. 
		*   This means that only external method calls that come in through the proxy will be intercepted
		
	*   Any self-invocation calls will not start any transaction, even if the method has the @Transactional annotation.
	

*   Only public methods should be annotated with @Transactional. Methods of any other visibilities will simply ignore the annotation silently as these are not proxied.


#### Read-Only Transactions
The readOnly flag usually generates confusion, especially when working with JPA

> This just serves as a hint for the actual transaction subsystem; it will not necessarily cause failure of write access attempts. A transaction manager which cannot interpret the read-only hint will not throw an exception when asked for a read-only transaction


The fact is that we can’t be sure that an insert or update won’t occur when the readOnly flag is set. This behavior is vendor-dependent, whereas JPA is vendor agnostic.

It’s also important to understand that the readOnly flag is only relevant inside a transaction. If an operation occurs outside of a transactional context, the flag is simply ignored. A simple example of that would call a method annotated with:


> @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

#### Transaction Logging
A helpful method to understand transactional-related issues is fine-tuning logging in the transactional packages. The relevant package in Spring is “org.springframework.transaction”, which should be configured with a logging level of TRACE.

#### Transaction Rollback
The @Transactional annotation is the metadata that specifies the semantics of the transactions on a method. We have two ways to rollback a transaction:
declarative and programmatic.

In the declarative approach, we annotate the methods with the @Transactional annotation. The @Transactional annotation makes use of the attributes rollbackFor or rollbackForClassName to rollback the transactions, and the attributes noRollbackFor or noRollbackForClassName to avoid rollback on listed exceptions.

The default rollback behavior in the declarative approach will rollback on runtime exceptions.


> @Transactional<br>
 public void createCourseDeclarativeWithRuntimeException(Course course) {<br>
    courseDao.create(course);<br>
    throw new DataIntegrityViolationException("Throwing exception for demoing Rollback!!!");<br>
}


*    attribute noRollbackFor in the declarative approach to prevent rollback of the transaction for the listed exception:

> @Transactional(noRollbackFor = { SQLException.class })<br>
public void createCourseDeclarativeWithNoRollBack(Course course) throws SQLException {<br>
    courseDao.create(course);<br>
    throw new SQLException("Throwing exception for demoing rollback");<br>
}


##### Programmatic approach, we rollback the transactions using TransactionAspectSupport:


> public void createCourseDefaultRatingProgramatic(Course course) {<br>
    try {<br>
       courseDao.create(course);<br>
    } catch (Exception e) {<br>
       TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();<br>
    }
}

**The declarative rollback strategy should be favored over the programmatic rollback strategy.**  
<hr>


## <center>Transaction Propagation and Isolation in Spring @Transactional</center>

@Transactional allows us to set **propagation, isolation, timeout, read-only, and rollback** conditions for our transaction. We can also specify the transaction manager.


##### @Transactional Implementation Details

*   Spring creates a proxy, or manipulates the class byte-code, to manage the creation, commit, and rollback of the transaction. **In the case of a proxy, Spring ignores @Transactional in internal method calls.**
*   If we have a method like **callMethod** and we mark it as @Transactional, Spring will wrap some transaction management code around the invocation @Transactional method called:

> createTransactionIfNecessary();<br>
try {<br>
    callMethod();<br>
    commitTransactionAfterReturning();<br>
} catch (exception) {<br>
    completeTransactionAfterThrowing();<br>
    throw exception;<br>
}


##### How to Use @Transactional

*   We can put the annotation on definitions of interfaces, classes, or directly on methods.  They override each other according to the priority order; from **lowest to highest**
		*  **interface, superclass, class, interface method, superclass method, and class method.**
*   it’s not recommended to set @Transactional on the interface; however, it is acceptable for cases like @Repository with Spring Data.


> @Service<br>
@Transactional<br>
public class TransferServiceImpl implements TransferService {<br>
    @Override<br>
    public void transfer(String user1, String user2, double val) {<br>
        // ...<br>
    }<br>
}<br>

Now let’s override it by setting the annotation directly on the method:
> @Transactional<br>
public void transfer(String user1, String user2, double val) {<br>
    // ...<br>
}<br>

###Transaction Propagation
Propagation defines our business logic’s **transaction boundary**. Spring manages to **start and pause** a transaction according to our propagation setting.


*   Spring calls **TransactionManager::getTransaction** to get or create a transaction according to the <u>propagation</u>
*   It supports some of the propagations for all types of TransactionManager, but there are a few of them that are only supported by specific implementations of TransactionManager.


##### REQUIRED Propagation

* REQUIRED is the default propagation. 
* Spring checks if there is an active transaction, and if nothing exists, it creates a new one. Otherwise, the business logic appends to the currently active transaction:

> @Transactional(propagation = Propagation.REQUIRED)<br>
public void requiredExample(String user) { <br>
    // ... <br>
}<br>

* pseudo-code of how transaction creation works for REQUIRED propagation:

> if (isExistingTransaction()) {<br>
    if (isValidateExistingTransaction()) {<br>
        validateExisitingAndThrowExceptionIfNotValid();<br>
    }<br>
    return existing;<br>
}
return createNewTransaction();<br>


##### SUPPORTS Propagation

* Spring first checks if an active transaction exists. 
* If a transaction exists, then the existing transaction will be used. If there isn’t a transaction, it is executed non-transactional:

> if (isExistingTransaction()) {<br>
    if (isValidateExistingTransaction()) {<br>
        validateExisitingAndThrowExceptionIfNotValid();<br>
    }<br>
    return existing;<br>
}<br>
return emptyTransaction;<br>


##### MANDATORY Propagation

When the propagation is MANDATORY, if there is an active transaction, then it will be used. If there isn’t an active transaction, then Spring throws an exception:


> @Transactional(propagation = Propagation.MANDATORY)<br>
public void mandatoryExample(String user) { <br>
    // ... <br>
}<br>

* Paeudo code

> if (isExistingTransaction()) {<br>
    if (isValidateExistingTransaction()) {<br>
        validateExisitingAndThrowExceptionIfNotValid();<br>
    }<br>
    return existing;<br>
}<br>
throw IllegalTransactionStateException;<br>


##### NEVER Propagation

For transactional logic with NEVER propagation, Spring throws an exception if there’s an active transaction:

> @Transactional(propagation = Propagation.NEVER)<br>
public void neverExample(String user) { <br>
    // ... <br>
}<br>


*    pseudo-code
if (isExistingTransaction()) {<br>
    throw IllegalTransactionStateException;<br>
}<br>
return emptyTransaction;<br>


##### NOT_SUPPORTED Propagation
If a current transaction exists, first Spring suspends it, and then the business logic is executed without a transaction:

@Transactional(propagation = Propagation.NOT_SUPPORTED)<br>
> public void notSupportedExample(String user) { <br>
    // ... <br>
}<br>
**The JTATransactionManager supports real transaction suspension out-of-the-box. Others simulate the suspension by holding a reference to the existing one and then clearing it from the thread context**


##### REQUIRES_NEW Propagation
REQUIRES_NEW, Spring suspends the current transaction if it exists, and then creates a new one:
> @Transactional(propagation = Propagation.REQUIRES_NEW)<br>
public void requiresNewExample(String user) { <br>
    // ... <br>
}<br>
**Similar to NOT_SUPPORTED, we need the JTATransactionManager for actual transaction suspension.**
>if (isExistingTransaction()) {<br>
    suspend(existing);<br>
    try {<br>
        return createNewTransaction();<br>
    } catch (exception) {<br>
        resumeAfterBeginException();<br>
        throw exception;<br>
    }<br>
}<br>
return createNewTransaction();<br>



##### NESTED Propagation
* NESTED propagation, Spring checks if a transaction exists, and if so, it marks a save point.
* This means that if our business logic execution throws an exception, then the transaction rollbacks to this save point. If there’s no active transaction, it works like REQUIRED


**DataSourceTransactionManager supports this propagation out-of-the-box. Some implementations of JTATransactionManager may also support this.**

**JpaTransactionManager supports NESTED only for JDBC connections. However, if we set the nestedTransactionAllowed flag to true, it also works for JDBC access code in JPA transactions if our JDBC driver supports save points.**






### Transaction Isolation

* Isolation is one of the common ACID properties: Atomicity, Consistency, Isolation, and Durability
* Isolation describes how changes applied by concurrent transactions are visible to each other.

Each isolation level prevents zero or more concurrency side effects on a transaction:

* **Dirty read:** read the uncommitted change of a concurrent transaction
* **Nonrepeatable read:** get different value on re-read of a row if a concurrent transaction updates the same row and commits
* **Phantom read:** get different rows after re-execution of a range query if another transaction adds or removes some rows in the range and commits
We can set the isolation level of a transaction by @Transactional::isolation. It has these five enumerations in Spring: **DEFAULT, READ_UNCOMMITTED, READ_COMMITTED, REPEATABLE_READ, SERIALIZABLE.**

#### Isolation Management in Spring

* The default isolation level is DEFAULT. As a result, when Spring creates a new transaction, the isolation level will be the default isolation of our RDBMS. Therefore, we should be careful if we change the database.

* We should also consider cases when we call a chain of methods with different isolation. In the normal flow, the isolation only applies when a new transaction is created. Thus, if for any reason we don’t want to allow a method to execute in different isolation, we have to set **TransactionManager::setValidateExistingTransaction** to true

* Pseudo Code:

> if (isolationLevel != ISOLATION_DEFAULT) {<br>
    if (currentTransactionIsolationLevel() != isolationLevel) {<br>
        throw IllegalTransactionStateException<br>
    }<br>
}<br>

####READ_UNCOMMITTED Isolation

READ_UNCOMMITTED is the lowest isolation level and allows for the most concurrent access.

* As a result, it suffers from all three mentioned concurrency side effects.
* A transaction with this isolation reads uncommitted data of other concurrent transactions. Also, both non-repeatable and phantom reads can happen. Thus we can get a different result on re-read of a row or re-execution of a range query.

> @Transactional(isolation = Isolation.READ_UNCOMMITTED)<br>
public void log(String message) {<br>
    // ...<br>
}<br>

**Postgres does not support READ_UNCOMMITTED isolation and falls back to READ_COMMITED instead. Also, Oracle does not support or allow READ_UNCOMMITTED.**

####READ_COMMITTED Isolation
The second level of isolation, READ_COMMITTED, prevents dirty reads.

The rest of the **concurrency side effects** could still happen. So **uncommitted changes in concurrent transactions have no impact on us**, but if a transaction commits its changes, our result could change by re-querying.
* **READ_COMMITTED is the default level with Postgres, SQL Server, and Oracle.**

>@Transactional(isolation = Isolation.READ_COMMITTED)
public void log(String message){
    // ...
}

####REPEATABLE_READ Isolation
* The third level of isolation, REPEATABLE_READ, prevents dirty, and non-repeatable reads. So we are not affected by uncommitted changes in concurrent transactions.
* Also, when we re-query for a row, we don’t get a different result. However, in the re-execution of range-queries, we may get newly added or removed rows.

Moreover, it is the lowest required level to prevent the lost update. The lost update occurs when two or more concurrent transactions read and update the same row. REPEATABLE_READ does not allow simultaneous access to a row at all. Hence the lost update can’t happen.

> @Transactional(isolation = Isolation.REPEATABLE_READ)<br> 
public void log(String message){<br> 
    // ...<br> 
}<br> 

**REPEATABLE_READ is the default level in Mysql. Oracle does not support REPEATABLE_READ.**

####SERIALIZABLE Isolation
* SERIALIZABLE is the highest level of isolation. 
* It prevents all mentioned concurrency side effects, but can lead to the lowest concurrent access rate because it executes concurrent calls sequentially.

> @Transactional(isolation = Isolation.SERIALIZABLE)<br>
public void log(String message){<br>
    // ...<br>
}<br>














 















