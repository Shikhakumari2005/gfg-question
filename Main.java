class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    // Function to search in BST
    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } 
            else if (val < root.val) {
                root = root.left;
            } 
            else {
                root = root.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Creating BST manually
        /*
                4
               / \
              2   7
             / \
            1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int searchValue = 2;

        TreeNode result = searchBST(root, searchValue);

        if (result != null) {
            System.out.println("Value found: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }
}