package InterviewQestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsInterview {

    public static List<List<String>> groupAnagrams(String[] strs){

        HashMap<String,List<String>> maps = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            maps.putIfAbsent(key, new ArrayList<>());
            maps.get(key).add(word);
        }
        return new ArrayList<>(maps.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
