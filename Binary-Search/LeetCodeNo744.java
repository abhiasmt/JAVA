//744. Find Smallest Letter Greater Than Target
/*

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

*/
import java.util.*;
public class LeetCodeNo744 {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        boolean found=false;
        int mid=0;


        while (start<=end) {
            mid=(start+end)/2;

            
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int sz=in.nextInt();

        char[] arr=new char[sz];

        System.out.print("Enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.next().charAt(i);
        }

        System.out.print("Enter the target : ");
        char target=in.next().charAt(0);

        char result=nextGreatestLetter(arr, target);
        System.out.println("Result : "+result);
    }
}


//LeetCode solution :-
/*

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        boolean found=false;
        int mid=0;


        while (start<=end) {
            mid=(start+end)/2;

            
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}

*/