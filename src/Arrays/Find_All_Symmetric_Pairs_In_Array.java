package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Find_All_Symmetric_Pairs_In_Array {
	public static Map<Integer,Integer> symmetricPairs(int [][] array) {		
		int loa=array.length;
		Map<Integer,Integer> map=new HashMap<>();
		Map<Integer,Integer> map2=new HashMap<>();
		for(int i=0;i<loa;i++) {
			int num1=array[i][0];
			int num2=array[i][1];
			if(map.containsKey(num2)&&map.get(num2)==num1) {
				map2.put(num1,num2);
			}else {
				map.put(num1,num2);
			}
		}	return map2;	
	}
	public static void main(String[] args) {
		int [][] nums= {{1,2},{2,3},{2,1},{3,4},{3,2}};
		Map<Integer, Integer> map=symmetricPairs(nums);
		map.forEach((key,value)-> System.out.println("{"+key+" "+value+" }"));
	}
}
