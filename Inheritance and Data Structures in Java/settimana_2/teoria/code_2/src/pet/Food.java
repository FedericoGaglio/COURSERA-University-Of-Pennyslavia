package pet;

/**
 * Represents generic food for a pet.
 * @author lbrandon
 *
 */
public class Food {
	
	//instance variables
	
	/**
	 * Calories for food.
	 * Only accessible from within this class.
	 */
	private int calories;
	
	//constructor
	
	/**
	 * Creates instance of food with given number of calories.
	 * @param calories for food
	 */
	public Food(int calories) {
		this.calories = calories;
	}

	//getters and setters
	
	/**
	 * Gets the calories.
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Sets the calories.
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
