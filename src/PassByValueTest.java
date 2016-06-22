/**
 * 
 * @author djw
 * @version 0.9
 * 
 * Illustration showing that Java is Pass by Value.
 * <p>
 * In Java, Objects are passed by reference, 
 * and primitives are passed by value. 
 * In Java you can't have a pointer/reference to a primitive. 
 * However, Objects are not passed by reference. 
 * Object references are passed by value.
 * 
 * The Java Specification says that everything in java is pass-by-value. 
 * There is no such thing as "pass-by-reference" in Java.
 * "The reference values (often just references) are pointers to these objects, 
 * and a special null reference, which refers to no object" - Sun Java Documentation
 */
public class PassByValueTest {

	public static void main(String[] args){
		//create a new object called r
		//r will contain the memory address of the new Room object
		//**The variable r is NOT A ROOM it is simply a POINTER to a Room
		Room r = new Room();
		//set the description of r
		r.setDescription("This is the kitchen");
		//print the description of r ... it says kitchen
		System.out.println(r.getDescription());
		
		//pass r to a method. 
		//Note: You are PASSING THE MEMORY ADDRESS BY VALUE
		//You are not passing the room object
		modifyRoom(r);
		//printint r shows that modifyRoom did indeed modify
		//the object at the address of r
		System.out.println(r.getDescription());
	}
	public static void modifyRoom(Room r){
		//r still points to the r with the description of kitchen
		//now change the description of r
		//because you are changing the object reference you change the
		//actual object being pointed to... but not r
		r.setDescription("This is the Parlor");
		//print the description
		System.out.println(r.getDescription());
	}
}
