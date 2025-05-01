public class LinearSearch{
    public static  boolean  search(int arr[], int element){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==element){
                //System.out.println("found"); 
                 return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int element=8;
    System.out.println(search(arr,element));;        
    }
}