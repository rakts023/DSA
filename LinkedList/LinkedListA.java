package LinkedList;

public class LinkedListA {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //insertion we can add at first as well as last

    //insertion at beginning
    public void addFirst(int data) {
        //Step - 1 Create new node
        Node newNode = new Node(data);
        size++;
        if( head == null) {
            head = tail = newNode;
            return;
        }
        //Step - 2 link newNode.next to previous head node
        newNode.next = head;
        //Step - 3 link head to newNode
        head = newNode;
    }

    //insertion at last
    public void addLast(int data) {
        //Step - 1 Create new node
        Node newNode = new Node(data);
        size++;
        if( head == null) {
            head = tail = newNode;
            return;
        }
        //Step - 2 assign tail or last node with newNode
        tail.next = newNode;
        //Step - 3 assign newNode as tail node
        tail = newNode;
    }

    //insertion at Given Index
    public void addMiddle(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return; 
        }
        //Step - 1 Create new node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while( i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Printing all data
    public void display() {
        if( head == null) {
            System.out.println("LL is Empty");
            return;
        }   

        Node temp = head;
        while( temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    //Deletion

    //Delete from first
    public int deleteFirst() {
        if( size == 0 ) {
            System.out.println("LL is Empty");

        } else if( size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast() {
        if( size == 0 ) {
            System.out.println("LL is Empty");

        } else if( size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for(int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        return 1;
    }


    public static void main(String[] args) {
            LinkedListA ll = new LinkedListA();

            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(4);
            ll.addLast(5);
            ll.addMiddle(2, 3);
            ll.display();
            System.out.println(ll.size);
            ll.deleteFirst();
            ll.display();
    }
}
