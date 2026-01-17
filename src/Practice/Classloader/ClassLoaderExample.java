package Practice.Classloader;

public class ClassLoaderExample {
	static int counter=0;
	
	
	
	
public ClassLoaderExample() {
		super();
		
		counter=20;
		
	}


public ClassLoaderExample(int counter) {
	this.counter=40;
}








public static void main(String[] args) {
	
	ClassLoaderExample cls=new ClassLoaderExample();
	System.out.println(counter);
	Class c=ClassLoaderExample.class;
	System.out.println(String.class.getClassLoader());
	System.out.println(c.getClassLoader());
}
}
