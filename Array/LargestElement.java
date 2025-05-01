public class LargestElement{
    public static int findlargestElement  (int arr[]){
        int maxEle=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>maxEle){
                //System.out.println("found"); 
                 maxEle=arr[i];
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,8};
    System.out.println(findlargestElement(arr));        
    }
}