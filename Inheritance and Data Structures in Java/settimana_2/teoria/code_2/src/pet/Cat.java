package pet;

/**
 * Represents a cat, and is a subclass of abstract class Pet.
 * @author lbrandon
 *
 */
public class Cat extends Pet {
	
	//static variable
	
	/**
	 * Default sound for all cats.
	 * Only accessible within this class.
	 */
	private static String SOUND = "Meow!";
	
	//instance variable
	
	/**
	 * Type of cat.
	 * Only accessible from within this class.
	 */
	private String type;
	
	//constructor
	
	/**
	 * Creates a cat with given name, age, weight, and type.
	 * @param name of cat
	 * @param age of cat
	 * @param weight of cat
	 * @param type of cat
	 */
	public Cat(String name, int age, double weight, String type) {
		//must call constructor in superclass pet
		//set age, name, and weight of cat
		super(age, name, weight);
		
		//set type of cat
		this.type = type;
	}
	
	//getters and setters
	
	/**
	 * Gets the type of cat.
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type of cat.
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	//inherited abstract methods
	//must override and implement these (provide bodies)
	
	/**
	 * Cat makes sound.
	 */
	@Override
	public void makeSound() {
		System.out.println(Cat.SOUND);
	}

	/**
	 * Returns name and type of cat for printing/debugging.
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.type;
	}
	
	
	
	

}
