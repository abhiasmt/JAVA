//Here we searching an element in a bitonic or mountain array.
//A mountain array is an array that increases and then decreases. We can find the peak element in O(log n) time and then perform binary search on both sides of the peak element to find the target element.

import java.util.Scanner;
public class SearchInMountainArray {
    public static int FindAns(int[] arr, int target){
        int peek=SearchPeek(arr);

        int ans=BinarySearch(arr, target, 0, peek);

        if (ans!=-1) {
            return ans;
        }else{
            return BinarySearch(arr, target, peek+1, arr.length-1);
        }
    }

    public static int SearchPeek(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }return start;

    }

    public static int BinarySearch(int[] arr, int target,int start,int end){
        boolean isAscending=false;

        if (arr[start]<arr[end]) {
            isAscending=true;
        }

        while (start<=end) {
            int mid=start+(end-start)/2;

            if(isAscending){
                if (arr[mid]<target) {
                    start=mid+1;
                }else if (arr[mid]>target) {
                    end=mid-1;
                }else{
                    return mid;
                }
            }else{
                if (arr[mid]<target) {
                    start=mid+1;
                }else if (arr[mid]>target) {
                    end=mid-1;
                }else{
                    return mid;
                }
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