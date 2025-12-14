public class A42_LinearSearch {
    public static int linearSearch(int[] numbers, int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 9, 10, 14, 17};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key not found");
        } else{
            System.out.println("Key found at index: " + index);
        }

    }
}
