public class linkedlist {
    static class   Node{
        int val;
        Node next;

        public   Node(int val) {                   //constructor
            this.val = val;   
        }
        
    }
    // public class display{
    public static void printlist(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Node a=new Node();
        // a.val=10;

        Node a = new Node(10);       //head nde
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=e;
        printlist(a);
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        System.out.println(e.next);
    }
}
