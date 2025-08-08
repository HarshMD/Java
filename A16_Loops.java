import java.util.Scanner;

public class A16_Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // For Loop
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        // While Loop
        int j=0;
        while(j<=10){
            System.out.println(j);
            j++;
        }
        // Do While Loop
        int k =0;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);

    }
}
