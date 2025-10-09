package LeetCodeSlution;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

//     Given a string s, find the length of the longest substring without duplicate characters.



    public static int lengthOfLongestSubString(String s){

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        System.out.println("1.  "+s.length());
        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            System.out.println("2.  "+c);
            System.out.println("set "+set);
            while (set.contains(c)){
                System.out.println("3.  "+s.charAt(left));

                set.remove(s.charAt(left));
                left++;
                System.out.println(" left "+left);
            }

            set.add(c);
            System.out.println("4.  "+set);
            maxLength = Math.max(maxLength,right - left +1);
            System.out.println(" maxLength "+ maxLength +" right "+right +" left "+left);
            System.out.println("=========================================>");

        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "qwweretqyuiop";
        int result = lengthOfLongestSubString(s);
        System.out.println("Length of substring withut repeating character " + result );
    }
}
