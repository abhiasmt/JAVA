import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame implements ActionListener{

    JButton btn1,btn2,btn3;

    public ButtonDemo(){
        setTitle("Button Demo");
        setSize(500,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1=new JButton("ClickMe");
        btn1.addActionListener(this);

        ImageIcon img=new ImageIcon("icon.png");
        btn2=new JButton(img);
        btn2.setText("ImgBtn");
        btn2.setHorizontalTextPosition(JButton.CENTER);
        btn2.setVerticalTextPosition(JButton.BOTTOM);
        btn2.addActionListener(this);

        ImageIcon nimg=new ImageIcon("normal.png");
        ImageIcon himg=new ImageIcon("hover.png");

        btn3=new JButton("HoverMe",nimg);
        btn3.setRolloverIcon(himg);
        btn3.setRolloverEnabled(true);
        btn3.addActionListener(this);

        add(btn1);
        add(btn2);
        add(btn3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            JOptionPane.showMessageDialog(this,"Btn1Clicked");
        }
        else if(e.getSource()==btn2){
            JOptionPane.showMessageDialog(this,"Btn2Clicked");
        }
        else if(e.getSource()==btn3){
            JOptionPane.showMessageDialog(this,"Btn3Clicked");
        }
    }

    public static void main(String[] args){
        new ButtonDemo();
    }
}