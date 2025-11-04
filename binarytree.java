public class binarytree {
    // Define the Node class
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Define the BinaryTree class
class BinaryTree {
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Example method to print tree in-order
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Print in-order traversal
        tree.inorderTraversal(tree.root);
    }
}

}
