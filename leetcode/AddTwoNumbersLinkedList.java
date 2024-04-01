package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbersLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next;
    }
    
    // Example usage:
    public static void main(String[] args) {
        AddTwoNumbersLinkedList solution = new AddTwoNumbersLinkedList();

        // Creating linked lists
        // 2 -> 4 -> 3
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(9);
        // l1.next.next = new ListNode(3);

        // 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        // l2.next.next = new ListNode(4);

        // Adding two linked lists
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Printing the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
