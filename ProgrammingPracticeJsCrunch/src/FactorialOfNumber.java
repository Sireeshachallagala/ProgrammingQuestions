import java.util.Scanner;

public class FactorialOfNumber {
 public void factorial(int n) {
	 int prod=1;
	 for(int i=1;i<=n;i++) {
		 prod=prod*i;
		
	 }
	 System.out.println(prod);
 }
	public static void main(String[] args) {
		System.out.println("Enter a number");
		//Read the input from User
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		FactorialOfNumber fac=new FactorialOfNumber();
		fac.factorial(n);
	}

}
