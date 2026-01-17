package Practice.Threads.Synchronisation.Block;

public class Table1 {
	void printTable(int n) {
		synchronized(this) {
			
			for(int i=0;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
	

}
