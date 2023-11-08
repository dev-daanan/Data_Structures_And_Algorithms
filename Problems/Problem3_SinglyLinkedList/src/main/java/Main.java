package Problems.Problem3_SinglyLinkedList.src.main.java;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        myList.insert("one");
        myList.insert("two");
        myList.insert("three");
        myList.insert("four");
        myList.insert("five");

        myList.display();
        System.out.println("_".repeat(50));
        myList.delete("two");
        myList.delete("four");
        myList.display();

    }
}
