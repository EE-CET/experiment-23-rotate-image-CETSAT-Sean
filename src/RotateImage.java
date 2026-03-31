import java.util.Scanner;
public class RotateImage {
        static Scanner sc = new Scanner(System.in);

        public static void RotateImage(int[][] arr){
                int temp = 0;
                int n = arr.length;
                for(int i=0; i<n; i++){
                        for(int j=i+1; j<n; j++){
                                temp = arr[i][j];
                                arr[i][j] = arr[j][i];
                                arr[j][i] = temp;
                        }
                }
                for(int i=0; i<n; i++){
                        int l = 0;
                        int r = n-1;
                        while(l<r){
                                temp = arr[i][l];
                                arr[i][l] = arr[i][r];
                                arr[i][r] = temp;
                                l++;
                                r--;
                        }
                }
        }
        // TODO: Read n and n (dimensions)
        // TODO: Read the matrix elements
        // TODO: Rotate the matrix 90 degrees clockwise INPLACE
        // Hint: 1. Transpose the matrix. 2. Reverse each row.
        // TODO: Print the rotated matrix
        public static void main(String[] args) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int[][] arr = new int[n1][n2];
                for(int i=0; i<n1; i++){
                        for(int j=0; j<n2; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                RotateImage(arr);
                for(int i=0; i<n1; i++){
                        for(int j=0; j<n2; j++){
                                System.out.print(arr[i][j]);
                                if (j != n2-1){
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                }
        }
}