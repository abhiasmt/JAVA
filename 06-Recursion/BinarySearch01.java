// package 06-Recursion;

public class BinarySearch01 {
    public static void main(String[] args) {
        int[] ar={11,12,33,34,53,65,70,82,94};
        // int tar=6;
        System.out.println("Found at index: " + BinarySearch(ar, 34, 0, ar.length-1));

    }

    public static int BinarySearch(int[]ar,int target,int start, int end){

        if (start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(ar[mid]<target){
            return BinarySearch(ar, target, mid+1, end);
        }else if(ar[mid]>target){
            return BinarySearch(ar, target, start, mid-1);
        }return mid;
    }
}
