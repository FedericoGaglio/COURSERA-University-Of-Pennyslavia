

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * Class with methods for working with and manipulating Arrays and ArrayLists. 
 */
public class ArrayAndArrayList {

	/**
	 * Counts the number of occurrences of the given element in the given array.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     * 
	 * @param array to search
	 * @param element to search for
	 * @return number of times element is in array
	 */
	public int howMany(int[] array, int element) {
		int contatoreOccorrenze=0;
		for(int i=0; i<array.length;i++) {
			if(array[i]==element) {
				contatoreOccorrenze ++;
			}
		}
		return contatoreOccorrenze;
	}
	
	/**
	 * Finds the max number in the given array.
	 * If the array is empty, returns -1.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
	 * 
	 * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     * 
	 * @param array to search
	 * @return max number in array
	 */
	public int findMax(int[] array) {
		if(array.length<1) {
			return -1;
		}
		int max=0;
		for(int i=0; i< array.length; i++) {
			if(array[i]>=max) {
				max=array[i];
			}
		}
		return max;
	}
	
	/**
	 * Keeps track of every occurrence of the max number in the given array.
	 * Returns an ArrayList that contains every occurrence of the max number.
	 * Uses the findMax(int[] array) method.
	 * If the array is empty, returns null.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     * 
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     * 
	 * @param array to search
	 * @return ArrayList containing every instance of the max
	 */
	public ArrayList<Integer> maxArray(int[] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayAndArrayList a = new ArrayAndArrayList();
		result.add(a.findMax(array));
		return result;
	}
	
	/**
	 * Puts all of the zeros in the given array, at the end of the given array.
	 * Updates the array itself.
	 * Maintains the order of the non-zeros.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     * 
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     * 
	 * @param array to search for zeros
	 */
	public void swapZero(int[] array) {
		 int k = 0;
	        for (int i: array) {
	            if (i != 0) {
	                array[k++] = i;
	            }
	        }
	        for (int i = k; i < array.length; i++) {
	            array[i] = 0;
	        }
	}
}