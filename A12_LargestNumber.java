
import java.util.*;

public class A12_LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        System.out.print("Enter value of C: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println( a + "->A is Greatest Number");
        } else if(b > c) {
            System.out.println( b + "->b is Greatest Number");
        }
        else{
            System.out.println( c + "->c is Greatest Number");
        }
    }
}
