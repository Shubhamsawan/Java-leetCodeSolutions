package StringProblems;

public class AnagramCheck {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        System.out.println(" s.toCharArray() "+s.toCharArray());
        for (char c : s.toCharArray()) {
            System.out.println("1.1 c "+c);
            count[c - 'a']++;
        }
        System.out.println(" t.toCharArray() "+t.toCharArray());

        for (char c : t.toCharArray()) {
            System.out.println("2.1 c "+c);
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}

