import java.util.Scanner;

public class Third_Operater {
	
	public static double firstNum;
	public static double secondNum;
	public static String operater;
	public static double result;
	public static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Please give me two numbers and one operater.");
		System.out.println("First Number: ");
		String fakeNum1 = input.nextLine();
		
		while (!numberOrNot(fakeNum1)) {
			System.out.println("Please only put digit.");
			fakeNum1 = input.nextLine();
		}		
		firstNum = Double.parseDouble(fakeNum1);
		
		
		System.out.println("Second Number: ");
		String fakeNum2 = input.nextLine();
		
		while(!numberOrNot(fakeNum2)) {
			System.out.println("Please only put digit.");
			fakeNum2 = input.nextLine();
		}
		secondNum = Double.parseDouble(fakeNum2);
		
		
		System.out.println("Operater: ");
		
		operater = input.next();
		while (!isOperater(operater)) {
			System.out.println("Please only give one out of \"+, -, *, /\".");
			operater = input.next();
		}
		
		calculator(firstNum, operater, secondNum);
		
		System.out.println("The result of your first number " + operater + " your second number is: " + result);
		
	}
	
	//Checking is the input are digits.
	public static boolean numberOrNot(String fakeNumber) {
		try 
		{
			Double.parseDouble(fakeNumber);
			return true;
		}
		catch (Exception E) 
		{
			return false;
		}
	}
	
	//Checking if it's a operator.
	public static boolean isOperater(String operater) {
		if (operater.equals("+") || operater.equals("-") || operater.equals("*") || operater.equals("/")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//calculate the result with "switch" and return value to "result". 
	public static void calculator(double num1, String operater, double num2) {
		
		switch (operater) {
		
		case("+"):
			result = num1 + num2;
			break;
		
		case("-"):
			result = num1 - num2;
			break;
			
		case("*"):
			result = num1 * num2;
			break;
			
		case("/"):
			result = num1 / num2;
			break;
		}	
	}
	
}

  