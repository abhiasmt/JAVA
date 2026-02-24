import java.util.*;

public class CyclicSort {

    public static void cyclicSort(int[] ar){
        int i=0;
        while (i<ar.length) {
            int currectPos=ar[i]-1;
            if(ar[i]!=ar[currectPos]){
                int temp=ar[currectPos];
                ar[currectPos]=ar[i];
                ar[i]=temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        // Scanner in=new Scanner(System.in);

        // System.out.print("Enter the array size : ");
        // int sz=in.nextInt();

        // int[] arr=new int[sz];

        // System.out.print("Enter the array : ");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=in.nextInt();
        // }

        // int[] arr={5,4,-3,2,1,0,78,56,34,23,12,11};
        int[] arr={5,4,3,2,1};
        cyclicSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
