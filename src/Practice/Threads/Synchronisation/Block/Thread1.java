package Practice.Threads.Synchronisation.Block;

public class Thread1 extends Thread{
	Table1 t1;

	public Thread1(Table1 t1) {
		super();
		this.t1 = t1;
	}
	public void run() {
		t1.printTable(5);
	}

}
