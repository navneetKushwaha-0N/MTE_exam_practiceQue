package interSectionOfTwoLinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class intersection {
    public static Node nthNode(Node head, int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) return null;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(156);
        Node d = new Node(45);

        a.next = b;
        b.next = c;
        c.next = d;

        Node q = nthNode(a, 2);
        if (q != null) {
            System.out.println(q.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
