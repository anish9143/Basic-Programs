package Practice;

public class Prime {
	
	
	public static void main(String[] args) {
		
		boolean isPrime=true;
		int num=15 ;
		
		if (num<=1) {
			isPrime=false;
			
		}
		
		for (int i = 2; i<=num/2; i++) {
			if (num%i==0) {
				isPrime=false;
				break;
			}
			isPrime=true;
			
		}
		
		if (isPrime==true) {
			System.out.println(num+" is prime");
		} else {
			System.out.println(num+" is Not prime");
		}
		
		
	}

}
