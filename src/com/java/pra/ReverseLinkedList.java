/*
public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    */
/*public class ReverseLinkedList {
        public static void main(String[] args) {
            // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            System.out.println("Original list:");
            printLinkedList(head);

            // Reverse the linked list
            ListNode reversedHead = reverseLinkedList(head, null);

            System.out.println("Reversed list:");
            printLinkedList(reversedHead);
        }*//*


        public static ListNode reverseLinkedList(ListNode curr, ListNode prev) {
            if (curr == null) {
                return prev; // Return the new head of the reversed list
            }

            ListNode nextTemp = curr.next; // Store the next node
            curr.next = prev; // Reverse the current node's pointer
            return reverseLinkedList(nextTemp, curr); // Recursively reverse the rest of the list
        }

        public static void printLinkedList(ListNode head) {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

}
*/
