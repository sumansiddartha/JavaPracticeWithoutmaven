package Practice.Threads.Synchronisation;

public class Table1 {

	synchronized void printTable(int n)  {
		for(int i=0;i<=5;i++) {
			System.out.println(n*i);  
			
			try {
			Thread.sleep(400);
			}catch(Exception ex) {}
		}
	}
	
	
}
