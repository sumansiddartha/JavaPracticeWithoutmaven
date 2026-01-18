package Practice.DesignPatterns.CreationalDesign;

public class SIngletonTest {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		
		System.out.println(singleton.getInfo());
		Singleton singleton2=Singleton.getInstance();
		singleton2.setInfo("this is second information of class");
		System.out.println(singleton.getInfo());
		System.out.println(singleton2.getInfo());
		
		System.out.println("====================THIS IS FOR ENUM CLASS===================================");
		
		EnumSingleton enumsingleton=EnumSingleton.INSTANCE.getInstance();
		System.out.println("======"+enumsingleton.getInfo());
		EnumSingleton enumsingleton2=EnumSingleton.INSTANCE.getInstance();
		enumsingleton2.setInfo("This is the needed information for the class");
		System.out.println(enumsingleton.getInfo());
		System.out.println(enumsingleton2.getInfo());
		
	}

}
