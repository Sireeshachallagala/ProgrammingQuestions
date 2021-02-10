import java.util.Arrays;

public class RemoveDuplicates {
	
public int removeDup(int[] num) {
				
	int i=0;
				for(int j=1;j<num.length;j++) {
					if(num[i]!=num[j]) {
						
							i++	;		
							}
					num[i]=num[j];	
			}
	return i+1;
}
	public static void main(String[] args) {
		int[] num= {1,1,2,6,6,8,9,4};
		RemoveDuplicates dup=new RemoveDuplicates();
		int len=dup.removeDup(num);
		System.out.println(len);
	}

}
