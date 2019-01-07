
import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener {

    JRadioButton B1, B2, B3;
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1;
    JTextField t1, t2, t3;
    JTextArea T;

    public Swing(String s) {
        super(s);

        ButtonGroup BG = new ButtonGroup();

        l1 = new JLabel("*** VIT ERP SYSTEM ***");
        l2 = new JLabel("Name : ");//
        l3 = new JLabel("Degree : ");
        l4 = new JLabel("Gr no. : ");
        l5 = new JLabel("Which employee details you want to see ?");
        l6 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        T = new JTextArea();
        b1 = new JButton("Submit");
        B1 = new JRadioButton("IT HOD");
        B2 = new JRadioButton("DS PROF");
        B3 = new JRadioButton("DSGT PROF");

        setLayout(null);

        l1.setBounds(80, 10, 200, 20);

        l2.setBounds(50, 50, 100, 20);
        t1.setBounds(100, 50, 200, 20);

        l3.setBounds(50, 100, 100, 20);
        T.setBounds(110, 100, 200, 50);

        l4.setBounds(50, 200, 100, 20);
        t2.setBounds(120, 200, 200, 20);

        l5.setBounds(50, 250, 400, 20);

        l6.setBounds(50, 380, 200, 100);

        B1.setBounds(100, 280, 200, 20);
        B2.setBounds(100, 310, 200, 20);
        B3.setBounds(100, 340, 200, 20);
        b1.setBounds(200, 500, 100, 20);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        b1.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(T);
        add(b1);
        BG.add(B1);
        BG.add(B2);
        BG.add(B3);

        this.add(B1);
        this.add(B2);
        this.add(B3);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == B1) {
            String msg = "<html>Your Query Details : <br>"
                    + "Name : Dr. Ghadekar<br>"
                    + "Salary : 256000<br>"
                    + "Bonus : 14000<br>"
                    + "Age : 56 years<br>"
                    + "Designation : Employee";
            l6.setText(msg);
            JOptionPane.showMessageDialog(this, "Query details are given below");
        }

        if (e.getSource() == B2) {
            String msg = "<html>Your Query Details : <br>"
                    + "Name : Mr Kodgule<br>"
                    + "Salary : 140000<br>"
                    + "Bonus : 10000<br>"
                    + "Age : 46 years<br>"
                    + "Designation : Employee";
            l6.setText(msg);
            JOptionPane.showMessageDialog(this, "Query details are given below");
        }

        if (e.getSource() == B3) {
            String msg = "<html>Your Query Details : <br>"
                    + "Name : Ms Talwar<br>"
                    + "Salary : 120000<br>"
                    + "Bonus : 8000<br>"
                    + "Age : 36 years<br>"
                    + "Designation : Employee";
            l6.setText(msg);
            JOptionPane.showMessageDialog(this, "Query details are given below");
        }

        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(this, "Form is submitted successfully");
        }

    }

    public static void main(String[] args) {
        Swing jf = new Swing("Welcome To VIT ERP SYSTEM");
        jf.setSize(600, 580);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
