package TCS_NQT_QUE;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueCharacterInString {
	public static int indexOfUniqueChar(String name) {
		char [] array=name.toCharArray();
		int index=0;
		Map<Character,Integer> charMap=new HashMap<>();
		for(char ch:array) {
			charMap.put(ch,charMap.getOrDefault(ch,0)+1);
		}
		for(int i=0;i<name.length();i++) {
			if(charMap.get(name.charAt(i))==1) {
				index=i;
				break;
			}
			else {index=-1;}
		} return index;
	}
	public static void main(String[] args) {		
		String name="karthikarthik";		
		int index=indexOfUniqueChar(name);
		if (index>-1) {
			System.out.println("character is ="+name.charAt(index)+" index is ="+index);
		} else {
			System.out.println("no unique character");
		}
	}

}
