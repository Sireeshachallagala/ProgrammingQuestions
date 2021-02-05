import java.util.Arrays;

public class MoveZeroesToEnd {
	public static void moveZeroes(int arr[]) {
		int len=arr.length;
		int last=len-1;
		//int max=arr[0];
		for(int i=0;i<len;i++) {
			if(i!=last && arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;				
			}
			if(arr[i]==0) {
				int temp=arr[last];
				arr[last]=arr[i];
				arr[i]=temp;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int a[]= {0,1,0,3,12};
		moveZeroes(a);

	}

}
