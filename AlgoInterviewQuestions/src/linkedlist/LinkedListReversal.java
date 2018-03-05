package linkedlist;

/**
 * Created by himu on 3/6/2018.
 */
public class LinkedListReversal {

    public static void main(String[] args) {
        LinkedListReversal linkedListReversal = new LinkedListReversal();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode reveresedIteratevly = linkedListReversal.reverseRecursively(node1);

        while(reveresedIteratevly != null){
            System.out.println(reveresedIteratevly.data);
            reveresedIteratevly = reveresedIteratevly.next;
        }

    }


    public ListNode reverseIteratively(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode current = head;
        ListNode next = current.next;

        current.next = null;

        while (next != null) {

            ListNode temp = next.next;
            next.next = current;
            current = next;
            next = temp;

        }
        return current;
    }

    public ListNode reverseRecursively(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode reversedRemaining = reverseRecursively(head.next);
        ListNode current = reversedRemaining;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head.next = null;
        return reversedRemaining;
    }
}
