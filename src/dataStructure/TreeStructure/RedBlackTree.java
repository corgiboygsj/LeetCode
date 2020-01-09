package dataStructure.TreeStructure;

/**
 * @author guoshoujing
 * @create 2020-01-08 4:10 下午
 */
public class RedBlackTree {
    private Node root;

    private static class Node{
        private Node left;
        private Node right;
        private Node father;
        private int data;
        private boolean isRed = true;

        private Node(int data) {
            this.data = data;
        }

        private Node(Node father, int data) {
            this.father = father;
            this.data = data;
        }

        private Node getGrandFather(){
            return this.father.father;
        }

        private Node getFather(){
            return this.father;
        }

        private Node getUncle(){
            Node grandParent = getGrandFather();
            if(grandParent == null){
                return null;
            }
            return (grandParent.left == this.father) ? grandParent.right : grandParent.left;
        }

        private boolean uncleIsRed(){
            Node uncle = getUncle();
            if(uncle == null){
                return false;
            }
            return uncle.isRed;
        }

        private boolean fatherIsRed(){
            return this.father.isRed;
        }

        private void setBlack(){
            this.isRed = false;
        }

        private void setRed(){
            this.isRed = true;
        }

        private boolean fatherIsLeftChild(){
            return getGrandFather().left == getFather();
        }

        private boolean isLeftChild(){
            return getFather().left == this;
        }
    }

    public void add(int data){
        if(root == null){
            root = new Node(data);
        } else {
            restructuring(addNode(data));
        }

        //最后将根节点设置为黑色
        root.setBlack();
    }

    /**
     * 调整结构
     * @param node
     */
    private void restructuring(Node node){
        //父节点如果是黑色不需要调整
        if(node.getFather() == null || !node.fatherIsRed()){
            return;
        }

        if(node.uncleIsRed()){
            if(node.getUncle() != null){
                node.getUncle().setBlack();
            }
            node.getFather().setBlack();
            node.getGrandFather().setRed();
            restructuring(node.getGrandFather());
        } else {
            if(node.fatherIsLeftChild() && node.isLeftChild()){
                node.getGrandFather().setRed();
                node.getFather().setBlack();
                rightSpin(node);
            } else if(node.fatherIsLeftChild() && !node.isLeftChild()){
                Node father = node.getFather();
                leftSpin(node);
                father.getGrandFather().setRed();
                father.getFather().setBlack();
                rightSpin(father);
            } else if(!node.fatherIsLeftChild() && node.isLeftChild()){
                Node father = node.getFather();
                rightSpin(node);
                father.getGrandFather().setRed();
                father.getFather().setBlack();
                leftSpin(father);
            } else if(!node.fatherIsLeftChild() && !node.isLeftChild()){
                node.getGrandFather().setRed();
                node.getFather().setBlack();
                leftSpin(node);
            }
        }
    }

    private void leftSpin(Node node){
        Node grandFather = node.getGrandFather();
        Node father = node.getFather();
        Node greatGrandFather = grandFather.getFather();

        grandFather.right = father.left;
        father.left = grandFather;

        grandFather.father = father;
        father.father = greatGrandFather;

        if(greatGrandFather != null){
            if(greatGrandFather.left == grandFather){
                greatGrandFather.left = father;
            } else {
                greatGrandFather.right = father;
            }
        } else {
            root = father;
        }
    }

    private void rightSpin(Node node){
        Node grandFather = node.getGrandFather();
        Node father = node.getFather();
        Node greatGrandFather = grandFather.getFather();

        grandFather.left = father.right;
        father.right = grandFather;

        grandFather.father = father;
        father.father = greatGrandFather;

        if(greatGrandFather != null){
            if(greatGrandFather.left == grandFather){
                greatGrandFather.left = father;
            } else {
                greatGrandFather.right = father;
            }
        } else {
            root = father;
            root.father = null;
        }
    }

    /**
     * 二叉树节点插入
     * @param data
     */
    private Node addNode(int data){
        Node work = root;
        Node node;
        while(true){
            if(work.data > data){
                if(work.left == null){
                    node = new Node(work, data);
                    work.left = node;
                    return node;
                } else {
                    work = work.left;
                }
            } else {
                if(work.right == null){
                    node = new Node(work, data);
                    work.right = node;
                    return node;
                } else {
                    work = work.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.add(50);
        tree.add(49);
        tree.add(48);
        tree.add(47);
        tree.add(46);
        tree.add(45);
        tree.add(44);
        tree.add(43);
        tree.add(42);
        tree.add(41);
        tree.add(40);
    }
}
