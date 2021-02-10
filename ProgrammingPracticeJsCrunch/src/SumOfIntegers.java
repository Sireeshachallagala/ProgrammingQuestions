import java.util.Scanner;

public class SumOfIntegers {
	public void sumIntegers(int[] n) {
		int total=0;
		for(int i=0;i<n.length;i++) {
			total+=n[i];
			
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value");
		int len=scanner.nextInt();
		int[] n=new int[len];	
		for(int i=0;i<n.length;i++) {
			n[i]=scanner.nextInt();
		}
		SumOfIntegers sum=new SumOfIntegers();
		//int[] n= {7,8,9,10};
		sum.sumIntegers(n);
		
	}

}
