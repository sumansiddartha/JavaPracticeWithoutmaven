package Practice.Threads.ThreadStates;

public class ThreadStateMain implements Runnable{
	
	public static Thread t1;
	public static ThreadStateMain obj;
	
	public static void main(String[] args) {
		obj=new ThreadStateMain();
		t1=new Thread(obj);
	
		System.out.println("Thread state t1 after spawning it::"+t1.getState());
		t1.start();
		System.out.println("Thread state t1 after the method start()::"+t1.getState());
	}

	@Override
	public void run() {
		ProcessX myObj=new ProcessX();
		Thread t2=new Thread(myObj);
		System.out.println("Thread state t2 after spawning it::"+t2.getState());
		t2.start();
		System.out.println("Thread state t1 after the method start()::"+t2.getState());
		
		try  
		{  
		// moving the thread t1 to the state timed waiting   
		Thread.sleep(200);  
		}  
		catch (InterruptedException ie)  
		{  
		ie.printStackTrace();  
		}  
		  
		System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );
		
		
		try  
		{  
		// waiting for thread t2 to complete its execution  
		t2.join();  
		}  
		catch (InterruptedException ie)  
		{  
		ie.printStackTrace();  
		}  
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
		
	}

}
