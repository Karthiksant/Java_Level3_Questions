package Arrays;

import java.util.Arrays;

public class Median_Of_An_Array {
	public static double medianOfArray(int nums[]) {
		Arrays.sort(nums);
		int loa=nums.length;
		double median=0.0;
		String result="";
		if(loa%2==0) {
			result="even";
		}
		if(loa%2==1) {
			result="odd";
		}
		if(result.equals("even")) {
			median=(nums[(loa/2)-1]+nums[(loa/2)])/2.0;
			System.out.println(" -e "+median);
		}
		if(result.equals("odd")) {
			median=(nums[((loa+1)/2)-1]);
			System.out.println(" -od "+median);
		}
		return median;		
	}
	public static void main(String[] args) {
           int nums []= {1,2,3,4,5,6};
          
           System.out.println(medianOfArray(nums));
	}
}
