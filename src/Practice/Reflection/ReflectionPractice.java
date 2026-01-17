package Practice.Reflection;

import Practice.Reflection.Simple;

interface My{}
public class ReflectionPractice {

	  void printName(Object obj){  
		  Class c=obj.getClass();    
		  System.out.println(c.getName());  
		  }  
	 
	
	public static void main(String[] args) throws ReflectiveOperationException  {
		//Reflection is the process of examining 
		//and modifing runtime behavior of a class at runtime
		
		//Three ways to get instances of a class
		//forName()
		//getClass()
		//.class
		
		Class c1=Class.forName("Practice.Reflection.Simple");
		  Simple s1=(Simple)c1.newInstance();  
		  s1.message();
//		
//		System.out.println(c.isInterface());
		
//		Class c2=Class.forName("My");  
//		   System.out.println(c2.isInterface());
		   
		   
		Simple s=new Simple();
		ReflectionPractice rp=new ReflectionPractice();
		rp.printName(rp);
		
		   Class c = boolean.class;   
		   System.out.println(c.getName());
		
	}
}
