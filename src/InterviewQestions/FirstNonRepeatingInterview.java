package InterviewQestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingInterview {

    public static char firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("swiss"));
    }
}
