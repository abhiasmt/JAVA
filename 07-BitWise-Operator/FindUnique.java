// Find the unique num (Only appears once in the array)

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,1,6,4,5,4,5};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique=0;

        for (int n : arr) {//for each loop
            unique ^=n; // Using XOR operator (eg.:- A XOR A = 0)
            //So when we perform XOR operation to all the element- 
            //-of the array the duplicates numbers become 0 (eg.:- 2 XOR 2 = 0)
        }
        return unique;
    }
}
