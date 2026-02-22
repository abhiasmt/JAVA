
import java.util.*;


public class RowColSortedArray {

    static int[] SearchMatrix(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;

        while (row<matrix.length && col>=0) {
            if (matrix[row][col]==target) {
                return new int[]{row,col};
            }else if (matrix[row][col]>target) {
                col--;
            }else{
                row++;
            }
        }return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the matrix size (Sorted in row and col wise): ");
        int sz=in.nextInt();

        int[][] arr=new int[sz][sz];

        System.out.print("Enter the array : ");
        for(int row=0; row<sz;row++){
            for(int col=0;col<sz;col++){
                arr[row][col]=in.nextInt();
            }
        }

        System.out.print("Enter the target : ");
        int target=in.nextInt();

        System.out.println(Arrays.toString(SearchMatrix(arr, target)));
    }   
}
