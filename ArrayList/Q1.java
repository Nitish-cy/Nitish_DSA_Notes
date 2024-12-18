import java.util.*;
public class Q1{
    public static boolean isPair(ArrayList<Integer> list, int target){
        //init starting and end point - two pointer approach O(n)
        int sp=0;
        int ep=list.size()-1;
        //logic 
       
        //condition for pointer movement
        while(ep>sp){
             if(list.get(sp)+list.get(ep)==target){
            return true;
        }
        if (list.get(sp)+list.get(ep)>target) {
            ep--;
        }else{
            sp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.print(isPair(list,7));
    }
}