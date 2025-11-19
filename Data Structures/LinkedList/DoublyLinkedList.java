package LinkedList;

import java.util.Scanner;

class Node {

    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DoublyLinkedList {

    private Node head;

    // insert at the end 
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Insert: " + data);
    }

    // Traverse and display
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Doubly Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Inserted");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert: ");
                    int data = scanner.nextInt();
                    dll.insert(data);
                    break;
                case 2:
                    dll.display();
                    break;
                case 3:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

}
