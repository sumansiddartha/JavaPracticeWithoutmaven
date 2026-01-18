package Practice.Threads;

public class Multi3 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is runningggggggggggggggg.........");
	}

	
	public static void main(String[] args) {
		Multi3 multi=new Multi3();
		Thread th=new Thread(multi);
		th.start();
		th.run();
		
	}
}
