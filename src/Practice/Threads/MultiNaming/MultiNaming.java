package Practice.Threads.MultiNaming;

public class MultiNaming extends Thread{
	public void run(){ 
		Thread th=new Thread("suman");
		  System.out.println("Name: "+Thread.currentThread().getName());  
		  System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
		 }  
		  
		 public static void main(String[] args){  
			 MultiNaming t1=new MultiNaming();  
			 MultiNaming t2=new MultiNaming();  
//		  
  t1.setDaemon(true);//will throw exception here  
	  t1.run(); 
		  t2.run();
			 
			 Runtime r=Runtime.getRuntime();  
			  System.out.println("Total Memory: "+r.totalMemory());  
			  System.out.println("Free Memory: "+r.freeMemory());  
			    
			  for(int i=0;i<10000;i++){  
			   new MultiNaming();  
			  }  
			  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
			  System.gc();  
			  System.out.println("After gc(), Free Memory: "+r.freeMemory()); 
			 
		 }  

}
