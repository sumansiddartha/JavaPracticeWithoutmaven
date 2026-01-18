package Practice.Threads.Synchronisation;

public class SynchronisedMethods {
	private int sum=0;
	private int count=0;
	public  synchronized void  calculate() {
		System.out.println(getSum());
		setSum( getSum()+1);
	}
	
	public void performSynchronisedTask() {
	    synchronized (this) {
	        setCount(getCount()+1);
	    }
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		
		this.sum = sum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
