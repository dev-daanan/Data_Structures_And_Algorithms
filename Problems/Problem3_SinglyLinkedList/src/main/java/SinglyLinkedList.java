package Problems.Problem3_SinglyLinkedList.src.main.java;

public class SinglyLinkedList<T> {
    private SinglyNode<T> head;

    public SinglyLinkedList(SinglyNode<T> head) {
        this.head = head;
    }
    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        SinglyNode<T> newNode = new SinglyNode<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            SinglyNode<T> currentNode = this.head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void delete(T targetData) {
        if (this.head == null) {
            return;
        }
        if (this.head.getData() == targetData) {
            this.head = this.head.getNext();
            return;
        }
        SinglyNode<T> currentNode = this.head;
        while(currentNode.getNext() != null && currentNode.getNext().getData() != targetData) {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getNext() != null) {
            currentNode.setNext(currentNode.getNext().getNext());
        }

    }

    public void display() {
        SinglyNode<T> currentNode = this.head;
        while(currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

}
