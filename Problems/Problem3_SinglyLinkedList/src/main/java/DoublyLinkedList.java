package Problems.Problem3_SinglyLinkedList.src.main.java;

import java.util.Objects;

public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // add
    public void insert(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    // delete
    public void delete(T data) {
        if (this.head == null) {
            return;
        }
        if (Objects.equals(this.head.getData(), data)) {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }
        if (Objects.equals(this.tail.getData(), data)) {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }

        DoublyNode<T> currentNode = this.head;
        while (currentNode.getNext() != null && !Objects.equals(currentNode.getNext().getData(), data)) {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getNext() != null) {
            currentNode.setNext(currentNode.getNext().getNext());
            currentNode.getNext().setPrev(currentNode);
        }
    }

    // display
    public void display() {
        if (this.head == null) {
            System.out.println("List empty");
        } else {
            DoublyNode<T> currentNode = this.head;
            while (currentNode != null) {
                System.out.println(currentNode);
                currentNode = currentNode.getNext();
            }
        }
    }

}
