public class lowestCommonAncestor {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){};
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        TreeNode cur = root;

        while ( cur != null){
            if (p.val > cur.val && q.val > cur.val){
                cur = cur.right;
            }else if (p.val < cur.val && q.val < cur.val){
                cur = cur.left;
            }else{
                return cur;
            }
        }
        return cur;
    }
}
