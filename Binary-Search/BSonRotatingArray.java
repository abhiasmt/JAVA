//Here we are going to search an element in a rotating array.
//A rotating array is an array that has been rotated at some pivot unknown to us beforehand. We can find the pivot element in O(log n) time and then perform binary search on both sides of the pivot element to find the target element.
import java.util.*;
public class BSonRotatingArray {

    public static int FindAns(int[] arr, int target){
        int pivotIdx = FindPivot(arr);

        // if not rotated
        if (pivotIdx == -1) {
            return BinarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivotIdx] == target){
            return pivotIdx;
        } 

        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0, pivotIdx - 1);
        }

        return BinarySearch(arr, target, pivotIdx + 1, arr.length - 1);
    }

    public static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        // while (start<=end) {
        //     int mid=start+(end-start)/2;
        //     if (arr[mid]>arr[mid+1]) {
        //         return mid;
        //     }else if(arr[mid]<arr[mid+1]){
        //         start=mid+1;
        //     }else{
        //         end=mid;
        //     }
        // }return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check mid < end before mid+1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // check mid > start before mid-1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }return -1;
    }

    public static int BinarySearch(int[] arr, int target, int start, int end){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }return -1;
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

        System.out.print("Enter the target : ");
        int target=in.nextInt();

        int ans=FindAns(arr, target);
        if (ans==-1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+ans);
        }
    }
}
