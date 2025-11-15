// import java.util.Scanner;
// public class ReadArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();
//         System.out.println("Array elements:");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }
// }

//Q2. Count positive and negative elements
// public class CountPosNeg {
//     public static void main(String[] args) {
//         int[] arr = {1, -2, 3, -4, 5};
//         int pos = 0, neg = 0;
//         for (int num : arr) {
//             if (num >= 0) pos++;
//             else neg++;
//         }
//         System.out.println("Positive: " + pos);
//         System.out.println("Negative: " + neg);
//     }
// }
// //Q3. Convert decimal to binary
// import java.util.Scanner;
// public class DecimalToBinary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter decimal number: ");
//         int num = sc.nextInt();
//         String binary = Integer.toBinaryString(num);
//         System.out.println("Binary: " + binary);
//     }
// }
// //Q4. Insert in array (end, beginning, position, sorted)
// import java.util.*;
// public class InsertArray {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         int n = 5;
//         arr[0]=10; arr[1]=20; arr[2]=30; arr[3]=40; arr[4]=50;

//         // Insert at end
//         arr[n] = 60; n++;

//         // Insert at beginning
//         for (int i = n; i > 0; i--)
//             arr[i] = arr[i-1];
//         arr[0] = 5; n++;

//         // Insert at position 3
//         for (int i = n; i > 3; i--)
//             arr[i] = arr[i-1];
//         arr[3] = 25; n++;

//         // Insert in sorted array
//         int newVal = 35;
//         int pos = 0;
//         while (pos < n && arr[pos] < newVal) pos++;
//         for (int i = n; i > pos; i--)
//             arr[i] = arr[i-1];
//         arr[pos] = newVal; n++;

//         System.out.println("Updated array:");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }
// }
// //Q5. Menu-driven delete from array
// import java.util.Scanner;
// public class DeleteArray {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int n = 5;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1. Delete from end\n2. Delete from beginning\n3. Delete specific element");
//         int choice = sc.nextInt();

//         if (choice == 1) n--;
//         else if (choice == 2) {
//             for (int i = 0; i < n - 1; i++)
//                 arr[i] = arr[i + 1];
//             n--;
//         } else if (choice == 3) {
//             System.out.print("Enter element to delete: ");
//             int val = sc.nextInt();
//             int pos = -1;
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] == val) {
//                     pos = i;
//                     break;
//                 }
//             }
//             if (pos != -1) {
//                 for (int i = pos; i < n - 1; i++)
//                     arr[i] = arr[i + 1];
//                 n--;
//             } else System.out.println("Element not found.");
//         }

//         System.out.println("Updated array:");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }
// }
// //Q1. Merge two sorted arrays
// public class MergeSorted {
//     public static void main(String[] args) {
//         int[] a = {10, 30, 50};
//         int[] b = {20, 40, 60};
//         int[] c = new int[a.length + b.length];
//         int i = 0, j = 0, k = 0;

//         while (i < a.length && j < b.length) {
//             if (a[i] < b[j]) c[k++] = a[i++];
//             else c[k++] = b[j++];
//         }
//         while (i < a.length) c[k++] = a[i++];
//         while (j < b.length) c[k++] = b[j++];

//         System.out.println("Merged array:");
//         for (int val : c)
//             System.out.print(val + " ");
//     }
// }
// //Q2. Reverse an array
// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         int n = arr.length;
//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - 1 - i];
//             arr[n - 1 - i] = temp;
//         }
//         System.out.println("Reversed array:");
//         for (int val : arr)
//             System.out.print(val + " ");
//     }
//}
// //Q3. Largest and second largest
// public class LargestTwo {
//     public static void main(String[] args) {
//         int[] arr = {10, 50, 20, 40};
//         int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//         for (int val : arr) {
//             if (val > max1) {
//                 max2 = max1;
//                 max1 = val;
//             } else if (val > max2 && val != max1) {
//                 max2 = val;
//             }
//         }
//         System.out.println("Largest: " + max1);
//         System.out.println("Second Largest: " + max2);
//     }
// }
// //Q4. Interchange odd and even positions
// public class SwapOddEven {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50, 60};
//         for (int i = 0; i < arr.length - 1; i += 2) {
//             int temp = arr[i];
//             arr[i] = arr[i + 1];
//             arr[i + 1] = temp;
//         }
//         System.out.println("Swapped array:");
//         for (int val : arr)
//             System.out.print(val + " ");
//     }
// }
// //1. Menu-Driven Program for Singly Linked List Operation
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class LinkedListMenu {
    Node head = null;

    // Insert at beginning
    void insertBeg(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Insert after a specific element
    void insertAfter(int key, int val) {
        Node temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp != null) {
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Element not found.");
        }
    }

    // Delete from beginning
    void deleteBeg() {
        if (head != null)
            head = head.next;
    }

    // Delete from end
    void deleteEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    // Delete specific element
    void deleteElement(int val) {
        if (head == null) return;
        if (head.data == val) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != val)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Element not found.");
    }

    // Search element
    void search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                System.out.println("Element found.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found.");
    }

    // Print list
    void printList() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Sort list
    void sortList() {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedListMenu list = new LinkedListMenu();
        Scanner sc = new Scanner(System.in);
        int choice, val, key;

        do {
            System.out.println("\n1.Insert Beg\n2.Insert End\n3.Insert After\n4.Delete Beg\n5.Delete End\n6.Delete Element\n7.Search\n8.Print\n9.Sort\n10.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter value: "); val = sc.nextInt(); list.insertBeg(val); break;
                case 2: System.out.print("Enter value: "); val = sc.nextInt(); list.insertEnd(val); break;
                case 3: System.out.print("Enter key and value: "); key = sc.nextInt(); val = sc.nextInt(); list.insertAfter(key, val); break;
                case 4: list.deleteBeg(); break;
                case 5: list.deleteEnd(); break;
                case 6: System.out.print("Enter value to delete: "); val = sc.nextInt(); list.deleteElement(val); break;
                case 7: System.out.print("Enter value to search: "); val = sc.nextInt(); list.search(val); break;
                case 8: list.printList(); break;
                case 9: list.sortList(); break;
                case 10: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 10);
    }
}
// //2. Add and Subtract Two Polynomials Using Singly Linked List
// class PolyNode {
//     int coeff, pow;
//     PolyNode next;
//     PolyNode(int c, int p) { coeff = c; pow = p; next = null; }
// }

// class Polynomial {
//     PolyNode head = null;

//     void insert(int c, int p) {
//         PolyNode newNode = new PolyNode(c, p);
//         if (head == null || head.pow < p) {
//             newNode.next = head;
//             head = newNode;
//         } else {
//             PolyNode temp = head;
//             while (temp.next != null && temp.next.pow >= p)
//                 temp = temp.next;
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//     }

//     static Polynomial add(Polynomial p1, Polynomial p2) {
//         Polynomial result = new Polynomial();
//         PolyNode a = p1.head, b = p2.head;
//         while (a != null || b != null) {
//             if (a == null) { result.insert(b.coeff, b.pow); b = b.next; }
//             else if (b == null) { result.insert(a.coeff, a.pow); a = a.next; }
//             else if (a.pow == b.pow) {
//                 result.insert(a.coeff + b.coeff, a.pow);
//                 a = a.next; b = b.next;
//             } else if (a.pow > b.pow) {
//                 result.insert(a.coeff, a.pow); a = a.next;
//             } else {
//                 result.insert(b.coeff, b.pow); b = b.next;
//             }
//         }
//         return result;
//     }

//     static Polynomial subtract(Polynomial p1, Polynomial p2) {
//         Polynomial result = new Polynomial();
//         PolyNode a = p1.head, b = p2.head;
//         while (a != null || b != null) {
//             if (a == null) { result.insert(-b.coeff, b.pow); b = b.next; }
//             else if (b == null) { result.insert(a.coeff, a.pow); a = a.next; }
//             else if (a.pow == b.pow) {
//                 result.insert(a.coeff - b.coeff, a.pow);
//                 a = a.next; b = b.next;
//             } else if (a.pow > b.pow) {
//                 result.insert(a.coeff, a.pow); a = a.next;
//             } else {
//                 result.insert(-b.coeff, b.pow); b = b.next;
//             }
//         }
//         return result;
//     }

//     void print() {
//         PolyNode temp = head;
//         while (temp != null) {
//             System.out.print(temp.coeff + "x^" + temp.pow + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// //Reverse a Linked List (Leetcode 206)
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

// public class ReverseLinkedList {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null, curr = head;
//         while (curr != null) {
//             ListNode nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;
//         }
//         return prev;
//     }
// }



