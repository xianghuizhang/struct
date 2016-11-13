package tree.Tree;

/**
 * Created by zxh on 2016/11/13.
 */
public class Tree<T> {
    private Entry root;
    public static class Entry<T>{
        private T data;
        private Entry left;
        private Entry right;
        public Entry(T data) {
            this.data = data;
        }
        public Entry(T data, Entry left, Entry right) {
            this.data=data;
            this.left = left;
            this.right = right;
        }


    }
}
