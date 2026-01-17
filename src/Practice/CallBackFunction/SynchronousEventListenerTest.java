package Practice.CallBackFunction;

public class SynchronousEventListenerTest {

	public static void main(String[] args) {
		EventListener listener=new SynchronousEventListenerImpl();
		SynchronousEventConsumer synchronousEventConsumer=new SynchronousEventConsumer(listener);
		String result=synchronousEventConsumer.doSynchronousoperation();
		System.out.println(result);
	}
}
