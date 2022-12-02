import java.util.Scanner;
public class Operators {


	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int userChoice;
		
			
			int x = 1;
			int y = 3;
			int r = 12;
			int u = 5;
			
			System.out.println("Enter a random number");
			userChoice=in.nextInt();
			int answer = (userChoice - x);
			int sum1 = (answer * y);
			int sum2= (sum1 + r);
			int sum3 = (sum2 / y);
			int sum4= (sum3 + u);
			answer = (sum4 - userChoice);
			System.out.println("The answer is " + answer);
		
	}
}