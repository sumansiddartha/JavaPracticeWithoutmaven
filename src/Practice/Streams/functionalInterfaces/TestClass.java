package Practice.Streams.functionalInterfaces;

public class TestClass {

	public static void main(String[] args) {
		Thread thread=new Thread(()->System.out.println("Hello This is another thread"));
		thread.start();
		System.out.println(thread.getState());

	}

}
