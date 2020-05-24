package Integration;
import java.util.Scanner;

public class CheckOddorEven {
	/*Odd numbers are numbers that cannot be divided by 2. To identify a number as odd or even, we will look at their end number. If the number ends in a 0, 2, 4, 6, or 8, then it is even. If the number ends in a 1, 3, 5, 7, or 9, then it is odd.Aug 2, 2015*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");

	}

}
