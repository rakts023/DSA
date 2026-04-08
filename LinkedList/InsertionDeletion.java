package LinkedList;

public class InsertionDeletion {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    

    //Insertion
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if( head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if( head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    
    public void addMiddle(int index, int data) {
        if( index == 0 ) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while( i < index -1 ) {
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        if( head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while(temp !=  null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //Deletion
    //Deletion at beginning
    public void deleteFirst(){
        if( head == null ) {
            return;   
        }

        Node temp = head;
        head = head.next;
    }

    //Deletion at last
    public void deletLast() {
        if( head == null || head.next == null) {
            return;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    //Deletion at given position
    public Node deleteMiddle(int pos) {
        if( pos == 0) {
            return head.next;
        }

        Node temp = head;
        for( int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public Node reverseLL() {
        if( head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;

        while( curr != null ) {
            Node next = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }




    public static void main(String[] args) {
        InsertionDeletion ll = new InsertionDeletion();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.display();
        ll.reverseLL();
        ll.display();
        // ll.deleteFirst();
        // ll.deletLast();
        // ll.display();
        // ll.deleteMiddle(2);
        // ll.display();
    }
}
