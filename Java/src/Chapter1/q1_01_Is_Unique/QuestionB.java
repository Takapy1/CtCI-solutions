package Chapter1.q1_01_Is_Unique;


//ビットベクトルを使用した方法
// 各ビットがすでに文字列ないに出てきたかどう化の情報を持っている。出てきていれば1でてきていなければ0
public class QuestionB {
    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
