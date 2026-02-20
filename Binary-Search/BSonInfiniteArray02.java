//Approach - 2 

import java.util.*;
public class BSonInfiniteArray02 {
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        int ans=-1;

        while (arr[end]<=target) {
            start=end+1;
            end=end*2;
        }
        ans=BinarySearch(arr, target, start, end);
        
        return ans;
    }
    public static int BinarySearch(int[] arr,int target, int start,int end){
        boolean found=false;
        int mid=0;

        while (start<=end) {
            mid=start+(end-start)/2;

            if (target==arr[mid]) {
                found=true;
                break;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else if (target<arr[mid]) {
                end=mid-1;
            }
        }
        if(found) {
            return mid;
        }else{
            return -1;
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

        int ans=ans(arr, target);
        System.out.println("Found at index : "+ans);

    }
}

