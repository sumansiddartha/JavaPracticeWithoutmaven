package Practice.Threads;

public class DemoWaitingStateRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
//		Since t1 is waiting for t2 to complete, we’re calling t1.getState() from t2
		System.out.println(WaitingState.t1.getState());
		
	}

}
