import java.util.Random;
import java.util.Scanner;

public class FirstProject {
	
	public static int max;
	public static int min;
	public static int numBetween;
	public static int[] randomNums;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please put two integer numbers(smaller number first, and the bigger number): ");
		System.out.println("Small int: ");
		min = input.nextInt();
		System.out.println("Bigger int: ");
		max = input.nextInt();
		
		while (min > max) {
			System.out.println("Smaller number first!");
			System.out.println("Please put them again!");
			System.out.println("Small int: ");
			min = input.nextInt();
			System.out.println("Bigger int: ");
			max = input.nextInt();
		}
		
		System.out.println("How many number do you want to get between these two numbers?: ");
		
		numBetween = input.nextInt();
		while (numBetween > ((max-min) - 1)) {
			System.out.println("Can't not be more than the total number between these two numbers");
			System.out.println("Please insert again: ");
			numBetween = input.nextInt();
		}
		
		getRandomNums(numBetween);			
		for (int x: randomNums) {
			System.out.println(x);
		}
	}
	

	
	public static void getRandomNums(int number) {
		
		Random a = new Random();
		randomNums = new int[number];
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = a.nextInt((max - min) -1) + (min + 1);
		}
	}
	
	
}
