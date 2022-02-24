public class sameTree {
    public class Treenode{
        int val;
        Treenode left;
        Treenode right;
        Treenode(){};
        Treenode(int val){this.val = val;}
        Treenode(int val, Treenode left, Treenode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(Treenode p, Treenode q){
        if ( p == null && q == null){
            return true;
        }else if ( p == null || q == null || p.val != q.val){
            return false;
        }else {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
    }





}
