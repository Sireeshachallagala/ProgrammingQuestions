import java.util.Scanner;

public class DisplayNumbers {
	public void display(int n) {
		//Display numbers until the given number
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
			System.out.println("Enter a Number");
			//Read the input from user
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			DisplayNumbers disp=new DisplayNumbers();
			disp.display(n);
	}

}
