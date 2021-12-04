package Chapter2.q2_02_Return_Kth_To_Last;

/*
単方向リストなので逆から数えて戻ることはできない
方法１
    １回末尾まで探索しノード数を数え、2回目に(ノード数ーk番目）の要素を返す

方法２
    ポインタを二つ使用する一つのポインタは先頭からスタート、もう一つは先頭からk番目のインデックスからスタート
    先をすすむポインタが末尾に到着すると、後ろのポインタとの差がkなのでその要素が答え
* */

class Node {
    int data;
    Node next = null;

    // 解法３でやっている
    public Node returnKthToLast(int k, Node head) {
        Node later = head;
        // earlier を先にk個進めておく
        Node earlier = head;
        for (int i = 0; i < k; i++) {
            if (earlier == null) return null; //範囲外の確認をしないといけない！！！
            earlier = earlier.next;
        }

        while (earlier.next != null) {
            earlier = earlier.next;
            later = later.next;
        }

        return later;
    }
}


public class MySolutionA {
    public static void main(String[] args) {

    }
}
