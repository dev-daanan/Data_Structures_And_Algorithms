package Problems.Problem3_SinglyLinkedList.src.main.java;

public class DoublyNode<T> {
    private T data;
    private DoublyNode<T> next;
    private DoublyNode<T> prev;

    public DoublyNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (this.next != null) {
            if (this.prev != null) {
                return this.prev.data + " <- " + data + " -> " + this.next.data;
            } else {
                return "null <- " + data + " -> " + this.next.data;
            }
        } else {
            if (this.prev != null) {
                return this.prev.data + " <- " + data + " -> null";
            } else {
                return "null <- " + data + " -> null";
            }
        }
    }
}
