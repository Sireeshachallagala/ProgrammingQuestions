import java.util.Arrays;

public class LengthOfConsecutiveElements {
	public static void lengthOfConsecutive(int[] a) {
		int len= a.length;
		int count=1;
		for(int i=0;i<len;i++) {
			//First sort the given array
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				int diff=a[j]-a[i];
				if(diff == 1) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int arr[]= {2,4,8,9};
		lengthOfConsecutive(arr);
	}

}
