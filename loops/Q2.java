// Question 3 :Write a program to find the factorialof any number entered by the user.
//  (Hint : factorialofanumbern=n*(n-1)*(n-2)*(n-3)*……*1andexistsforpositivenumbers
//  only. We write factorial as n!
//  So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
//  Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

 import java.util.Scanner;
 public class Q2 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
        System.out.println("Factorial: "+ fact);
    }
 }