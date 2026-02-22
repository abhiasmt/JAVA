import java.util.*;

public class BSinStrictlySortedMatrix {

    public static int[] BinarySearch(int[][] arr, int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd) {
            int mid=cStart+(cEnd-cStart)/2;
            if (arr[row][mid]==target) {
                return new int[]{row,mid};
            }else if (arr[row][mid]>target) {
                cEnd=mid-1;
            }else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] FindAns(int[][] arr, int target){
        int row=arr.length;
        int col=arr[0].length;

        if (row==1) {
            BinarySearch(arr, 0, 0, col-1, target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        while (rStart<(row-1)) {
            int mid=rStart+(rEnd-rStart)/2;

            if (arr[mid][cMid]==target) {
                return new int[]{mid,cMid};
            }else if (arr[mid][cMid]>target) {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        if (arr[rStart][cMid]==target) {
            return new int[]{rStart,cMid};
        }else if (arr[rStart+1][cMid]==target) {
            return new int[]{rStart+1,cMid};
        }
        //For 1st sub array:-
        if (target<arr[rStart][cMid-1]) {
            return BinarySearch(arr, rStart, 0, cMid-1, target);
        }
        //For 2nd sub array:-
        if (target<arr[rStart+1][cMid-1]) {
            return BinarySearch(arr, rStart+1, 0, cMid-1, target);
        }
        //For 3rd sub array:-
        if (target>arr[rStart][cMid+1]) {
            return BinarySearch(arr, rStart, cMid+1, col-1, target);
        }
        //For 4th sub array:-
        if (target>arr[rStart+1][cMid+1]) {
            return BinarySearch(arr, rStart+1, cMid+1, col-1, target);
        }

        return new int[]{-1,-1};
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

        System.out.println(Arrays.toString(FindAns(arr, target)));
    }
}
