/*
 * creating a new class where an adapter design pattern is implemented
 * this design allows pilot to not inherit the Plane as an outer object would be created(plane adapter) which would implement the interface
 * Avoids giving multiple tasks to methods such as the PlaneFlightCounter
 * Avoids passing full access to Pilot objects to other code.
 * 
 */

public class Pilot {

	private String name;
	private int amount;
	
	public Pilot(String name){
		this.name = name;
		amount = 0;
	}
	
	public void newFlight(){
		System.out.println(name+": Welcome aboard!");
		amount ++;
	}
	
	
	public static void main(String[] args){
		Pilot p = new Pilot("Stephen");
		Plane plane = new PlaneAdapter(p);

	}
	
}
