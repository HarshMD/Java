import java.util.Scanner;

public class A35_BinaryTrianglePattern {

public static void zero_one_triangle( int n){
    int counter = 1;


    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if( (i+j) % 2 == 0){
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args){
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zero_one_triangle(n);

    }
}
