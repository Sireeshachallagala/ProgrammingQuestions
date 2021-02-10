import java.util.Scanner;

public class FirstBigSecongBigThirdBig {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//Atleast three elements should present
				if(n<3) {
					System.out.println("Invalid input.Atleast three elements should be there");
					return;
				}
		int[] num=new int[n];
		int max=num[0];
		int min=num[0];
		int sec=num[0];
		for(int i=0;i<n;i++) {
		num[i]=scan.nextInt();
		
		// If current element is greater than max
		if(num[i]>max) {
			min=sec;
			sec=max;
			max=num[i];
		}// If current element is greater than sec
		else if(num[i]>sec) {
			min=sec;
			sec=num[i];
		}// If current element is greater than min
    		else if(num[i]>min) {
			min=num[i];
		}
				}
		System.out.println("First Big number is "+max);
		System.out.println("Second Big number is "+sec);
		System.out.println("Third Big number is "+min);
	}

}
