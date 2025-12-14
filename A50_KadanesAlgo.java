// Time complexity O(n)

public class A50_KadanesAlgo {
    public static void kadanes(int[] numbers){
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxsum =Math.max(currSum,maxsum);
        }

        System.out.print("Max sum is " + maxsum);
    }

    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
