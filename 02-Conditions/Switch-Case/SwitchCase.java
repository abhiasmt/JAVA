import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your choice : ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("SunDay");
                break;
            case 2:
                System.out.println("MonDay");
                break;
            case 3:
                System.out.println("TuesDay");
                break;
            case 4:
                System.out.println("WednesDay");
                break;
            case 5:
                System.out.println("ThusDay");
                break;
            case 6:
                System.out.println("FriDay");
                break;
            case 7:
                System.out.println("SaturDay");
                break;
        
            default:
                break;
        }
    }
}
