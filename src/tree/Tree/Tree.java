package tree.Tree;

import tree.Node;

/**
 * Created by zxh on 2016/11/13.
 */
public class Tree {
    private Entry root;
    public static class Entry{
        private Node data;
        private Entry left;
        private Entry right;
        public Entry(Node data) {
            this.data = data;
        }
        public Entry(Node data, Entry left, Entry right) {
            this.data=data;
            this.left = left;
            this.right = right;
        }
    }
    public void initTree(){
        if(root==null){
            root=new Entry(new Node(1),null,null);
        }
        Entry entry = new Entry(new Node(2), null, null);
        root.left=entry;
        Entry entry1 = new Entry(new Node(3), null, null);
        root.right=entry1;
        Entry entry2 = new Entry(new Node(4), null, null);
        entry.left=entry2;
    }
    public boolean preOrder(int target){
        return preOrderTranverse(root,target);
    }

    private boolean preOrderTranverse(Entry root,int targer) {
        if(root!=null){
            if(root.data.getKey()==targer){
                return true;
            }
            if(preOrderTranverse(root.left,targer)){
                return true;
            }
            if(preOrderTranverse(root.right,targer)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.initTree();
        boolean b = tree.preOrder(2);
        System.out.println(b);
    }
}
