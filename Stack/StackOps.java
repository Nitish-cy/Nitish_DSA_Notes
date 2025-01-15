

public class StackOps {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        //stack imple using ArrayList
        // static  ArrayList<Integer> arrLs=new ArrayList<>();
        // public static boolean isEmpty(){
        //     return arrLs.size()==0;
        // }
        // //push
        // public static void push(int data){
        //     arrLs.add(data);
        // }
        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int data=arrLs.get(arrLs.size()-1);
        //     arrLs.remove(arrLs.size()-1);
        //     return data;
        // }
        // //peek
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return arrLs.get(arrLs.size()-1);
        // }
        //stack imple using LinkedList
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;

        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
       
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmpty()) {
            System.err.println(st.peek());
            st.pop();
        }
    }
}
