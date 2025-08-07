import java.util.*;


public class A4_TypeConversion {
    public static void main(String[] args){
        // long a = 25;
        // int b = a; // will give error (lossy conversion)
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt(); // Will convert int to float as int size is less than float conversion so no loss of data
        System.out.println(number);

    }
}
