package higorn.practice;

/**
 * Created by higor on 04/04/18.
 */
public class DetectCycle {
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.getNext();
        while (slow != fast) {
            if (fast == null || fast.getNext() == null) return false;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }

    public static class Node {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
