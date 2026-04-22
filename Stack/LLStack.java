
public class LLStack {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if( head == null) {
            System.out.println("Stack is UnderFlow");
            return  -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public int peek() {
        if( head == null) {
            System.out.println("Stack is UnderFlow");
            return  -1;
        }
        return head.data;
    }

    public void display() {
    if(head == null) {
        System.out.println("Stack is empty");
        return;
    }

    Node temp = head;
    while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
    }

    public static void main(String[] args) {
        LLStack ll = new LLStack();

        ll.push(30);
        ll.push(20);
        ll.push(10);
        ll.display();
        System.out.println(ll.peek());
        // ll.display();
        System.out.println(ll.pop());
        // ll.display();
        System.out.println(ll.peek());
    }
}
