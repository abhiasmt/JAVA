import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontRad extends JFrame implements ActionListener{

    JLabel txt;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;

    public FontRad(){
        setTitle("Font Style Selector");
        setSize(400,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt=new JLabel("Hello Abhi");
        txt.setFont(new Font("Arial",Font.PLAIN,20));

        r1=new JRadioButton("Plain");
        r2=new JRadioButton("Bold");
        r3=new JRadioButton("Italic");

        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        add(txt);
        add(r1);
        add(r2);
        add(r3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(r1.isSelected()){
            txt.setFont(new Font("Arial",Font.PLAIN,20));
        }
        else if(r2.isSelected()){
            txt.setFont(new Font("Arial",Font.BOLD,20));
        }
        else if(r3.isSelected()){
            txt.setFont(new Font("Arial",Font.ITALIC,20));
        }
    }

    public static void main(String[] args){
        new FontRad();
    }
}