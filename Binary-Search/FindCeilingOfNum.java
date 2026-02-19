//We need to find the ceiling value of a target number from an array.

import java.util.*;
public class FindCeilingOfNum {

    public static void FindCeiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean found=false;
        int mid=0;

        while (start<=end) {
            mid=(start+end)/2;

            if (arr[mid]==target) {
                found=true;
                break;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }
        }
        if (found==true) {
            System.out.print("Ceiling value : "+arr[mid]);
        }else{
            System.out.print("Ceiling value : "+arr[start]);   
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

        FindCeiling(arr, target);
    }
}

