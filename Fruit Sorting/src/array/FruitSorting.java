package array;
import java.util.Arrays;

//This code is for Fruit Sorting Array using For each loop

public class FruitSorting {

	public static void main(String[] args) {
		
		// array initialization and declaration
		String[] fruits= {"Kiwi","Apple","Mango","Banana","Cherry"}; 
		
		   Arrays.sort(fruits); //sorting of the string array
		   
		   //now printing the sorting of array using for each loop
		   for(String x: fruits) 
		     { 
			    System.out.println(x);//print fruits name
		     }

	}



	}


