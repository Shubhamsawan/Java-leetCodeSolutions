package HashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void freqCount(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entrySet:map.entrySet()){
            System.out.println(entrySet.getKey()+"<->"+entrySet.getValue());
        }
    }

    public static void main(String[] args) {
        freqCount("banana");
    }
}
