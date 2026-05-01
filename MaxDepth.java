class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class MaxDepth {
    public static int maxDepth(Node root) {
        if (root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println(maxDepth(root)); // Output: 3
    }
}