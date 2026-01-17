package Practice.set;

import java.util.EnumSet;

public class Pizza {
	
	public enum PizzaStatus{
		ORDERED,READY,DELIVERED;

		boolean isReady() {
			// TODO Auto-generated method stub
			return false;
		}

		String getTimeToDelivery() {
			// TODO Auto-generated method stub
			return null;
		}

		}
	

	private static EnumSet<PizzaStatus> undeliveredPizzaStatus=EnumSet.of(PizzaStatus.ORDERED,PizzaStatus.READY);
	
	private PizzaStatus status;

	public PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(PizzaStatus status) {
		this.status = status;
	}
	
	public boolean isDelivered() {
		return this.status.isReady();
	}
	public void PrintTimeToDeliver() {
		System.out.println("Time to Delivery"+this.getStatus().getTimeToDelivery()+"days");
	}
	
}
