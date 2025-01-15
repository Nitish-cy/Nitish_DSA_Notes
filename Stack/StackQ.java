
import java.util.*;

public class StackQ {
    //push at the bottom 

    public static void pushAtBottom(Stack<Integer> s, int data) {
        //yek time ayega jb jane ke time elements ko nakalte nikalte stack empty ho jayega 
        //then hm usme apne element ko push kr denge 
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        //jane ke time yek element nikala
        int top = s.pop();
        pushAtBottom(s, data);//call lagaya for doosre ke liye
        //ane ke time phir se push krna hai
        s.push(top);
        System.err.println("11111");
    }
    //reverse a string

    public static String reverseStr(String str) {
        //jaisa ki hm jante h agr stack me kuchh bhi 
        // push krne ke bad pop krenege then o reverse hi milege to hmne wahi kiya
        // phle push kiya yek yek character uske bad pop krke store kr liya yek new str me 
        Stack<Character> st = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            st.push(str.charAt(indx));
            indx++;
        }
        StringBuilder strn = new StringBuilder();
        while (!st.isEmpty()) {
            char curr = st.pop();
            strn.append(curr);
        }
        return strn.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        //yek time ayega jb jane ke time elements ko nakalte nikalte stack empty ho jayega 
        //then hm usme apne element ko push kr denge 
        if (s.isEmpty()) {
            return;
        }
        //jane ke time yek element nikala
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);//call lagaya for doosre ke liye
        //ane ke time phir se push krna hai lekin yarra is bar top nhi krna h nhi to wahi phir se 
        //mil jayega to is bar hm reuse krenge pushbottom ko aur bottom me push kr denge 

    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        //pushAtBottom(st,4);
        printStack(st);
        reverseStack(st);
        printStack(st);
        // while (!st.isEmpty()) {
        //     System.err.println(st.pop());
        // }
        //System.err.println(reverseStr("Mishra"));
    }

}
