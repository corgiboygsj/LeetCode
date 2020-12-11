package 牛客网刷题;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoshoujing
 * @create 2020-12-08 6:27 下午
 */
public class 二叉树前中后序遍历 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public int[][] threeOrders (TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        int[][] arr = new int[3][result.size()];
        copyToArr(result, arr, 0);
        result.clear();
        innerOrder(root, result);
        copyToArr(result, arr, 1);
        result.clear();
        afterOrder(root, result);
        copyToArr(result, arr, 2);
        return arr;
    }

    private void copyToArr(List<Integer> list, int[][] arr, int line){
        for (int i = 0; i < list.size(); i++) {
            arr[line][i] = list.get(i);
        }
    }

    private void preOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    private void innerOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        innerOrder(node.left, list);
        list.add(node.val);
        innerOrder(node.right, list);
    }

    private void afterOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        afterOrder(node.left, list);
        afterOrder(node.right, list);
        list.add(node.val);
    }
}
