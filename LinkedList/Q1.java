
public class Q1 {
    // step -1  create node 

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            //initialze data and next value of node 
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add node in linkedlist O(1)
    public void addFirst(int data) {
        //step1 create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            //check for initial state first node when linked list is empty
            head = tail = newNode;
            return;
        }
        //step2 link 
        newNode.next = head;
        //make new node head node
        head = newNode;
    }
//add node in linkedlist O(1)

    public void addLast(int data) {
        //step1 create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            //check for initial state first node when linked list is empty
            head = tail = newNode;
            return;
        }
        //step2 link 
        // head.next = newNode;
        // //make new node head node
        // newNode.next=null;

        //second solution 
        tail.next = newNode;
        tail = newNode;
    }

    //print linked List data travarsal O(n)
    public static void printList() {
        //if list is empty
        if (head == null) {
            System.out.println("List is empty");
        }
        //we don't have to change change only curr during travarsal
        Node curr = head;
        //do while curr!=null - at last node
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.err.println("");
    }
    //print using recursion

    public static void printListRecursively(Node head) {
        //base case
        if (head == null) {
            return;
        }
        //  kaam
        System.out.println(head.data);
        //faith 
        printListRecursively(head.next);

    }
//add in middle O(n) bcz we have to traverse 

    public void addInMiddle(int index, int data) {
        //step1 create a node
        Node newNode = new Node(data);
        if (head == null) {
            //check for initial state first node when linked list is empty
            head = tail = newNode;
            return;
        }
        //second solution 
        int i = 0;
        Node temp = head;
        size++;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //find size of linkedlist
    public int listSize() {
        int count = 0;
        if (head == null) {
            return count;
        }
        Node temp = head;
        while (temp != null) {
            count++;
        }
        return count;
    }

    //remove first
    public int removeFirst() {
        if (size == 0) {
            return 0;
        } else if (size == 1) {
            size--;
            head = tail = null;
        }
        size--;
        head = head.next;
        return head.data;
    }

    //remove last node
    public int removeLastNode() {
        if (size == 0) {
            System.out.println("List is emplty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int i = 0;
        Node temp = head;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        return val;
    }

    //iterative search liner search
    public int listSearch(int num) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == num) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
//helper function for rec 

    public int helperFun(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0; //it will alays return 0 for head bcz each call will be consider as a 
            //new linkedList
        }
        int indx = helperFun(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    //recursinve search
    public int recSearch(int key) {
        return helperFun(head, key);
    }

    //reverse a linkedlist
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //remove nth node
    public void removeNthNode(int n) {
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToNth = size - n;
        Node prev = head;
        while (i < iToNth) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow will be mid
    }

    //check palindrome
    public boolean checkPalindrom() {
        //base case 
        if (head == null || head.next == null) {
            return true;
        }
        //step 1- fild mid
        Node midNode = findMid(head);

        //step 2- reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head; //left part head

        //step 3 check first and second half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    //find the cycle
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {  //for odd even number of nodes
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //remove cycle
    public static void removeCycle() {
        //1 - detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {  //for odd even number of nodes
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == true) {
            return;
        }

        //step 2 -find meeting point
        if (cycle == true) {
            slow = head;
            Node prev = null; //last node
            while (slow != head) {
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            // step 3 - remove cycle
            prev.next = null;
        }
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    //merge sort LL
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //step 1 find mid
        Node mid = getMid(head);
        //step 2 devide it into two part
        Node righthead = mid.next;
        mid.next = null;
        //step 3 call merge sort for left and right part
        Node newRight = mergeSort(righthead);
        Node newLeft = mergeSort(head);

        //step 4 merge
        return merge(newLeft, newRight);
    }
//Zig-Zag linkedlist

    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; //mid

        //divide into two parts
        Node curr = slow.next;
        slow.next = null;
        //reverse seccond half
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        //zig zag merge
        Node nextL, nextR;
        while (left != null && right != null) {
            //steps for reverse
            nextL=left.next;
            nextR=right.next;
            left.next=right;
            right.next=nextL;
            //update head
            right=nextR;
            left=nextL;
        }
    }

    public static void main(String[] args) {
        Q1 ls = new Q1();
        ls.addFirst(1);
        ls.addFirst(2);
        ls.addFirst(3);
        ls.addFirst(4);
        ls.addFirst(5);
        //ls.addFirst(1);
        //ls.addFirst(5);
        //ls.addLast(9);
        ls.printList();
        ls.head = ls.mergeSort(ls.head);
        ls.printList();
        ls.zigZag();
         ls.printList();
        // System.out.println("size->" +size );
        //ls.addInMiddle(1, 15);
        // ls.reverse();
        // ls.removeNthNode(6);
        //ls.printList();
        //     ls.printList();
        //    // ls.printListRecursively(head);
        //   System.out.println("size->" +size );
        //   System.out.println(ls.removeFirst());
        //   System.out.println("size->" +size );
        //   ls.printList();
        //   System.out.println(ls.removeLastNode());
        // ls.printList();
        //System.err.println(ls.listSearch(4));
        //System.err.println(ls.recSearch(14));
        System.out.println(ls.checkPalindrom());
    }
}
