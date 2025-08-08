import java.util.Scanner;

public class A13_TernaryOperator {
    public static void main(String[] args){
        int num = 4;

        String type = ((num%2) == 0) ? "Even" : "Odd"; // Ternary Operator
        System.out.print(type);
    }
}
