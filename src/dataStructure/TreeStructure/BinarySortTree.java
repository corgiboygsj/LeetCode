package dataStructure.TreeStructure;

import java.util.Comparator;

/**
 * 二叉排序树
 * @author guoshoujing
 * @create 2020-01-02 11:00 上午
 */
public class BinarySortTree {
    public static class Tree<T>{
        private Node<T> root;
        private Comparator<T> comparator;

        public Tree(Comparator<T> comparator){
            if(comparator == null){
                throw new NullPointerException("comparator is null");
            }
            this.comparator = comparator;
        }

        public void add(T data){
            if(root == null){
                root = new Node<>(data);
                return;
            }

            Node<T> work = root;
            while (true) {
                if(comparator.compare(work.data, data) > 0){
                    if(work.left == null){
                        work.left = new Node<>(data);
                        return;
                    } else {
                        work = work.left;
                    }
                } else {
                    if(work.right == null){
                        work.right = new Node<>(data);
                        return;
                    } else {
                        work = work.right;
                    }
                }
            }
        }

        public Node search(T data){
            if(data == null){
                return null;
            }

            Node<T> work = root;
            while(true){
                if(work.data == data || work.data.equals(data)){
                    return work;
                }
                if(comparator.compare(work.data, data) > 0){
                    if(work.left == null){
                        return null;
                    } else {
                        work = work.left;
                    }
                } else {
                    if(work.right == null){
                        return null;
                    } else {
                        work = work.right;
                    }
                }
            }
        }

        private static class Node<T>{
            private Node<T> left;
            private Node<T> right;
            private T data;

            public Node(Node<T> left, Node<T> right, T data) {
                this.left = left;
                this.right = right;
                this.data = data;
            }

            public Node(T data) {
                this.data = data;
            }
        }
    }

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>((a, b) -> {
            if(a > b){
                return 1;
            } else {
                return -1;
            }
        });

        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        tree.add(1);
        tree.add(9);
        tree.add(7);
        tree.add(8);
        tree.add(15);
        tree.add(16);
        tree.add(9);
    }
}
