//Printing 1-10 table => using nested loop

public class ForLoop02 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println();
            System.out.println("Table of "+i);
            System.out.println();
            for(int j=1;j<=10;j++){
                System.out.println(i + " X "+j+" = "+ (i*j));
                
            }
        }
    }
}
