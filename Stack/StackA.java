public class StackA {

    public static class Stack {
        int maxSize;
        int top;
        int[] stack;

        public Stack(int size) {
            maxSize = size;
            stack = new int[size];
            top = -1;
        }

        // Push
        public void push(int data) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow");
            } else {
                top++;
                stack[top] = data;
                // System.out.println("Added " + data);
            }
        }

        // Push element to bottom
        public void pushBottom(int data) {
            if (top == -1) {
                push(data);
                return;
            }
            int temp = pop();
            pushBottom(data);
            push(temp);
        }

        // Pop
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int item = stack[top];
                top--;
                return item;
            }
        }

        // Peek
        public int peek() {
            if (top >= 0) {
                return stack[top];
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        // Display
        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

        // Reverse
        public void reverse() {
            if (top == -1) {
                return;
            }
            int temp = pop();
            reverse();
            pushBottom(temp);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);

        // System.out.println("Original stack:");
        s.display();

        // s.reverse();                            

        // System.out.println("\nReversed stack:");
        // s.display();
    }
}
