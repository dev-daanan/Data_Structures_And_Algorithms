package Problems.Problem3_SinglyLinkedList.src.main.java;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (next != null) {
            return data + " -> " + next.data;
        } else {
            return data + " -> null";
        }
    }

}
