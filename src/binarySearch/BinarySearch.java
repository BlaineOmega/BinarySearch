package binarySearch;

import java.util.Arrays; 

public class BinarySearch {
	
	public int[] numbers = new int[] {1,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20}; 
	
	/**
	 * @param num
	 * @param key
	 * 
	 * Function recursively searches sorted array of integers, finding the specific number (key).
	 * Search looks at the midpoint of array, checking to see if midpoint is number being sought,
	 * if not, depending of whether the sought number is greater than, or less than, the midpoint
	 * the function copies the upper, or lower, half of the array and passes it into a recursive 
	 * function call.
	 * 
	 */
	public int performSearch(int[] num, int key, int low, int high){
		if(num.length == 0){
			System.out.println("Array empty"); 
			return -1; 
		}else if((key < num[0])|| (key > num[num.length-1])){
			System.out.println("Number not in bounds of array.");
			return -1; 
		}else if (low <= high){
		
			int mid; 
			mid = (low + high)/2; 
			if(key < num[mid]){
				high = mid - 1; 
				return performSearch(num, key, low, high); 
			}else if(key > num[mid]){
				low = mid + 1; 
				return performSearch(num, key, low, high); 
			}else{
				
				System.out.println("Found the number in the array at index: " + mid); 
				return mid; 
			}
		}else {
			System.out.println("Number not in array."); 
			return -1; 
			//return number; 
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int key = 14; 
		BinarySearch bs = new BinarySearch(); 
		int low = 0; 
		int high = bs.numbers.length; 
		bs.performSearch(bs.numbers, key, low, high); 
		
	}

}
