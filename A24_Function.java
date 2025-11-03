public class A24_Function {

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args){

        int value = multiply(3,5);
        System.out.println("a * b = " + value);
        int a = 10;
        int b = 9;
        value = multiply(a,b);
        System.out.println("a * b = " + value);
    }
}
