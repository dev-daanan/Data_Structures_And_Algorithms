package Problems.Problem3_SinglyLinkedList.src.main.java;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
//        myList.insert("one");
//        myList.insert("two");
//        myList.insert("three");
//        myList.insert("four");
//        myList.insert("five");
//
//        myList.display();
//        System.out.println("_".repeat(50));
//        myList.delete("two");
//        myList.delete("four");
//        myList.display();

        DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<>();
        myDoublyLinkedList.insert("one");
        myDoublyLinkedList.insert("two");
        myDoublyLinkedList.insert("three");
        myDoublyLinkedList.insert("four");
        myDoublyLinkedList.insert("five");

        myDoublyLinkedList.display();
        System.out.println("_".repeat(50));
        myDoublyLinkedList.delete("two");
        myDoublyLinkedList.delete("four");
        myDoublyLinkedList.display();

    }
}
