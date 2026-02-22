//Bitonic Array - An array which is first increasing and then decreasing. We have to find the element in the bitonic array.
//Also known as Mountain Array

import java.util.*;
public class BSonBitonicArray {

    static int FindArrayMidle(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int ans=0;
        boolean found=false;

        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }else if (arr[mid]<arr[mid-1]) {
                end=mid-1;
            }else{
                ans=arr[mid];
                found=true;
                break;
            }
        }if(found){
            return ans;
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

        // System.out.print("Enter the target : ");
        // int target=in.nextInt();

        int ans = FindArrayMidle(arr);
        System.out.println("Peak element in the bitonic array is : "+ans);
   } 
}
