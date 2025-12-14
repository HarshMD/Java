import java.util.*;

public class A43_LargestNumber {
    public static int getLargest(int[] numbers){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value in the array is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 9, 10, 14, 17};
        System.out.println("Largest value in the array is: " + getLargest(numbers));

    }
}
