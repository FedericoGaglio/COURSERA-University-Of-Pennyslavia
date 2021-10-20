package pet;

/**
 * Represents a dog, and is a subclass of abstract class Pet.
 * @author lbrandon
 *
 */
public class Dog extends Pet {
	
	//static variable
	
	/**
	 * Default sound for all dogs.
	 * Only accessible within this class.
	 */
	private static String SOUND = "Bark!";
	
	//instance variable
	
	/**
	 * Breed of dog.
	 * Only accessible from within this class.
	 */
	private String breed;
	
	//constructor
	
	/**
	 * Creates a dog with given name, age, weight, and breed.
	 * @param name of dog
	 * @param age of dog
	 * @param weight of dog
	 * @param breed of dog
	 */
	public Dog(String name, int age, double weight, String breed) {
		//must call constructor in superclass Pet
		super(age, name, weight);
		
		//set breed of dog
		this.breed = breed;
	}

	//getters and setters
	
	/**
	 * Gets the breed of dog.
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * Sets the breed of dog.
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	//inherited abstract methods
	//must override and implement these (provide bodies)
	
	/**
	 * Makes dog sound.
	 */
	@Override
	public void makeSound() {
		System.out.println(Dog.SOUND);
	}

	/**
	 * Returns the name and breed of dog for printing/debugging.
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.breed;
	}
	
	
	
	
	

}
