
public class PlaneAdapter implements Plane{

	private Pilot pil;
	
	public PlaneAdapter(Pilot pilot){
		this.pil = pilot;
	}
	
	@Override
	public void fly() {
		pil.newFlight();
	}

}
