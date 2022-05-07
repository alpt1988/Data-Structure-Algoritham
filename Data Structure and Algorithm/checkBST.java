// This is the algorithm to check if a tree is a Binary search tree
public class checkBST {
    public class Node{
        int data;
        Node left;
        Node right;
    }


    public boolean checkBST(Node root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // recursive method to check if left of the tree is BST and right of the tree is BST
    public boolean checkBST(Node root, int min, int max){
        if (root == null){return true;}
        if (root.data < min || root.data > max){return false;}
        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }
}
