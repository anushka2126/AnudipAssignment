package array;
import java.util.Arrays;
 //Program to find second largest number in an given array
public class SecondLargestNumber {

	public static void main(String[] args) {
		
		//initialization and declaration of array.		
int array[]= {75,4,56,5,36,100,77,18,29,94}; 
		
		//Sorting of an array using a sort() method 
		Arrays.sort(array);   //sorting array elements in ascending order
		
		// To print the second largest element of an array
		System.out.print("Second largest element in an array: ");
		System.out.println(array[array.length-3]); //index for second largest element after sorting
		
		
	}



	}


