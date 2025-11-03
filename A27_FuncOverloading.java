public class A27_FuncOverloading {

    //func to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }

    //func to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //func to calculate sum of 3 numbers of different data type
    public static float sum(float a, float b, int c){
        return a + b + c;
    }

    public static void main(String[] args){

        System.out.println(sum(5, 2));
        System.out.println(sum(5, 2, 4));
        System.out.println(sum(2.2f, 4.1f, 1));
    }
}
