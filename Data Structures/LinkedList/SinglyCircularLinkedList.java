package LinkedList;
import java.util.*;

public class SinglyCircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Inserted: " + data);
    }

    // Delete first occurrence of a value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node curr = head;
        Node prev = null;

        // If head needs to be deleted
        if (head.data == data) {
            // Single node case
            if (head.next == head) {
                head = null;
            } else {
                // Find last node
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            System.out.println("Deleted: " + data);
            return;
        }

        // Search for node to delete
        do {
            prev = curr;
            curr = curr.next;
        } while (curr != head && curr.data != data);

        if (curr == head) {
            System.out.println("Element not found.");
        } else {
            prev.next = curr.next;
            System.out.println("Deleted: " + data);
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Singly Circular Linked List: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    scll.insert(data);
                    break;

                case 2:
                    System.out.print("Enter data to delete: ");
                    int deleteData = scanner.nextInt();
                    scll.delete(deleteData);
                    break;

                case 3:
                    scll.display();
                    break;

                case 4:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
