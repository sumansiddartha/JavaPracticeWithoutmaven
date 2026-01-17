package Practice.DesignPatterns.CreationalDesign;

public class Singleton {
	private String info="initial info of class";

	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHolder{
		
		public static final Singleton instance=new Singleton();
	}
	
	public static Singleton getInstance() {
		
		return SingletonHolder.instance;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	
}
