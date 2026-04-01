import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextStyle extends JFrame implements ItemListener{

    JLabel txt;
    JCheckBox bold,italic;

    public TextStyle(){
        setTitle("Text Style Changer");
        setSize(400,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt=new JLabel("Hello My Self Abhi");
        txt.setFont(new Font("Arial",Font.PLAIN,20));

        bold=new JCheckBox("Bold");
        italic=new JCheckBox("Italic");

        bold.addItemListener(this);
        italic.addItemListener(this);

        add(txt);
        add(bold);
        add(italic);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        int style=Font.PLAIN;

        if(bold.isSelected() && italic.isSelected()){
            style=Font.BOLD+Font.ITALIC;
        }
        else if(bold.isSelected()){
            style=Font.BOLD;
        }
        else if(italic.isSelected()){
            style=Font.ITALIC;
        }

        txt.setFont(new Font("Arial",style,20));
    }

    public static void main(String[] args){
        new TextStyle();
    }
}