// Doreen
// this is the main program of the application which is a simulation of a mobile application through
// which a user can access, save, apply and share opportunities
// this is a simulation of the application's front end and user interface

import javax.swing.*;
import javax.swing.JOptionPane;

public class main_program {
    public static void main (String[] args){
//        System.out.println("******************\"" +
//                "   *welcome to StemPoint! your one stop center for opportunities in STTEM\"" +
//                "   *our application gives recommendations of opportunities that you can apply for");

        // this is the message that is displayed on the dialog box
        JOptionPane.showMessageDialog(null,"Welcome to STEMPoint" +
                "\n-----------------------------------------------------------------------" +
                "\nYour one stop center for opportunities in STEM" +
                "\non this app, you can categorise the opportunities depending on " +
                "\nyour areas of interest or level of study" +
                "\nyou can also search, save, share opportunities\n" +
                "\n visit the homepage to get started" +
                "\n GOOD LUCK!");



 //menu bar showing app features
        JMenu menu;
        JMenuItem i1, i2, i3, i4, i5;
//
        JFrame f= new JFrame("STEMPoint");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("click here to view homepage");
//        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("Competitions and conferences");
        i2=new JMenuItem("Exchange programs");
        i3=new JMenuItem("internships and jobs");
        i4=new JMenuItem("summer schools");
        i5=new JMenuItem("scholarships");
        menu.add(i1); menu.add(i2); menu.add(i3); menu.add(i4); menu.add(i5);

        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);






// this screen pops up when the user opts to view competitions and conferences
//
        JOptionPane.showMessageDialog(null,"" +
                "Competitions and Conferences" +
                "\n------------------------------------" +

                "\nGrace Hopper celebration " +
                "\nWomen Deliver young leaders" +
                "\nTransform Africa summit" +
                "\nGirls(20) summit" +
                "\nFuture news summit" +
                "\nOne Young World");

        JOptionPane.showMessageDialog(null,"" +
                "Scholarships and summer schools" +
                "\n------------------------------------" +

                "\nCommonWealth Masters Scholarship in UK " +
                "\nmastercard foundation scholarship" +
                "\nDAAAD scholarship in Germany" +
                "\nFullbright USA sholarship" +
                "\nChevening" +
                "\nKhight Henssey scholarship at Stanfold");



    }
}
