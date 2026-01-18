package Practice.Threads;

public class WaitingState implements Runnable {
public static Thread t1;
	@Override
	public void run() {
		Thread t2=new Thread(new DemoWaitingStateRunnable());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		t1=new Thread(new WaitingState());
		t1.start();
  System.out.println(t1.getState());
	}

}
