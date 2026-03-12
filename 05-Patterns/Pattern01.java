

public class Pattern01 {
    public static void main(String[] args) {
        Patrn01(4); 
    }

    public static void Patrn01(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
