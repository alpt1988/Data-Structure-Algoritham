public class subTreeofAnotherTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubTree(TreeNode s, TreeNode t){
        if (t == null){
            return true;
        }
        if (s == null){
            return false;
        }

        if (isSameTree(s,t)){
            return true;
        }

        return (isSubTree(s.left, t) || isSubTree(s.right, t));
    }





    public boolean isSameTree(TreeNode s, TreeNode t){
        if (s == null && t == null){
            return true;
        }
        if ( s != null && t != null && s.val == t.val){
            return (isSameTree(s.left, t.left) && isSameTree(s.right, t.right));
        }
        return false;
    }


}
