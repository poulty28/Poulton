// Mark Poulton 08/14/2019 - Create a Singleton object that calculates the nth prime number.
import java.util.Scanner;  //import Scanner Class from java.util package
public class NthPrimeNum {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number to compute the nth prime number: "); //input number from user
	    int nth = sc.nextInt(); 
	    int num, count, i;
	    num=1;
	    count=0;
	 
	    while (count < nth){
	      num=num+1;
	      for (i = 2; i <= num; i++){ //Loop from 2 to num
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){//check for prime number
	        count = count+1;
	      }
	    }
	    System.out.println("Value of nth prime number is: " + num);
	  }
}
