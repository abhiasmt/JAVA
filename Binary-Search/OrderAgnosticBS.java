//This is a Java implementation of Order Agnostic Binary Search, which can be used to search for an element in a sorted array that can be either in ascending or descending order.

import java.util.*;
public class OrderAgnosticBS {

    public static void BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        boolean isAscending;
        boolean found=false;

        if (arr[start]<arr[end]) {
            isAscending=true;
        }else{
            isAscending=false;
        }


        while (start<=end) {
            mid=start+(end-start)/2;

            if(arr[mid]==target){
                found=true;
                break;
            }

            if(isAscending){
                if(arr[mid]>target){
                    end=mid-1;
                }else if(arr[mid]<target){
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }else if(arr[mid]>target){
                    start=mid+1;
                }

            }
        }
        if (found==true) {
            System.out.print("Element found at : "+mid);
        }else{
            System.out.print("Element not found");   
        }
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

        BinarySearch(arr, target);
    }
}
