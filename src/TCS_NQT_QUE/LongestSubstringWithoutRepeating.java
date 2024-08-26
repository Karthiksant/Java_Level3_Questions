package TCS_NQT_QUE;
import java.util.HashSet;
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
 // right- left cause it adds and deletes 1 index to right
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "123abcABC";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s1)); // Output: 3
        
        String s2 = "abcabcabc";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s2)); // Output: 3
    }
}
