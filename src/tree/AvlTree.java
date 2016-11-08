package tree;

/**
 * Created by zxh on 2016/11/8.
 */
public class AvlTree extends BinarySortTree {
    public BinaryNode rotateWithLeftChild(BinaryNode root){
        BinaryNode left = root.getLeft();
        root.left=left.right;
        left.right=root;
        return left;
    }
    public BinaryNode rotateWithRightChild(BinaryNode root){
        BinaryNode right=root.getRight();
        root.right=right.getLeft();
        right.left=root;
        return right;
    }

}
