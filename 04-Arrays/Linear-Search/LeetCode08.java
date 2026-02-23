//Addition of Diagonal Elements in a Matrix

public class LeetCode08 {
    public static int diagonalSum(int[][] mat) {
        int sum=0;

        int mid=(mat.length-1)/2;
        for(int row=0;row<mat.length;row++){
            for(int col=row;col<mat.length;col++){
                
                if(row==col){
                    sum+=mat[row][col];
                }
            }
        }
        for(int row=0;row<mat.length;row++){
            for(int col=mat.length-1;col>=0;col--){
                if(mid==row && mid==col){
                    continue;
                }
                if(row+col==mat.length-1){
                    sum+=mat[row][col];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the size :");
        int sz = in.nextInt();

        int[][] arr =new int[sz][sz];

        System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=in.nextInt();
            }
        }

        System.out.println("The sum of diagonal elements is : "+diagonalSum(arr));
    }

}
