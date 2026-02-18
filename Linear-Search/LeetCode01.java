//1295. Find Numbers with Even Number of Digits


/*
Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

*/

import java.util.Scanner;

public class LeetCode01 {
    static int Digits(int num){
        int count=0;
        if(num<0){
            num=(num*-1);
        }
        if(num==0){
            count=1;
        }
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }

    static boolean isEven(int num){
        int noDigit=Digits(num);
        return noDigit%2==0;
        
    }

    static int FindNum(int[] arr){
        int count=0;
        for (int i : arr) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = {12,433,465,5768,79,0,-6767};
        int[] arr=new int[5];

        System.out.print("Enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Total even digit : "+FindNum(arr));;

    }
}


// Efficiency : O(n) where n is the size of the array.
// Efficient way :-
/*

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {

            int c=(int)Math.log10(nums[i]);
            if(c%2==1) {

                count++;
            }
        }
        return count;
    }
}

=> Where log10 gives the number of digits in the number and we check if it is odd or even. If it is odd then we increment the count. This way we can find the count of numbers with even number of digits in O(n) time complexity and O(1) space complexity.
=> Another efficient way is to convert the number to string and check the length of the string. If the length is even then we increment the count. This way we can find the count of numbers with even number of digits in O(n) time complexity and O(1) space complexity.
*/ 