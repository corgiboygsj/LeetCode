package 牛客网刷题;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
 *
 * @author guoshoujing
 * @create 2020-12-22 7:46 下午
 */
public class 之字型层序二叉树 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        boolean flag = true;
        while(!stack.isEmpty()){
            ArrayList<TreeNode> list = new ArrayList<>();
            ArrayList<Integer> itemList = new ArrayList<>();
            while(!stack.isEmpty()){
                TreeNode pop = stack.pop();
                list.add(pop);
                itemList.add(pop.val);
            }
            if(flag){
                list.forEach(item -> {
                    stack.push(item.right);
                    stack.push(item.left);
                });
                flag = false;
            } else {
                list.forEach(item -> {
                    stack.push(item.left);
                    stack.push(item.right);
                });
                flag = true;
            }
        }
        return result;
    }
}
