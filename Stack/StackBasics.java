public class StackBasics {

    public static class Stack {
        int maxSize;
        int top;
        int[] stack;

        Stack(int size) {
            maxSize = size;
            top = -1;
            stack = new int[maxSize];
        }


        //push
        public void push(int data) {
            if( top == maxSize - 1) {
                System.out.println("Stack is OverFlow");
            }
            top++;
            stack[top] = data;
        }

        //pop
        public int  pop(){
            if( top == -1 ) {
                System.out.println("Stack is UnderFlow");
            }
            int item = stack[top];
            top--;
            return item;
        }

        //peek
        public int peek() {
            if( top == -1 ) {
                System.out.println("Stack is UnderFlow");
            }
            int item = stack[top];
            return item;
        }

        //isEmpty
        public int  isEmpty() {
            return -1;
        }



    }

    public static void main(String args[]) {

    } 
}
