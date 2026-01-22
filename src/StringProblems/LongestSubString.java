package StringProblems;

import java.util.HashSet;

//Find the length of the longest substring without repeating characters.
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            // Remove characters until duplicate is gone
            System.out.println(" s.charAt(right) ---> <"+s.charAt(right)+"> s.charAt(left) <"+s.charAt(left)+">");
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            System.out.println(" set===> "+set);
            System.out.println(" maxLen "+maxLen+" left "+left+" right "+right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
