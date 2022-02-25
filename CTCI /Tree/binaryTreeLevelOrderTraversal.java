import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {};

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;
        queue.add(root);


        while(!queue.isEmpty()){
            List<Integer> tmplist = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i ++) {
                TreeNode node = queue.poll();

                tmplist.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            if (tmplist != null){
                res.add(new ArrayList<>(tmplist));
            }
        }
        return res;
    }

}
