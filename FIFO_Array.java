package FIFOqueues;

public class FIFO_Array {

	
	    private int[] queue;
	    private int front;
	    private int rear;
	    private int size;

	    public FIFO_Array(int capacity) {
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    public void enqueue(int item) {
	        if (size == queue.length) {
	            throw new IllegalStateException("Queue is full");
	        }
	        rear = (rear + 1) % queue.length;
	        queue[rear] = item;
	        size++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        int item = queue[front];
	        front = (front + 1) % queue.length;
	        size--;
	        return item;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public int size() {
	        return size;
	    }

	    public static void main(String[] args) {
	    	FIFO_Array queue1 = new FIFO_Array(10);
	        queue1.enqueue(1);
	        queue1.enqueue(2);
	        System.out.println(queue1.dequeue());  // Output: 1
	        System.out.println(queue1.size());     // Output: 1
	    }
	}