package com.company;

public class LongestUnivariatePath {

    public static class Height{
        public int val ;
        public Height(){ val = 0;}
    }

    public static class TreeNode{
        public int val;
        TreeNode left ;
        TreeNode right ;
        TreeNode(int x){ val = x;}
    }

    public static void main(String args[]) {
        int[] nums = { -2, -1, 2, 1 };

    }

    public int longestUnivaluePath(TreeNode root) {
        return 0;
    }

    public static int longestUtil(TreeNode root, Height h){
        if(root.left == null && root.right == null ){
            return 0;
        }
        Height lh = new Height(), rh = new Height();
        int path = 0 , left = 0, right =0, lheight=0, rheight = 0 ;

        if (root.left != null) {
            left = longestUtil(root.left, lh);
            if (root.val == root.left.val) {
                path += lh.val + 1;
                lheight = lh.val + 1;
            }
        }
        if (root.right != null) {
            right = longestUtil(root.right, rh);
            if (root.val == root.right.val) {
                path += rh.val + 1;
                rheight = rh.val + 1;
            }
        }
        h.val = Math.max(lheight, rheight) ;
        return Math.max(path, Math.max(left, right));
    }


}
