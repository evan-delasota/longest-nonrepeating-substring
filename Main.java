import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    System.out.println(longestSubstring("abcabcbbcxzghyu"));
  }

  public static int longestSubstring(String s) {
    if (s.length() <= 1) {
            return s.length();
        }
        
        Map<Character, Integer> charIndex = new HashMap<>();
        int maxSubstringLength = 0;
        
        for (int leftSlider = 0, rightSlider = 0; rightSlider < s.length(); ++rightSlider) {
          char ch = s.charAt(rightSlider);
          if (charIndex.containsKey(ch)) {
            leftSlider = Math.max(charIndex.get(ch), leftSlider);
          }
          maxSubstringLength = Math.max(maxSubstringLength, rightSlider - leftSlider + 1);
          charIndex.put(ch, rightSlider + 1);

        }
        
        return maxSubstringLength;
  }
}