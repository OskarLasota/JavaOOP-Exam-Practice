
public class PlaneFlightCounter implements Plane {

	private Plane plane;
	private int amount;
	
	public PlaneFlightCounter(Plane plane){
		this.plane = plane;
	}
	
	
	public int count() {
		return amount;
	}


	@Override
	public void fly() {
		plane.fly();
		amount++;
	}

}
