package FIFOqueues;
import java.util.LinkedList;
import java.util.Queue;

public class FIFO_LinkedList {

	    private Queue<Integer> queue;

	    public FIFO_LinkedList() {
	        queue = new LinkedList<>();
	    }

	    public void enqueue(int item) {
	        queue.offer(item);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return queue.poll();
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public int size() {
	        return queue.size();
	    }

	    public static void main(String[] args) {
	    	FIFO_LinkedList queue2 = new FIFO_LinkedList();
	        queue2.enqueue(1);
	        queue2.enqueue(2);
	        System.out.println(queue2.dequeue());  // Output: 1
	        System.out.println(queue2.size());     // Output: 1
	    }
	}