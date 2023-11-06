package Problems.Problem1_Stack.src.main.java;

public class Main {
    public static void main(String[] args) {
        ArrayListStack<Integer> myStack = new ArrayListStack<>();
        System.out.println("isEmpty: " + myStack.isEmpty());
        myStack.push(1000);
        myStack.push(1234);
        myStack.push(2345);
        myStack.push(3465);
        myStack.push(4576);
        myStack.push(5687);
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("peek: " + myStack.peek());
        System.out.println("Size: " + myStack.getSize());
        System.out.println("popped: " + myStack.pop());
        System.out.println("popped: " + myStack.pop());
        System.out.println("popped: " + myStack.pop());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("peek: " + myStack.peek());
        System.out.println("Size: " + myStack.getSize());
        System.out.println("popped: " + myStack.pop());
        System.out.println("popped: " + myStack.pop());
        System.out.println("popped: " + myStack.pop());
        System.out.println("popped: " + myStack.pop());

    }
}
