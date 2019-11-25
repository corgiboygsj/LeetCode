package leetCode.栈;

import java.util.Stack;

/**
 * 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 * <p>
 * 调用 next() 将返回二叉搜索树中的下一个最小的数。
 * <p>
 * 提示：
 * <p>
 * next() 和 hasNext() 操作的时间复杂度是 O(1)，并使用 O(h) 内存，其中 h 是树的高度。
 * 你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 中至少存在一个下一个最小的数。
 */
public class Question173 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 思路：每次要返回下一个最小的数，就是相当于按照从小到大的顺序遍历二叉树，也就是中序遍历，题解见Question94。
     */
    public static class BSTIterator {
        private Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            if(root == null){
                return;
            }
            stack.push(root);
            TreeNode node = root.left;
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }

        public int next() {
            TreeNode node = stack.pop();
            TreeNode worker = node.right;
            if(worker != null){
                stack.push(worker);
                while(worker.left != null){
                    stack.push(worker.left);
                    worker = worker.left;
                }
            }

            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
