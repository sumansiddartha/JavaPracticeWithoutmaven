package Practice.Threads.Synchronisation;

public class Thread1 extends Thread{
	Table1 t;

	public Thread1(Table1 t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}

}
