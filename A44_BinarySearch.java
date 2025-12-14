public class A44_BinarySearch {
    public static int binarySearch(int[] numbers, int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid] > key){
                end = mid - 1;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                return -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 9, 10, 14, 17};
        int key = 4;

        int index = binarySearch(numbers, key);
        if(index == -1){
            System.out.println("Key not found");
        } else{
            System.out.println("The key is present at: " + index + " index");}

    }
}
