package Chapter1.q1_02_Check_Permutation;

public class QuestionA {
    public static String sort_str (String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkPermutation (String str1, String str2) {
        // 文字列の長さが違うとそもそも順列になりえない
        // sortが少し時間かかることもあり、先に順列になる可能性がないものは省いておく
        if (str1.length() != str2.length()) return false;

        String sorted1 = sort_str(str1);
        String sorted2 = sort_str(str2);
        return sorted1.equals(sorted2);
    }
}
