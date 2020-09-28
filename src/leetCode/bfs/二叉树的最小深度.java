package leetCode.bfs;

import java.util.LinkedList;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 */
public class 二叉树的最小深度 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int dept = 1;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode child = queue.poll();
                if(child.left == null && child.right == null){
                    return dept;
                }
                if(child.left != null){
                    queue.offer(child.left);
                }
                if(child.right != null){
                    queue.offer(child.right);
                }
            }
            dept++;
        }
        return dept;
    }

}
