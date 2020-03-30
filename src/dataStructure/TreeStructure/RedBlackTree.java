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
     * 调整结构，变化规则如下
     * 1、父亲为红色、叔叔为红色
     *      父亲和叔叔黑，祖父变红，将祖父作为新节点进行插入的判断。
     * 2、父亲为红色、叔叔为黑色
     *      （1）父亲是左孩子，新节点为左孩子：以父亲为转动点，进行一次右旋
     *      （2）父亲是左孩子，新节点为右孩子：以新节点为转动点进行一次左旋，再以新节点为转动点进行一次右旋
     *      （3）父亲是右孩子，新节点为左孩子：以新节点为转动点进行一次右旋，再以新节点为转动点进行一次左旋
     *      （4）父亲是右孩子，新节点为右孩子：以父亲为转动点，进行一次左旋
     * 3、父亲为黑色
     *      直接插入，不需要变换
     *
     * 每次要将root重新设置成黑色
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
                rightSpin(node.getFather());
            } else if(node.fatherIsLeftChild() && !node.isLeftChild()){
                Node father = node.getFather();
                leftSpin(node);
                father.getGrandFather().setRed();
                father.getFather().setBlack();
                rightSpin(node);
            } else if(!node.fatherIsLeftChild() && node.isLeftChild()){
                Node father = node.getFather();
                rightSpin(node);
                father.getGrandFather().setRed();
                father.getFather().setBlack();
                leftSpin(node);
            } else if(!node.fatherIsLeftChild() && !node.isLeftChild()){
                node.getGrandFather().setRed();
                node.getFather().setBlack();
                leftSpin(node.getFather());
            }
        }
    }

    private void leftSpin(Node node){
        Node grandFather = node.getGrandFather();
        Node father = node.getFather();

        if(grandFather != null){
            if(grandFather.right == father){
                grandFather.right = father.right;
            } else {
                grandFather.left = father.right;
            }
            node.father = grandFather;
        }

        father.father = node;
        father.right = node.left;
        node.left = father;

        if(root == father){
            root = node;
            node.father = null;
        }
    }

    private void rightSpin(Node node){
        Node grandFather = node.getGrandFather();
        Node father = node.getFather();

        if(grandFather != null){
            if(grandFather.left == father){
                grandFather.left = father.left;
            } else {
                grandFather.right = father.left;
            }
            node.father = grandFather;
        }

        father.father = node;
        father.left = node.right;
        node.right = father;

        if(father == root){
            root = node;
            node.father = null;
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

    //50 80 90 100
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.add(10);
        tree.add(40);
        //右左旋
        tree.add(30);
        //父亲叔双红变色
        tree.add(60);
        //左旋
        tree.add(90);
        tree.add(70);
        tree.add(20);
        tree.add(50);
        tree.add(80);
    }
}
