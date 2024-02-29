package TEST_3;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
       ListNode prev =null;
       while(head !=null){
           ListNode next_node = head.next;
           head.next = prev;
           prev =head;
           head = next_node;
       }
       return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test cases
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Input: ");
        printList(head1);
        ListNode reversed1 = reverseList(head1);
        System.out.print("Output: ");
        printList(reversed1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.print("\nInput: ");
        printList(head2);
        ListNode reversed2 = reverseList(head2);
        System.out.print("Output: ");
        printList(reversed2);

        ListNode head3 = null;

        System.out.print("\nInput: ");
        printList(head3);
        ListNode reversed3 = reverseList(head3);
        System.out.print("Output: ");
        printList(reversed3);
    }
}