public class A51_BasicSortingAlgo {
    public static void bubbleSort(int[] arr){
        for(int turns=0; turns<=arr.length-2; turns++){
            for(int j=0; j<=arr.length-2-turns; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            int minPos = i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
