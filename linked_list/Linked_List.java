package linked_list;

public class Linked_List {
    public class Node {
        int data;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    // linkedlist : 100(head) -> 200 -> 300(tail) -> null
    // insertion postion: first, last or kth postiton

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

    public void addlast(int val) { // add last (tail)
        if (size == 0) {
            addFirst(val);
        } else {
            Node nn = new Node();
            nn.data = val;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    private void kthpostion(int val, int k) { // add at Kth position
        if (k == 0) {
            addFirst(val);
        } else if (k == size) {
            addlast(val);
        } else {
            Node nn = new Node();
            nn.data = val;
            Node temp = head;
            // find previous node
            for (int i = 0; i < k - 1; i++) {
                temp = temp.next; // previous node
            }
            Node temp2 = temp.next;
            temp.next = nn;
            nn.next = temp2;
            size++;
        }
    }

    public static void main(String[] args) {
        Linked_List l1 = new Linked_List();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.display();
        l1.addlast(40);
        // 30(head) -> 20 -> 10(tail) -> null

        l1.display();
        l1.kthpostion(60, 2);
        l1.display();
        l1.getfirst();
        l1.getlast();
        l1.getkth(2);
        l1.delfirst();
        l1.display();
        l1.dellast();
        l1.display();
        l1.delkth(1);
        l1.display();

    }

    private void delkth(int k) {
        Node temp = head;
            // find previous node
            for (int i = 0; i < k - 1; i++) {
                temp = temp.next; // previous node
            }
            temp.next = temp.next.next;
            size--;
    }

    // delete value at last position
    private void dellast() {
        if (size == 0) {
            return;
        } else if (head.next == null) {
            return;
        } else {
            Node current = head;
            Node pre = null;
            while (current.next != null) {
                pre = current;
                current = current.next;
            }
            pre.next = null;
            size--;

        }
    }

    // delete value at first position
    private void delfirst() {
        head = head.next;
        size--;
    }

    // get value at Kth position
    private void getkth(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // get value at last position
    private void getlast() {
        System.out.println(tail.data);
    }

    // get value at first position
    private void getfirst() {
        System.out.println(head.data);
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
