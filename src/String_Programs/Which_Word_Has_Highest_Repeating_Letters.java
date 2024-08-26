package String_Programs;
public class Which_Word_Has_Highest_Repeating_Letters {
	public static int countingRepeatedLetters(String name) {
		int los=name.length();
		int maxCount=0;
		int count=0;
		// if count=0; magic 
		for(char ch='a';ch<='z';ch++) {	
			// if count=0; magic 
			for(int i=0;i<los;i++) {
				char ch2=name.charAt(i);
				if(ch==ch2) {
					count++;
				}
			}
			maxCount=Math.max(maxCount, count);
		}
		return maxCount;
	}
	public static void main(String[] args) {
		String input="hello aabbcc karra iiss myyyy";
		String [] words=input.split(" ");
		int maxValue=0;
		String resultWord="---";
		for(String i:words) {
			int countOfEachWord=countingRepeatedLetters(i);
			if(countOfEachWord>maxValue) {
				maxValue=countOfEachWord;
				resultWord=i;
			}
		}
		System.out.println(resultWord);
	}
}
