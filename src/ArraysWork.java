import java.util.Arrays;
import java.util.Scanner;

public class ArraysWork {
	
	public static void sort() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		// Ask
		int userChoice;
		System.out.println("What size of array would you like?");
		
		// Minimum
		int[] array = {6,5,2,8,9,7,4,1,3};
		int min = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
			}
		}
		System.out.println("The minimum value is" + min);
		
		// Average
		double scores[] = new double[10];
		double sum = 0.0, avg = 0.0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		for(int i = 0; i < scores.length; i++) {
			scores[i] = keyboard.nextInt();
		}
		System.out.println();
		Arrays.sort(scores);
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
			avg = sum / scores.length;
		}
		System.out.println("The average of your value is" + avg);
			
			
		}
	}

//int[] list1= {6,5,2,8,9,7,4,1,3};
//Arrays.sort (list1);
//for (int i: list1);