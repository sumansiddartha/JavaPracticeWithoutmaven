package Practice.Threads;

public class MainThreadPractice {
public static void main(String[] args) {
	Runnable runnable=new SimpleRunnable();
	Thread t=new Thread(runnable);
	t.start();
	System.out.println(t.getState());
}
}
