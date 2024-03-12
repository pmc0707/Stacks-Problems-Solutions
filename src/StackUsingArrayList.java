import java.util.ArrayList;

public class StackUsingArrayList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!Stack.isEmpty()) {
            System.out.println(stack.peek());

            stack.pop();
        }
    }

    public static class Stack {
        static ArrayList<Integer> arrayList = new ArrayList<>();

        public static boolean isEmpty() {
            return arrayList.size() == 0;
        }

        public void push(int data) {
            arrayList.add(data);
        }

        public int pop() {
            int top = arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            return top;
        }

        public int peek() {
            return arrayList.get(arrayList.size() - 1);
        }
    }
}
