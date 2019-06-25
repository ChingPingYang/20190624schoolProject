import java.util.Scanner;
import java.util.ArrayList;
public class Second_PrimNumber {

	public static int userNum;
	public static ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		System.out.println("Pleae put a prime number: ");
		Scanner input = new Scanner(System.in);
		userNum = input.nextInt();
		
		//Checking if the first input number is a prime number.
		while(!checkIfIsPrime(userNum)) {
			System.out.println("This number is not a prime number.\n Please try again: ");
			userNum = input.nextInt();
		}
		
		//If the input is prime. Then put all the prime number before it inside an ArrayList.
		for (int j = 2; j <= userNum; j++) {
			if (checkIfIsPrime(j)) {

				listOfPrimes.add(j);
			}
		}
		
		System.out.println("Blow, are all prime numbers before your number(include your number).");
		
		//This is an Enhanced for loop for printing numbers from ArrayList.
		for(int x: listOfPrimes) {
			System.out.println(x);
		}

	}
	
	
	
	//Method for checking if the number is a prime number.
	public static boolean checkIfIsPrime(int number) {
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
