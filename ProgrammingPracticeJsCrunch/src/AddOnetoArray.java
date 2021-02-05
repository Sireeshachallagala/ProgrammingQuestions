import java.util.Arrays;

public class AddOnetoArray {
	static void plusOne(int arr[]) {
		//convert array to String 
		String num =Arrays.toString(arr);
		//remove comma,square brackets from String
		String x=num.replace(", ","").replace("[","").replace("]","");
		//Now convert string to a number
		int conString=Integer.parseInt(x);
		//add one to the number we got
		int add=conString+1;
		//Again convert number to string
		String temp=Integer.toString(add);
		//create an array of int to place each character from string
		int newArr[]=new int[temp.length()];
		for(int i=0;i<temp.length();i++)
		{
			//System.out.println(temp.charAt(i));
			newArr[i]=temp.charAt(i) - '0';
			//System.out.println(newArr[i]);
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}

	public static void main(String[] args) {
		int a[]= {4,6,2};
		plusOne(a);

	}

}
