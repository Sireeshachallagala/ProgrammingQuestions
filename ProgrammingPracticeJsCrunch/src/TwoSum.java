import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TwoSum {
	public int[] twoSum(int[] num,int target) {
		int len=num.length;
		//List<Integer> li=new ArrayList<Integer>();
		
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				//int res=num[i]+num[j];
				if (num[j]==target-num[i]) {
					//li.add(i);
					//li.add(j);
					//System.out.println(li);
					return new int[] {i,j};
				}
			}
		}
		
		//Integer[] res=li.toArray(new Integer[li.size()]);
		//System.out.println(Arrays.toString(res));
		//int[] array=li.stream().mapToInt(Integer::intValue).toArray();
		//return li;
		 throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		
		int num[]= {3,2,6,9};
		int target=12;
		TwoSum sum=new TwoSum();
		//System.out.println(sum.twoSum(num, target));
		sum.twoSum(num, target);

	}

}
