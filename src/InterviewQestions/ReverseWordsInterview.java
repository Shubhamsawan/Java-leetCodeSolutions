package InterviewQestions;

public class ReverseWordsInterview {

    public static String reverString(String s) {

        String[] word = s.trim().split("\\s+");
        StringBuilder results = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            results.append(word[i]).append(" ");
        }

        return results.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverString("Java is backend"));
    }

}
