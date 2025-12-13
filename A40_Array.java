import java.util.Scanner;

public class A40_Array {
    public static void main(String[] args){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects: ");
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //maths
        marks[2] = sc.nextInt(); //che,

        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("The average of marks is: " + avg);
        System.out.println("Length of array is " + marks.length);
    }
}
