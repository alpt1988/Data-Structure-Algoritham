public class BinarySearchTree {
    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }


        public void insert(int value) {
            if (value <= data) {
                if (left == null){
                    left = new Node(value);
                }else{
                    left.insert(value);
                }
            }else{
                if (right == null){
                    right = new Node(value);
                }else{
                    right.insert(value);
                }
            }
        }

        public boolean contain(int value){
            if (value == data) {
                return true;
            }else if (value < data){
                if (left == null){
                    return false;
                }else {
                    return left.contain(value);
                }
            }else{
                if (right == null){
                    return false;
                }else {
                    return right.contain(value);
                }
            }
        }

    // inorder traversal: this function, left node first, then root node then right node
    // pre order traversal: root first, then left then right
    // post order : left node, then right node then root
    public void inorder(){
            if (left != null){
                left.inorder();
            }
            System.out.println(data);
            if (right != null){
                right.inorder();
            }
      }
    }
}
