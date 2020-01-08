package Practice;

public class NumReverse {

	public static void main(String[] args) {
		
		
		int num=111;
		int rev=0;
		int sum=0;
		int temp=num;
		
		while (num!=0) {
			rev=num%10;// modulus gives remainder
			num=num/10;// div gives quotient
			sum=sum*10+rev;
		}
		
		System.out.println("reverse of"+ temp +" is "+sum);
		
		if (temp==sum) {
			System.err.println("Number is palindrome");
		} else {
			System.err.println("Number is not palindrome");
		}

	}

}
