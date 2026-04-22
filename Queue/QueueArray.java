package Queue;

public class QueueArray {

    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    //Enqueqe
    public void enqueue(int data) {
        if( rear == arr.length -1 ) {
            System.out.println("Queue is Overflow");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //Dequeqe
    public int dequeue() {
        if( front > rear) {
            System.out.println("Queue is Overflow");
            return -1;
        }
        int rem = arr[front];
        front++;
        return rem;       
    }

    //peek
    public int peek() {
        if( front > rear) {
            System.out.println("Queue is Overflow");
            return -1;
        }
        return arr[front];
    }

    //Display
    public void display() {
        if(front == -1) {
        System.out.println("Queue is empty");
        return;
        }

        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println();
        q.dequeue();
        q.display();
        // System.out.println();
        // q.dequeue();
        // q.display();
        // System.out.println(q.peek());
    }
}
