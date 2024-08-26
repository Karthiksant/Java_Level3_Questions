package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Replacing_Each_Element_By_Its_Rank {
	public static 	int []  rankingReplacement(int [] nums) {
		int [] nums2={20,20,10,50,40};	
		Arrays.sort(nums);
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int k=1;
		for(int i:nums) {
			map.put(i,k++);
		}
		for(int i=0;i<nums2.length;i++) {			
			nums2[i]=map.get(nums2[i]);
		}
		return nums2;
	}	
	public static void main(String[] args) {
		int [] nums= {20,10,50,40};
		int [] nums2=rankingReplacement(nums);
		for(int i:nums2) {
			System.out.print(i+" ");
		}
	}
}
