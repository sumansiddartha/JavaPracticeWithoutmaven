package Practice.CallBackFunction;

public class SynchronousEventConsumer {
	private final EventListener eventListener;

	public SynchronousEventConsumer(EventListener eventListener) {
		super();
		this.eventListener = eventListener;
	}
	public String doSynchronousoperation() {
		System.out.println("performing callback before synchronous task");
		return eventListener.onTriger();
	}

}
