package linked_list;

public class palindrome_linkedlist_234 {
    public class Node {
        int data;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    public void addFirst(int val) { // add first (head)
        Node nn = new Node();
        nn.data = val;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void palidrome(){
        // Node temp1 = head;
        // Node temp2 = tail;
    }

    
    public static void main(String[] args) {
        Linked_List l2 = new Linked_List();
        l2.addFirst(10);
        l2.addFirst(20);
        l2.addFirst(30);
        l2.display();
        // l2.palindrome();
    }
    // Display linkedlist
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
        // System.out.println(size);
    }
}
