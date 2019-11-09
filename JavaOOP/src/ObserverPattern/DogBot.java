package ObserverPattern;

import java.util.Observable;

public class DogBot extends Observable{

	protected int hungry, tired;
	private String name;
	
	public DogBot(String nm, int h, int t){
		name=nm;
		hungry=h;
		tired=t;
	}
	
	public boolean eat(){
		if(hungry>6){
			hungry-=3;
			setChanged();
			notifyObservers("eat");
			return true;
		}else{
			return false;
		}
	}
	
	public void rest(){
		hungry++;
		tired-=2;
		setChanged();
		notifyObservers("rest");
	}
	public void play(){
		hungry+=2;
		tired+=3;
		setChanged();
		notifyObservers("play");
	}
	public String getName(){
		return name;
	}
	public String noise(){
		if(hungry>8&&tired<11){
			return name+": whine ";
		}else if(tired>7&&tired>hungry){
			return name+": snore ";
		}else{
			return name+": woof ";
		}
	}
	
	
}
