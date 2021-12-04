package Chapter1.q1_06_String_Compression;

public class MySolutionA {
    public static String compress(String str) {
        if (isUniqueChars(str)) return str;

        StringBuilder sb = new StringBuilder();
        int earlier = 1;
        int later = 0;
        while (earlier < str.length()) {
            if (str.charAt(earlier) != str.charAt(later)) {
                sb.append(str.charAt(later));
//                sb.append(String.valueOf(earlier - later));
                sb.append(earlier - later); //自動変換してくれる
                later = earlier;
            }
            earlier++;
        }
        sb.append(str.charAt(later));
        sb.append(String.valueOf(earlier - later));
        return sb.toString();
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 26) { // Only 26 characters
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main (String[] args) {
        String[] strs = { "aabcccccaaa", "aaaffffeeewwsvvsss", "abcd" };
        for (String str : strs) {
            System.out.println(compress(str));
        }
    }
}
