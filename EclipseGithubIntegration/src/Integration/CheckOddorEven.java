package Integration;
import java.util.Scanner;
/*Check odd or Even Numbers*/
public class CheckOddorEven {
	/*An even number is a number that can be divided into two equal groups.An odd number is a number that cannot be divided into two equal groups.*/
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
