import java.util.Arrays;

public class MoveZeroesToEnd {
	public static void moveZeroes(int arr[]) {
		//Find the length of an array
		int len=arr.length;
		//take a count variable
		int count=0;
		for(int i=0;i<len;i++) {
			//move all non zero elements to front                                                                                                     bbbbbbbbbbbbbbbbbb
			if(arr[i]> 0) {
				arr[count++]=arr[i];
			}
			
		}
		while(count<len) {
			arr[count++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int a[]= {5,0,1,6,0,12};
		moveZeroes(a);

	}

}
