package Problems.Problem2_Queue.src.main.java;

public class Main {
    public static void main(String[] args) {
        ArrayListQueue<Integer> myQueue = new ArrayListQueue<>();

        System.out.println("isEmpty: " + myQueue.isEmpty());

        System.out.println("size: " + myQueue.size());

        myQueue.enqueue(5);
        myQueue.enqueue(66);
        myQueue.enqueue(951);

        System.out.println("isEmpty: " + myQueue.isEmpty());

        System.out.println("size: " + myQueue.size());

        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println("Dequeued: " + myQueue.dequeue());

        System.out.println("isEmpty: " + myQueue.isEmpty());

        System.out.println("size: " + myQueue.size());


    }


}
