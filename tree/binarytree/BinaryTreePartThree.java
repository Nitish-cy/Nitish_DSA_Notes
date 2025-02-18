
public class BinaryTreePartThree{
     static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

        // Override toString method to display the node's data
        @Override
        public String toString() {
            return "Node{data=" + data + "}";
        }
    }
    //kth level of a tree
    public static void kthlevel(Node root,int level,int k){
        if (root==null) {
            return;
        }
        if (level==k) {
            System.out.println(root.data);
            return;
        }
        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
            //     1
            //    /  \
            //    2   3
            //    /\   /\
            //    4 5  6 7
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            kthlevel(root,1,3);
     }
}