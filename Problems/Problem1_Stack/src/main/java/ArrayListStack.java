package Problems.Problem1_Stack.src.main.java;

import java.util.ArrayList;

/**
 * ArrayListStack is a simple implementation of a stack data structure using an ArrayList.
 * It allows you to push and pop T elements onto/from the stack.
 */
public class ArrayListStack<T> {
    private final ArrayList<T> stack; // The underlying data structure to store stack elements.
    private int topIndex; // The index of the top element in the stack.

    /**
     * Constructs an empty ArrayListStack.
     */
    public ArrayListStack() {
        this.stack = new ArrayList<>();
        this.topIndex = -1;
    }

    /**
     * Pushes an integer onto the top of the stack.
     *
     * @param item The item to be pushed onto the stack.
     */
    public void push(T item) {
        stack.add(item);
        topIndex++;
    }

    /**
     * Pops and returns the top Item from the stack.
     *
     * @return The top Item from the stack, or null if the stack is empty.
     */
    public T pop() {
        T popped = null;
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop elements. Returning 'null'.");
        } else {
            popped = stack.remove(topIndex);
            topIndex--;
        }

        return popped;
    }

    /**
     * Peeks and returns the top Item from the stack without removing it.
     *
     * @return The top Item from the stack, or 'null'' if the stack is empty.
     */
    public T peek() {
        return stack.get(topIndex);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return topIndex == -1;
    }

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int getSize() {
        return topIndex + 1;
    }
}
