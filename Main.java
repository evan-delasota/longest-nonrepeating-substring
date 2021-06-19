import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    System.out.println(longestSubstring("abcabcbb"));
  }

  public static int longestSubstring(String s) {
    if (s.length() <= 1) {
            return s.length();
        }
        
        Map<Character, Integer> charIndex = new HashMap<>();
        int slider = 0;
        int maxSubstringLength = 0;
        
        for (int i = 0, j = 0; j < s.length(); ++j) {
            char c = s.charAt(j);
            if (charIndex.containsKey(c)) {
                i = Math.max(charIndex.get(c), i);
            }
            maxSubstringLength = Math.max(maxSubstringLength, j - i + 1);
            charIndex.put(c, j + 1);
        }
        
        return maxSubstringLength;
  }
}