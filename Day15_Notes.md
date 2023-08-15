># GUI

# 2 APIs
* AWT - Abstract Windowing Toolkit
* Swing

># AWT
* `java.awt.*`
* 12 packages
* 2 Package commonly used
1. java.awt
2. java.awt.event

* Classes in AWT
1. GUI Component - Button, TextField, Label
2. GUI Container - Frame, Panel, Dialog, ScollPage
3. Layout Managers - FlowLayout, BorderLayout, GridLayout, CardLayout
4. Custom Graphics - Graphics, Color, Font

* Events
* Classes - ActionEvent, MouseEvent, Keyevent, WindowEvent
* Interface - ActionListener, MouseListener, KeyListener, WindowListener

* `A component must be kept in a Container`
* Every container has a method - `add(Component c)`

add(b1)
add(t1)
add(l1)

># Swing
* `javax.swing.*` : javax
* Extended version of AWT

* Swing UI Components
1. JFrame
2. JButton
3. JLabel
4. JTextField
5. JRadioButton
6. JList
7. JComboBox
8. JCheckbox
9. JPasswordField etc.....


* Create a container JFrame
   1. Driver Class : JFrame jf = new JFrame();
   2. MyClass : class MyClass extends JFrame

```java
package Daywise_Notes.Day15;

//1
import javax.swing.*;
import java.awt.event.*;

//2. extends JFrame
public class SwingExample extends JFrame{

//    3
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

//    4 constructors
    public SwingExample(){}
    public SwingExample(String s){
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
        SwingExample jf = new SwingExample("Sara's GUI");
//        12
        jf.setComponents();

//0
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


```
