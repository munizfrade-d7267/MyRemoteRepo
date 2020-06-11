 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();

	  
	  myTestMethod();
	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }


	   
	      
	       public static void myTestMethod(){

	    	   String dateFormat = "yyyy-MM-dd HH:mm";
	    	   java.time.format.DateTimeFormatter form = java.time.format.DateTimeFormatter.ofPattern(dateFormat);
	    	   System.out.println("Today's Date and Time is: ");
	    	   System.out.println(form.format(java.time.LocalDateTime.now()));

		   }
	 
	   

}
