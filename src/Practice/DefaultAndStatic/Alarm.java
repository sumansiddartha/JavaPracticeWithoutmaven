package Practice.DefaultAndStatic;

public interface Alarm {
	default String turnOnAlaram() {
		return "Turning the alaram on2.";
	}
	default String turnOffAlaram()  {
		return "Turning the alaram off2.";
	}

}
