package tree;

/**
 * Created by zxh on 2016/11/8.
 */
public class BinarySortTree {
    public static class BinaryNode {
        Node data;
        int height;
        BinaryNode left;
        BinaryNode right;

        public BinaryNode getLeft() {
            return left;
        }

        public void setLeft(BinaryNode left) {
            this.left = left;
        }

        public BinaryNode getRight() {
            return right;
        }

        public void setRight(BinaryNode right) {
            this.right = right;
        }

        public BinaryNode(Node data) {
            this.data = data;
            this.height=0;
            this.left=null;
            this.right=null;
        }

        public BinaryNode(Node data, int height, BinaryNode left, BinaryNode right) {
            this.data = data;
            this.height = height;
            this.left = left;
            this.right = right;
        }
    }
    public static int height(BinaryNode node){
        return node==null?-1:node.height;
    }
    private BinaryNode root;
    public BinaryNode getRoot(){
        return root;
    }
    public void inset(Node data){
        this.root=insert(data,root);
    }

    private BinaryNode insert(Node data, BinaryNode root) {
        if(root==null){
            return new BinaryNode(data);
        }
        int key = data.getKey();
        int key1 = root.data.getKey();
        if(key < key1){
            root.left=insert(data,root.left);
        }else if(key>key1){
            root.right=insert(data,root.right);
        }else{

        }
        root.height=Math.max(height(root.left),height(root.right))+1;
        return root;
    }
}