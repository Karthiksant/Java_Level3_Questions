package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class finding_repeating_non_repeating_elements {
	public static ArrayList<Integer> removeDuplicates(int nums[]) {
		int loa=nums.length;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<loa;i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==1) {	
				al.add(nums[i]);
			}
		}return al;
	}
	public static Set<Integer> removeDuplicates2(int nums[]) {
		int loa=nums.length;
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<loa;i++) {
			set.add(nums[i]);
		} return set;
	}
	public static void main(String[] args) {
			int nums []= {2,3,3,5,6,6};
			ArrayList<Integer> al=removeDuplicates(nums);
			Set <Integer> set=removeDuplicates2(nums);
			
			for(Integer i:al) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(Integer i:set) {
				System.out.print(i+" ");
			}
	}

}
