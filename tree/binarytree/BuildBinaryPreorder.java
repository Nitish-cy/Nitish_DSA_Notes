
import java.util.LinkedList;
import java.util.Queue;


public class BuildBinaryPreorder {

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

    static class BinaryTree {

        //it will return root of the tree
        static int indx = -1;

        public static Node buildTree(int nodes[]) {
            indx++;
            //check for null condition -1 = null
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]); //it will create a node - root
            newNode.left = buildTree(nodes); //call build tree function for left sub tree
            newNode.right = buildTree(nodes);//call build tree function for right sub tree
            return newNode;
        }
        //pre-order traversal
        public static void preorder(Node root){
            if (root==null) {
                return;
            }
            System.err.println(root.data+"");
            preorder(root.left);
            preorder(root.right);
        }
        //post-order traversal
        public static void postorder(Node root){
            if (root==null) {
                return;
            }
             postorder(root.left);
            postorder(root.right);
            System.err.println(root.data+"");
        }
         //in-order traversal
        public static void inorder(Node root){
            if (root==null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data+"");
            inorder(root.right);
        }
        //level order travarsal
        public static void levelorder(Node root){
            if (root==null) {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) { 
                Node curNode=q.remove();
                if(curNode==null){
                    System.err.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curNode.data + " ");
                    if (curNode.left!=null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right!=null) {
                        q.add(curNode.right);
                    }
                }
            }
        }

        //height of a tree
        public static int height(Node root){
            if (root==null) {
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        //count of nodes
         public static int count(Node root){
            if (root==null) {
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);
            return lc+rc+1;
         }
         //sum of nodes
         public static int sum(Node root){
            if (root==null) {
                return 0;
            }
            return sum(root.left)+sum(root.right)+root.data;
         }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root);
        //tree.preorder(root);
        //tree.inorder(root);
       // tree.postorder(root);
       tree.levelorder(root);
       System.err.println(tree.height(root));
       System.out.println(tree.count(root));
       System.out.println(tree.sum(root));
    }
}
