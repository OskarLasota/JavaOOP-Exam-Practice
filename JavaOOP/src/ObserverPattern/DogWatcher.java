package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DogWatcher implements Observer{
	private String name;
	
	DogWatcher(String nm){
		name=nm;
	}

	@Override
	public void update(Observable obj, Object action) {
		if(obj instanceof DogBot){
			DogBot dog = (DogBot) obj;
			System.out.print("** " +name+" observes ");
			System.out.println(dog.getName()+ " "+action);
		}
	}
	
	public String toString(){
		return "Dog watcher: " + name;
	}
	
	
	public static void main(String[] args){
		DogBot patch = new DogBot("patch", 4,2);
		DogBot rover = new DogBot("Rover", 9,6);
		DogWatcher jim = new DogWatcher("Jim");
		DogWatcher fred = new DogWatcher("fred");
		rover.addObserver(fred);
		patch.addObserver(jim);
		System.out.println("patch plays");
		patch.play();
		System.out.println("rover plays");
		rover.play();
		patch.addObserver(fred);
		patch.play();
		rover.deleteObserver(fred);
		rover.play();
		if(patch.eat()){
			System.out.println("patch eats");
		}else{
			System.out.println("patch doesnt eat");
		}
		
	}

}
