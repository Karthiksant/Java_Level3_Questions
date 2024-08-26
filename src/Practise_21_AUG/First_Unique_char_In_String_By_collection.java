package Practise_21_AUG;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
public class First_Unique_char_In_String_By_collection {
	public static void uniqueCharIndex(String str) {
		Map<Character,Integer> map=new HashMap<>();
		int k=0;
		for(char i:str.toCharArray()) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}else {
				map.put(i,1);
			}
		}
		for( Map.Entry<Character,Integer> entry: map.entrySet() ) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		char ch='1';
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				ch=entry.getKey();
				break;
			}
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
			String str="abdabef";
			uniqueCharIndex(str);
		
	}
}
