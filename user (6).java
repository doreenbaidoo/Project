//Doreen
// this is the user class showing the GUI for getting the admin name and password using Jframe,JTextField and
// JPasswordField
// also includes admin dashboard screen source code
// almost the same as user class with difference in dashboards and functionality

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class text extends JFrame implements ActionListener {

    static JTextField t;  // JTextField
    static JPasswordField pass;  // JPasswodField
    static JFrame f;  // JFrame
    static JButton b;  // JButton
    static JLabel l;   // label to display text

    text(){   // default constructor

    }

    // main class
    public static void main(String[] args){


        f = new JFrame("user log in");    // new frame for storing text field and button
        l = new JLabel("please enter username and password"); //label to display text or message on screen

        // creating a new button for submitting
        b = new JButton("submit");

        text te = new text();     // object of the text class
        b.addActionListener(te);   // addActionListener to button

        // create a object of JTextField with 16 columns and initial text

        t = new JTextField("enter name", 16);
        pass = new JPasswordField(16);  // create a object of passwodField with 16 columns
        Font fo = new Font("Serif", Font.ITALIC, 20); // creating an object of font type
        t.setFont(fo);            // setting the font of the textfield
        JPanel p = new JPanel();  // creating a panel to add buttons and textfield

        // adding buttons, label and textfield to panel
        p.add(t);
        p.add(pass);
        p.add(b);
        p.add(l);


        f.add(p);  // adding panel to frame
        f.setSize(300, 300); // setting the size of frame

        f.show();
    }

    // when the submit button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // setting the text of the label to the text of the field
            l.setText("name = " + t.getText() + "\t Password = " + pass.getText());
            t.setText("  ");   // set the text of field to blank
            pass.setText("");  // set the text of password field to blank
        }

        // admin dashboard; this screen appears after user logs in

        JMenu menu;
        JMenuItem i1, i2, i3, i4, i5;

        JFrame f= new JFrame("STEMPoint");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("click to view User Dashboard");
//        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("browse opportunities");
        i2=new JMenuItem("search for opportunities");
        i3=new JMenuItem("save opportunities");
        i4=new JMenuItem("apply for opportunities");
        i5=new JMenuItem("share opportunities");
        menu.add(i1); menu.add(i2); menu.add(i3); menu.add(i4); menu.add(i5);



        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

