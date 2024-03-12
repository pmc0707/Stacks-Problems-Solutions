public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    public static class Node {
        int data;
        Node next;
        int size;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {

            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
}
