package TCS_NQT_QUE;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class removing_Duplicates_By_Collections {
	
	public static void removeDuplicates(String name) {
		char [] charArray=name.toCharArray();
		Map<Integer,Character> mapValues=new TreeMap<>();
		for(int i=0;i<charArray.length;i++) {
			mapValues.put(i,charArray[i]);
		}	
		System.out.println(mapValues.toString());
		for(int i=0;i<mapValues.size();i++) {
			System.out.println(mapValues.get(i));
		}
	}
	public static void main(String[] args) {
		removeDuplicates("aabcc");

	}

}
