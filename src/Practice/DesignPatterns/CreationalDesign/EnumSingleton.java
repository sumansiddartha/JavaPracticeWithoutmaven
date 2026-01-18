package Practice.DesignPatterns.CreationalDesign;

public enum EnumSingleton {
	/*
	 * This approach has serialization and thread-safety guaranteed by the enum
	 * implementation itself, which ensures internally that only the single instance
	 * is available.
	 */
	
	
	INSTANCE("INITIAL INFO CLASS");

	private String info;

	private EnumSingleton(String info) {
		this.info = info;
	}
	public EnumSingleton getInstance() {
		return INSTANCE;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
