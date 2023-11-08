package Problems.Problem3_SinglyLinkedList.src.main.java;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }
    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> currentNode = this.head;
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
        Node<T> currentNode = this.head;
        while(currentNode.getNext().getData() != targetData && currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getNext() != null) {
            currentNode.setNext(currentNode.getNext().getNext());
        }

    }

    public void display() {
        Node<T> currentNode = this.head;
        while(currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

}
