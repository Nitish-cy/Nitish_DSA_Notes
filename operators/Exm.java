// what will be the out put 
public class Test {
 public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + “ , ”);
        System.out.print(exp2);
    }
 }

// 2.
public class Test {
 public static void main(String[] args) {
            int x = 200, y = 50, z = 100;
            if(x > y && y > z){
            System.out.println("Hello");
            }
            if(z > y && z < x){
            System.out.println("Java");
            }
            if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
            }
 }
 }

 //3.
 public class Test {
 public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
 }