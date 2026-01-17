package Practice.CallBackFunction;

public class AsyncEventListenerImpl implements AsyncEventListener{

	@Override
	public String onTrigger() {
		respondToTrigger();
		return "Asynchronously running callback function";
	}

	@Override
	public void respondToTrigger() {
		 System.out.println("This is a side effect of the asynchronous trigger.");
		
	}

}
