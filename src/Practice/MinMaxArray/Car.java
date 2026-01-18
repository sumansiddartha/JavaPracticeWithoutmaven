package Practice.MinMaxArray;

public class Car {
	   private String model;
	    private int topSpeed;
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getTopSpeed() {
			return topSpeed;
		}
		public void setTopSpeed(int topSpeed) {
			this.topSpeed = topSpeed;
		}
		public Car(String model, int topSpeed) {
			super();
			this.model = model;
			this.topSpeed = topSpeed;
		}
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Car [model=" + model + ", topSpeed=" + topSpeed + "]";
		}
	    
	    
	    
}
