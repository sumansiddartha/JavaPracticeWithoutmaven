package Practice.Threads;

public class YealdMethodExamp  extends Thread{

	
	 public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	            System.out.println(Thread.currentThread().getName() + " in control2");  
	    }  
	
	public static void main(String[] args) {
		YealdMethodExamp t1=new YealdMethodExamp();
		YealdMethodExamp t2=new YealdMethodExamp();
		System.out.println("This is thread t1::"+t1.getName());
		System.out.println("This is thread t2::"+t2.getName());
		t1.start();
		t2.start();
	    for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        } 
		
	}

}
