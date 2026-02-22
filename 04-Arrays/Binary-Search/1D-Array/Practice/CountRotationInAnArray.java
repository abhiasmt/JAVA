import java.util.Scanner;

public class CountRotationInAnArray {

    public static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int sz=in.nextInt();

        int[] arr=new int[sz];

        System.out.print("Enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        int ans=FindPivot(arr)+1; //We add one to get the actual rotation 
        // because the pivot index is zero-based, and the number of rotations is one more than the pivot index.
        // For example, if the pivot index is 2, it means the array has been rotated 3 times (0, 1, 2).
        // If the pivot index is -1, it means the array is not rotated, and the number of rotations is 0.

        System.out.println("The number of rotation is : "+ans);
    }
}
