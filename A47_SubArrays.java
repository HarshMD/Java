public class A47_SubArrays {
    public static void printSubArrays(int[] numbers){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
            int total = 0;
                for(int k=i; k<=j; k++){
                    total += numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.print(" = " + total);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub arrays are " + ts);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
