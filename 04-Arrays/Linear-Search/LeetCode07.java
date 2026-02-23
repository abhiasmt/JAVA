//1732. Find the Highest Altitude
/*

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

*/

public class LeetCode07 {
     public static int largestAltitude(int[] gain) {
        int[] ans =new int[gain.length+1];
        ans[0]=0;
        int k=1;
        int sum=0;

        for(int i=0;i<gain.length;i++){
            if(i==0){
                sum=gain[i];
                ans[k++]=sum;
            }else{
                sum+=gain[i];
                ans[k++]=sum;
            }
            
        }

        int max=ans[0];
        for(int i=0;i<ans.length;i++){
            if(max<ans[i]){
                max=ans[i];
            }
        }

        return max;
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

        System.out.println("The highest altitude is : "+largestAltitude(arr));
    }
    
}
