package InterviewQuestion;

import java.util.Arrays;

public class PrintCompanies {

	public static void main(String[] args) {
		// 6. Declare an array variable name itCompanies and assign initial values Facebook, Google, Microsoft, Apple, IBM, Oracle and Amazon
   String arr[]= {"Facebook", "Google", "Microsoft", "Apple", "IBM", "Oracle", "Amazon"};
   System.out.println("Print all companies name"+Arrays.toString(arr));
   
   System.out.println("--------------------------------------------------------------------------");

 //  8. Print the number of companies in the array
   
   System.out.println("Total numbers Of Companies: "+arr.length);
   
   
   System.out.println("--------------------------------------------------------------------------");
// 9. Print the first company, middle and last company
 
   System.out.println("first company name is "+arr[0]);
	System.out.println("middle company name is "+ arr[arr.length/2]);
	System.out.println("last company name is "+ arr[arr.length-1]);
	
	
	System.out.println("--------------------------------------------------------------------------");
	
	//10. Print out each company

	for(String array:arr) {
		System.out.println(array);
	
		System.out.println("--------------------------------------------------------------------------");
	
	//11. Print the array like as a sentence: Facebook, Google, Microsoft, Apple, IBM,Oracle and Amazon are big IT companies.

		
		System.out.println(Arrays.toString(arr)+"are big IT companies");
		
		System.out.println("--------------------------------------------------------------------------");
		
	}
	}
	}


