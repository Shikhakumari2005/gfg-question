public class reversell {
    static class Node{
        int data;
        Node next;
        //constructor
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    
    static class LinkedList{
        Node head;         //reference to first node of list
        // Insert at the beginning
        // void insert(int data) {
        //     Node newNode = new Node(data);
        //     newNode.next = head;
        //     head = newNode;
        // }
        void reverse(){
            Node curr=head;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head= prev;             //this conditon when he only 1 elmt
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("null");
        }

    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        // list.insert(10);
        // list.insert(20);
        // list.insert(30);
        // list.insert(40);
        // list.insert(50);
        // list.display();
        // list.reverse();
        // Assuming the list is already given
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original List:");
        list.display();

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
    }
    
}
