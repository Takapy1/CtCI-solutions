package Chapter2.q2_01_Remove_Dups;

public class AnswerA {
//    public boolean oneEditAway(String first, String second) {
//        if (first.length() == second.length()) { // 置換で可能かどうか
//            //　使われている文字の種類の差が1種類
//            return oneEditReplace(first, second);
//        } else if (first.length() + 1 == second.length()) { // 挿入削除が可能か（挿入だけの関数作って、引数を逆にする
//            //使われている文字の種類の差が1つならいける
//            return oneEditInsert(first, second);
//        } else if (first.length() - 1 == second.length()) {
//            return oneEditInsert(second, first);
//        }
//        return false;
//    }
//
//    public static boolean oneEditReplace(String s1, String s2) {
//        boolean foundDifference = false;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                if (foundDifference) {
//                    return false;
//                }
//                return true;
//            }
//        }
//        return true;
//    }
//
//    public static boolean oneEditInsert(String s1, String s2) {
//
//    }
}
