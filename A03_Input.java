import java.util.Scanner;

public class A03_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String input = sc.nextLine(); // To take input with space
        System.out.println(input);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // To take numeric values
        System.out.println(age);


        System.out.print("Enter your Marks: ");
        Float marks = sc.nextFloat(); // To take decimal
        System.out.println(marks);
    }
}
