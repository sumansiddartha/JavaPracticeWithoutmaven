package Practice.JVM;

import java.sql.DriverManager;
import java.util.ArrayList;

public class ClassLoaderExample {
	public void ClassLoaderExample() throws ClassNotFoundException {

	    System.out.println("Classloader of this class:"
	        + ClassLoaderExample.class.getClassLoader());

	    System.out.println("Classloader of DriverManager:"
	        + DriverManager.class.getClassLoader());

	    System.out.println("Classloader of ArrayList:"
	        + ArrayList.class.getClassLoader());
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		ClassLoaderExample wc=new	ClassLoaderExample();
		wc.ClassLoaderExample();

	}

}
