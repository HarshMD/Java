import java.util.Scanner;

public class A15_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of num1: ");
        int a = sc.nextInt();
        System.out.print("Enter value of num2: ");
        int b = sc.nextInt();
        System.out.print("Enter operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);


        switch(operator){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
            case '%':
                System.out.print(a%b);
                break;
            default:
                System.out.print("Enter valid operator");
                break;

        }
    }
}
