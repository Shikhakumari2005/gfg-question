class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }
    
    public class LinkedListDemo {
        public static void main(String[] args) {
            Node head = new Node(6);
            head.next = new Node(4);
            head.next.next = new Node(5);
            head.next.next.next = new Node(3);
            head.next.next.next.next = new Node(1);
    
            printList(head); // Call the method to print the list
        }
    
        static void printList(Node head) {
            int size = 0;
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                size++;
                if (temp.next != null) System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println(); // Move to next line after printing list
            System.out.println("Size of list: " + size);
        }
    }
    