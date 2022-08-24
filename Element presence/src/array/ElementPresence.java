package array;

public class ElementPresence {
	
	//This program is to  find that element 100 position in an array

	public static void main(String[] args) {
		
		
				int array[]= {75,4,56,5,36,100,77,18,29,94}; //initialization and declaration of array.
				
				//Using for loop
				
			    for(int i=0;i<array.length;i++)
			    {
			    	if(array[i]==100) //condition for checking 100 is available or not 
			    	{
			    		System.out.print("Position of 100 is "+i); //print the position of element 100 
			    	}
			    }

			}

	}


