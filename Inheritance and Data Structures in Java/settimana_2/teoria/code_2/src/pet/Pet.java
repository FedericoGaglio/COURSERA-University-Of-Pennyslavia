package pet;

import java.util.ArrayList;

/**
 * Abstract class Pet represents a generic (or abstract) pet.
 * @author lbrandon
 *
 */
public abstract class Pet {
	
	//instance variables
	
	/**
	 * Age of pet.
	 * Default (package-private) access.
	 * Accessible anywhere in the same package.
	 */
	int age;
	
	/**
	 * Name of pet.
	 * Default (package-private) access.
	 * Accessible anywhere in the same package.
	 */
	String name;
	
	/**
	 * Weight of pet.
	 * Default (package-private) access.
	 * Accessible anywhere in the same package.
	 */
	double weight;
	
	//constructor
	
	/**
	 * Called by subclasses of Pet to create instances of different types of pets.
	 * @param age of pet
	 * @param name of pet
	 * @param weight of pet
	 */
	public Pet(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//getters and setters
	
	/**
	 * Gets the weight.
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//non-abstract method
	
	/**
	 * Tells pet to eat given food.
	 * @param food to eat
	 */
	public void eat(Food food) {
		this.weight += (food.getCalories() / 100);
	}
	
	//abstract methods
	
	/**
	 * Forces all pets to make their own sound.
	 * All subclasses of Pet MUST implement this method.
	 */
	public abstract void makeSound();
	
	/**
	 * Forces all pets to override toString for printing/debugging.
	 */
	@Override
	public abstract String toString();
	
	public static void main(String[] args) {
		
		//create list of pets
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		//create dog
		Dog dog = new Dog("Buster", 14, 100, "German Shepherd");

		//create cat
		Cat cat = new Cat("Snuggles", 3, 40, "House Cat");
		
		//add pets to list
		pets.add(dog);
		pets.add(cat);
		
		for (Pet p : pets) {
			//pet makes sound
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			p.makeSound();
		}
		
		for (Pet p : pets) {
			//print pet
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			System.out.println(p);
		}
		
		//call specific method in dog class
		String breed = dog.getBreed();
		System.out.println("dog breed: " + breed);
		
		//call specific method in cat class
		String type = cat.getType();
		System.out.println("cat type: " + type);
		
		//get and print dog's current weight
		//calls non-abstract method in pet class
		System.out.println("dog's weight: " + dog.getWeight());
		
		//create pet food
		Food food = new Food(1000);
		
		//calls non-abstract method defined in pet class
		dog.eat(food);
		
		//get and print dog's new weight
		System.out.println("dog's weight: " + dog.getWeight());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
