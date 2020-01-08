package Practice;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int firstNumber=0;
		int secondNumber=1;
		
		int number=5;
		int fibonacci=0;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for (int i = firstNumber; i < number; i++) {
			
			fibonacci= firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=fibonacci;
			System.err.println(fibonacci); 
			
			
			
		}
		
	}

}
