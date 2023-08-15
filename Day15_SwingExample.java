package Daywise_Notes.Day15;

//1
import javax.swing.*;
import java.awt.event.*;

//2. extends JFrame
public class Day15_SwingExample extends JFrame{

//    3
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

//    4 constructors
    public Day15_SwingExample(){}
    public Day15_SwingExample(String s){
        super(s);
    }

//    5
    public void setComponents(){
//        6 create components
        l1 = new JLabel("Addtion of two numbers");
        l2 = new JLabel("First number");
        l3 = new JLabel("Second number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");

//        7
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50, 80, 100, 20);
        t1.setBounds(150, 80, 100,20);
        l3.setBounds(50,110,100,20);
        t2.setBounds(150,110,100,20);
        b1.setBounds(80,140,100,20);
        l4.setBounds(50,170,200,20);

//       8.  Adding event listener
        b1.addActionListener(new Handler());

//        9 Add components to container
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);

    }

//    10
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = num1+num2;
            l4.setText("Sum is " + result);
        }
    }

    public static void main(String[] args) {
//        11
        Day15_SwingExample jf = new Day15_SwingExample("GUI Title");
//        12
        jf.setComponents();

//0
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
