package Practice.Threads.Concurrency;

import java.util.concurrent.Executor;

public class ExecutorDemo {
//	Executor is an interface that represents an object that executes provided tasks.
//	an executor can invoke the submitted task instantly in the invoking thread.
//	we need to create an invoker to create the executor instance:
	public void execute() {
		
		Executor executor = new Invoker();
		executor.execute(()->{
			System.out.println("This is a printing task");
		});
	}
	
	public static void main(String[] args) {
//		 executor can’t accept the task for execution, it will throw RejectedExecutionException.
		ExecutorDemo demo=new ExecutorDemo();
		demo.execute();
	}

}
