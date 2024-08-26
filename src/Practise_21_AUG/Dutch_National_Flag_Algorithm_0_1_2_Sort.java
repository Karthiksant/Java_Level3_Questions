package Practise_21_AUG;

import java.util.HashSet;

public class Dutch_National_Flag_Algorithm_0_1_2_Sort {
    public static int [] set012(int [] nums) {
    	int low=0,
    		mid=0,
    		high=(nums.length)-1;
    	while(mid<=high) {
    		switch(nums[mid]) {
    		case 0:
    			swap(nums,low,mid);
    			// low or high
    			mid++;
    			low++;
    			break;
    		case 1:
    			mid++;
    			break;
    		case 2:
    			swap(nums, mid, high);
    			high--;
    			break;
    		}
    	} return nums; 
    }
    public static void swap(int [] nums,int i,int j) {
    	int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
    }
	public static void main(String[] args) {
		int [] nums= {1,2,0,0,1,2};
		int [] nums2=set012(nums);
		for(int i:nums2) {
			System.out.print(i+" ");
		}
	}
}
