package dsa.common;

import java.util.LinkedList;
import java.util.Queue;

/** Binary tree node (same shape as LeetCode). */
public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) { this.val = val; }

    /** Builds a tree from level-order values, null = missing: of(3,9,20,null,null,15,7) */
    public static TreeNode of(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            TreeNode node = q.poll();
            if (i < values.length && values[i] != null) { node.left = new TreeNode(values[i]); q.add(node.left); }
            i++;
            if (i < values.length && values[i] != null) { node.right = new TreeNode(values[i]); q.add(node.right); }
            i++;
        }
        return root;
    }
}
