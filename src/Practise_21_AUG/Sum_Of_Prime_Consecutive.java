package Practise_21_AUG;

import java.util.LinkedList;
import java.util.List;
public class Sum_Of_Prime_Consecutive {
	public static void sumOfConsecutivePrime(int start,int end) {
		List<Integer> list=new LinkedList<>();
		for(int i=start;i<=end;i++) {
			int count=0;
			int num=i;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			}if(count==2) {
				list.add(num);
			}
		}
		for(int i=0;i<list.size();i++) {
			int num=list.get(i);
			int sum2=0;
			for(int j=0;j<i;j++) {
			  sum2=sum2+list.get(j);
			  if(sum2==num) {
					System.out.println(num+ " is consec");					
				}
		   }
		}
	}
	public static void main(String[] args) {
		sumOfConsecutivePrime(1, 100);
	}
}