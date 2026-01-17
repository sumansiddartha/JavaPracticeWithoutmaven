package Practice.Threads.ThreadStates;

public class ProcessX implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadStateMain.t1.getState());
		try {
			Thread.sleep(200);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
