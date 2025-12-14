// Brute Force
// Time complexity O(n^3) which is not good

public class A48_MaxSubArray {
    public static void printSubArrays(int[] numbers){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.print(" = " + currSum);
                if(max <= currSum){
                    max = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Max sum is " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        printSubArrays(numbers);
    }
}
