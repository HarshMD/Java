public class A25_Factorial {

        public static int factorial(int a){
            int fact = 1;
            for(int i=1; i<=a; i++){
                fact = fact * i;
            }
            return fact;
        }

        public static void main(String[] args){

            int a = 3;
            System.out.println("Factorial of " + a + " is: " + factorial(a));
        }
}
