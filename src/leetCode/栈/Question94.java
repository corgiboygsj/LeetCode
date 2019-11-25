package leetCode.栈;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 */
public class Question94 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 中序遍历，左中右的顺序。所以要先将左边的所有元素都入栈直到没有左孩子为止。
     * 每次取出一个元素，现在取出的元素就是没有左孩子的节点，可以直接输出。
     * 之后判断出栈节点是否有右孩子节点，有的话又要按照根节点处理，重复第一个步骤
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root != null){
            stack.push(root);
            root = root.left;
        }

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);

            if(node.right != null){
                stack.push(node = node.right);
                while(node.left != null){
                    stack.push(node.left);
                    node = node.left;
                }
            }
        }

        return result;
    }
}
