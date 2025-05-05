
public class Sumsubarray{
    public static void pairsArr(int arr[]){
        for (int i=0;i<arr.length;i++) {
          
            for (int j=i;j<arr.length;j++) {
                 System.out.print("[");
                  int sum=0;
                for (int k=i;k<=j;k++) {
                     sum=sum+arr[k];
                }
                System.out.print(sum);
                System.out.println("]");
            }
           
        }
    }
public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    pairsArr(arr);
}
}