import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String fNo=JOptionPane.showInputDialog("Enter the First Integer :");
        String sNo=JOptionPane.showInputDialog("Enter the second No :");


        int no1=Integer.parseInt(fNo);
        int no2=Integer.parseInt(sNo);

        int sum=no1+no2;

        JOptionPane.showMessageDialog(null,"The Sum is : "+ sum);
    }
}
