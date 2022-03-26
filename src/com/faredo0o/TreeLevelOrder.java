package com.faredo0o;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrder {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> solution = new ArrayList<>();
        if(root==null) return solution;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> level = new ArrayList<>();
        level.add(root.val);
        solution.add(level);
        while (!queue.isEmpty()) {

            level = new ArrayList<>();

            TreeNode current = queue.poll();


            queue.add(current.left);
            queue.add(current.right);
            if (current.left != null){
                level.add(current.left.val);
            }
            if (current.right != null){
                level.add(current.right.val);
            }
            if(!level.isEmpty()) solution.add(level);

        }
        return solution;
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

