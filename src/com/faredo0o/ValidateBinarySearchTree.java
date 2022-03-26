package com.faredo0o;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

    }
    public static boolean isValidBST(TreeNode root){


        return validateTree(root,  null,null);

    }
    public static boolean validateTree(TreeNode root,Integer min,Integer max){
        if(root==null) return true;
        if(min!=null&&root.val<=min||max!=null&&root.val>=max){
            return false;
        }
        return validateTree(root.left,min,root.val) &&validateTree(root.right,root.val,max);

    }

}

