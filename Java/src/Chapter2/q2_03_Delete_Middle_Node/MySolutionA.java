package Chapter2.q2_03_Delete_Middle_Node;

import CtCILibrary.LinkedListNode;

import java.util.LinkedList;

public class MySolutionA {
    // deleteするノードが引数
    public static boolean deleteMiddleNode(LinkedListNode linkedListNode) {
        if (linkedListNode == null || linkedListNode.next == null) {  //先頭または末尾の時
            return false;
        }
        LinkedListNode next = linkedListNode.next;
        linkedListNode.data = next.data;
        linkedListNode.next = next.next;
        return true;
    }
}
