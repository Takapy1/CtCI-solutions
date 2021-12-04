package Chapter2.Overview;

// 単方向リストの実装
public class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (next != null) {
            next = n.next;
        }
        n.next = end;
    }

    // ノードの削除
}
