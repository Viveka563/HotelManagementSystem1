package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception  extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Reception(){

        b1 = new JButton("New Customer Form");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(20,20,150,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Rooms");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(20,50,150,30);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Department");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setBounds(20,80,150,30);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("All Employee info");
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.setBounds(20,110,150,30);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Customer information");
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.BLACK);
        b5.setBounds(20,140,150,30);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("manager information");
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.BLACK);
        b6.setBounds(20,170,150,30);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("Check Out");
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);
        b7.setBounds(20,200,150,30);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("Update Check Status");
        b8.setBackground(Color.WHITE);
        b8.setForeground(Color.BLACK);
        b8.setBounds(20,230,150,30);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("update Room Status");
        b9.setBackground(Color.WHITE);
        b9.setForeground(Color.BLACK);
        b9.setBounds(20,260,150,30);
        b9.addActionListener(this);
        add(b9);

        b10 = new JButton("Pickup Services");
        b10.setBackground(Color.WHITE);
        b10.setForeground(Color.BLACK);
        b10.setBounds(20,290,150,30);
        b10.addActionListener(this);
        add(b10);

        b11 = new JButton("Search room");
        b11.setBackground(Color.WHITE);
        b11.setForeground(Color.BLACK);
        b11.setBounds(20,320,150,30);
        b11.addActionListener(this);
        add(b11);

        b12 = new JButton("Logout");
        b12.setBackground(Color.WHITE);
        b12.setForeground(Color.BLACK);
        b12.setBounds(20,350,150,30);
        b12.addActionListener(this);
        add(b12);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/ten.jpg"));
        Image i2 = i1.getImage().getScaledInstance(460,360,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(190,20,460,360);
        add(l1);




        setLayout(null);
        setBounds(350,180,680,420);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {

        }else if(ae.getSource()==b2) {

        }else if(ae.getSource()==b3) {

        }else if(ae.getSource()==b4) {

        }else if(ae.getSource()==b5) {

        }else if(ae.getSource()==b6) {

        }else if(ae.getSource()==b7) {

        }else if(ae.getSource()==b8) {

        }else if(ae.getSource()==b9) {

        }else if(ae.getSource()==b10) {

        }else if(ae.getSource()==b11) {

        }else if(ae.getSource()==b12) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Reception().setVisible(true);


    }

}
