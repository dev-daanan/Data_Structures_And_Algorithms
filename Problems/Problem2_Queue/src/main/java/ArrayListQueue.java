package Problems.Problem2_Queue.src.main.java;

import java.util.LinkedList;

public class ArrayListQueue<T> {
    private final LinkedList<T> queue;

    public ArrayListQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (size() > 0) {
            return queue.removeFirst();
        } else {
            System.out.println("Queue is empty. Returning null.");
            return null;
        }
    }

    public T front() {
        if (size() > 0) {
            return queue.getFirst();
        } else {
            System.out.println("Queue is empty. Returning null.");
            return null;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
