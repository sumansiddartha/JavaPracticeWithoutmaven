package Practice.CallBackFunction;

import java.util.concurrent.atomic.AtomicInteger;

public class ConsumerCallBackTest {

	public static void main(String[] args) {
		ConsumerCallBack consumerCallBack=new ConsumerCallBack();
		int ageDifference=10;
		AtomicInteger newAge1 = new AtomicInteger();
		int initialAge = 20;
		consumerCallBack.getAge(initialAge, (initialAge1)->{
			consumerCallBack.increaseAge(initialAge, ageDifference, (newAge)->{
				System.out.printf("New age ==> %s", newAge);
				newAge1.set(newAge);
			});
		});
		System.out.println();
      System.out.println(+initialAge + ageDifference);
      System.out.println(newAge1.get());
	}

}
