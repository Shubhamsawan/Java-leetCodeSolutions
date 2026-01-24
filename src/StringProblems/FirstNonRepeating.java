package StringProblems;
import java.util.*;

public class FirstNonRepeating {

    public static char firstUniqueChar(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            System.out.println("map "+map);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("key : "+entry.getKey()+" entry.getValue : "+entry.getValue());
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // no unique character
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("swiss"));
    }
}
