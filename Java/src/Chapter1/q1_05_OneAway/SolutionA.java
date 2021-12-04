package Chapter1.q1_05_OneAway;

public class SolutionA {

//    //二つの文字列の差の絶対値がない時、置換をみる。あるとき挿入削除をみる
//    public static boolean isSameByOneEdit(String s1, String s2) {
//        if (s1.equals(s2)) return true;
//        if (Math.abs(s1.length() - s2.length()) > 1) return false;
//
//        if (s1.length() == s2.length()) { // 置換で可能かどうか
//            //　使われている文字の種類の差が1種類
//            return oneEditReplace(s1, s2);
//        } else if (s1.length() + 1 == s2.length()) { // 挿入削除が可能かどうか
//            //使われている文字の種類の差が1つならいける
//            return oneEditInsert(s1, s2);
//        } else if (s1.length() - 1 == s2.length()) {
//            return oneEditInsert(s2, s1);
//        }
//
//        return true; //　not conplete
//    }
//
//    public static boolean oneEditReplace (String s1, String s2) {
//        char[] arr_str1 = s1.toCharArray();
//        char[] arr_str2 = s2.toCharArray();
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (arr_str1[i] != arr_str2[i]) {
//                count++;
//            }
//        }
//        if (count <= 1) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//
//    //挿入削除できるか確認
////    public static boolean oneEditInsert(String s1, String s2) {
////
////    }
////
////    public static void main(String[] args) {
////
////    }
}
