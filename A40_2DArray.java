import java.util.Scanner;

public class A40_2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // Input
        System.out.print("Enter the values for the Array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Search in matrix
        search(matrix, 5);
    }

    public static boolean search(int martix[][],int key){
        for(int i=0; i< martix.length; i++) {
            for (int j = 0; j < martix[0].length; j++) {
                if(martix[i][j] == key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
