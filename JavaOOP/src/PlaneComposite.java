import java.util.ArrayList;
import java.util.List;

/*
 * This is a Composite Design pattern example of a wrapper pattern
 * This design works with collections of the implemented Objects
 * 
 * By Oskar Lasota
 */

public class PlaneComposite implements Plane {

	private List<Plane> planes;
	private int count;
	
	public PlaneComposite(){
		planes = new ArrayList<Plane>();
	}
	
	public void addPlane(Plane p){
		planes.add(p);
	}

	@Override
	public void fly() {
		for(Plane plane : planes){
			plane.fly();
		}
	}
	
}
