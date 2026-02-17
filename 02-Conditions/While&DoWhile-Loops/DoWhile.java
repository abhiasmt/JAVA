//Do While Loop runs at least one time if the initial (first) condition is false

public class DoWhile {
    public static void main(String[] args) {
        do{
            System.out.println("It Will Run always");
        }while(false);  //Condition is false still it will run at least one time 



        int i=0;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<10);
    }
}
