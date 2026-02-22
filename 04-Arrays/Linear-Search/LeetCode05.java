//1470. Shuffle the Array

/*

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

*/

import java.util.Scanner;

public class LeetCode05 {

   
    public static int[] shuffle(int[] ar, int n) {
        int start=0;
        int end=ar.length;

        int[] ans =new int[ar.length];
        int k=0;

        while(start<n && n <end){
            ans[k++]=ar[start];
            start++;
            ans[k++]=ar[n];
            n++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter the size :");
        int sz = in.nextInt();

        int[] arr =new int[sz];

        System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the n :");
        int n = in.nextInt();

        int[] ans=shuffle(arr, n);
        System.out.println("The shuffled array is :");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        

    }
}
