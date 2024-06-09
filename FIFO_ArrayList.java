package FIFOqueues;
import java.util.ArrayList;

public class FIFO_ArrayList {

	 private ArrayList<Integer> queue;

	    public FIFO_ArrayList() {
	        queue = new ArrayList<>();
	    }

	    public void enqueue(int item) {
	        queue.add(item);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return queue.remove(0);
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public int size() {
	        return queue.size();
	    }

	    public static void main(String[] args) {
	    	FIFO_ArrayList queue4 = new FIFO_ArrayList();
	        queue4.enqueue(1);
	        queue4.enqueue(2);
	        System.out.println(queue4.dequeue());  
	        System.out.println(queue4.size());     
	    }
	}