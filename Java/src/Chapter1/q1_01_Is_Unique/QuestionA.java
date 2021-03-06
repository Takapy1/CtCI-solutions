package Chapter1.q1_01_Is_Unique;

public class QuestionA {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) return false; //すでにtrueの場合はUniqueじゃないのでfalse
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abcde", "hello", "cat", "normal", "panda" };
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }
}
