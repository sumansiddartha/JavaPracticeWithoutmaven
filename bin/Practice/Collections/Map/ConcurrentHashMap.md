===================================Concurrent Hash Map====================

 HashMap is not a thread-safe implementation, while Hashtable does provide thread-safety by synchronizing operations.
 Even though Hashtable is thread safe, it is not very efficient. Another fully synchronized Map,
 
 Collections.synchronizedMap, does not exhibit great efficiency either. If we want thread-safety with high throughput under high concurrency, these implementations aren’t the way to go.
 Java Collections Framework introduced ConcurrentMap in Java 1.5.
 
  ConcurrentMap:
  ConcurrentMap is an extension of the Map interface. It aims to provides a structure and guidance to solving the problem of reconciling throughput with thread-safety.
  By overriding several interface default methods, ConcurrentMap gives guidelines for valid implementations to provide thread-safety and memory-consistent atomic operations.
  
Several default implementations are overridden, disabling the null key/value support:

getOrDefault
forEach
replaceAll
computeIfAbsent
computeIfPresent
compute
merge

The following APIs are also overridden to support atomicity, without a default interface implementation:

putIfAbsent
remove
replace(key, oldValue, newValue)
replace(key, value)

ConcurrentHashMap:
ConcurrentHashMap is the out-of-box ready ConcurrentMap implementation.
For better performance, it consists of an array of nodes as table buckets (used to be table segments prior to Java 8) under the hood, and mainly uses CAS operations during updating.

The table buckets are initialized lazily, upon the first insertion. Each bucket can be independently locked by locking the very first node in the bucket. Read operations do not block, and update contentions are minimized.

The number of segments required is relative to the number of threads accessing the table so that the update in progress per segment would be no more than one most of time.
