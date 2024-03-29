/*
 * Decorator Design pattern
 * Used for adding additional functionality to a particular object
 * Instead of adding subclasses
 * 
 * each method that is overriden calls the same method with the
 * the arguments plus extra work.
 * 
 * By Oskar Lasota
 */
interface Plane {

	public void fly();
	
}
