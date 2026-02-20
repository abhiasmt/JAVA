//Perform binary search on an infinite array
//In an infinite array, we don't know the size of the array. So, we can't apply binary search directly on the array. We need to find the range in which the target element is present and then apply binary search on that range.
//Here, we will start with a range of 0 to 1 and keep doubling the range until we find the target element or we find an element greater than the target element. Once we find the range, we can apply binary search on that range.


import java.util.*;
public class BSonInfiniteArray {

    public static void BinarySearch(int[] arr,int target, int start,int end){
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
            System.out.println("Found at index : "+mid);
        }else{
            BinarySearch(arr, target, end+1, end*2);
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

        BinarySearch(arr, target, 0, 1);
    }
}
