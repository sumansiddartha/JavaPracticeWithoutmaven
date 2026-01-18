package Practice.CallBackFunction;

public class AsyncEventConsumer {
	private AsyncEventListener eventListener;

	public AsyncEventConsumer(AsyncEventListener eventListener) {
		super();
		this.eventListener = eventListener;
	}
	public void doAsynchronousOperation() {
		System.out.println("Performing operations on asynchronous task");
		new Thread(()->eventListener.onTrigger()).start();
	}

}
