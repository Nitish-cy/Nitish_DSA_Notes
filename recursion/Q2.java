public class Q1{
     public static int optPower(int a, int n){
        if(n==0){
            return 1;
        }
       int halfPower= optPower(a,n/2);
       int halfSq=halfPower*halfPower;
       if(n%2!=0){
        halfSq=a*halfSq;
       }
       return halfSq;
    }
    public static void main(String args[]){
    //    int arr[] = {1, 8, 3};
        System.out.print(optPower(2,10));
    }
   
}