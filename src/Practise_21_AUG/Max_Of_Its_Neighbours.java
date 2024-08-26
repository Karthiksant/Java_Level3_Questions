package Practise_21_AUG;

public class Max_Of_Its_Neighbours {

	public static void main(String[] args) {
		int [] nums= {1,4,3,4,7,6};
		for(int i=1;i<nums.length-1;i++) {
			if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]) {
				System.out.println(" max neighbour is = "+nums[i]+" index is = "+i);
			}
		}
	}

}
