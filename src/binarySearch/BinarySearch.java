package binarySearch;

import java.util.Arrays; 

public class BinarySearch {
	
	public int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,1,21,3,1,4,15,16,17,18,19,20}; 
	
	/**
	 * @param num
	 * @param key
	 * 
	 * Function searches sorted array of integers, finding the specific number (key)
	 * 
	 */
	public int performSearch(int[] num, int key){
		System.out.println("num length"+ num.length); 
		if(num.length == 0){
			System.out.println("Array empty"); 
			return 0; 
		}else{
			int mid; 
			int number=0; 
			mid = (num.length)/2; 
			if(num[mid] == key){
				number =  num[mid]; 
				System.out.println("found" + number); 
				return number; 
			}else if((key < num[mid]) && num.length > 1){
				num = Arrays.copyOfRange(num, 0, mid); 
				System.out.println("Low Range: " + Arrays.toString(num)); 
				return performSearch(num, key); 
			}else if((key > num[mid]) && num.length > 1){
				num = Arrays.copyOfRange(num, mid, num.length); 
				System.out.println("High Range: " + Arrays.toString(num)); 
				return performSearch(num, key); 
			}else{
				System.out.println("Number does not exist in array."); 
				return 0; 
			}
			//return number; 
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int key = 16; 
		BinarySearch bs = new BinarySearch(); 
		int index = bs.performSearch(bs.numbers, key); 
		System.out.println("Number found at index: " + index);
	}

}
