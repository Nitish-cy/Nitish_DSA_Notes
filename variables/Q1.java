// Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
//  these 3 numbers.
//  (Hint : Average of N numbers is sum of those numbers divided by N)

// Sol- :
import java.util.*;
// Average of 3 numbers
public class Q1 {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);
    }
}
