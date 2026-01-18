package Practice.Threads.Synchronisation;

public class Thread2 extends Thread{
Table1 t;

public Thread2(Table1 t) {
	super();
	this.t = t;
}
public void run() {
	
	
	t.printTable(100);
}
}
