
import java.util.Stack;

public class StockSpan {

    public static void StSpan(int stock[], int span[]) {
        Stack<Integer> st = new Stack<>();
        //jaisa hm jante h ki phle stock ke liye span sadaiv 1 hoga bcz usse phle koi na cchota 
        //h na bda aur hmara  logic h ki sare indexes ko stack me store kr lo
        span[0] = 1;
        st.push(0);
        //check kr lo sare stcok ka span
        //i=1 kaheseki hme 0 ka to default pta hi h
        for (int i = 1; i < stock.length; i++) {
            // phle current price dekh lo stock ki
            int currPrice = stock[i];
            //span nikalne ke liye hme stack ke andr ke sare index ki values ko check krna pdega 
            //till stack is not empty aur span tabhi milega jb current price phle ki kisi price se km ho ya 
            //brabr ho so hme traverse krke check krna pdega 
            while (!st.isEmpty() && currPrice > stock[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1; //iska mtlb agr check krte krte empty tk a gye it means there is no value greater than this
                //to sari values chhoti hi h to sbka count +1 (khud ko bhi to count kregi na )
            } else {
                //nhi to hme yaha calculat krna pdega bcz hm travese krte krte us value tk a gye h 
                //jha ye current se badi ya equal h to hm peek krke value ko nikal lenge (niklega index hi)
                //bcz hme bs ye dekhna h kb tk se kb tk ye high h 
                int preHigh = st.peek();
                span[i] = i - preHigh;
            }
            st.push(i);//hme index to ya days to push krne pdenge na stack me
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        StSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.err.println(span[i]);
        }
    }
}
