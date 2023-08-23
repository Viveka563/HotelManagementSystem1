package hotel.management.system;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem() {
        setBounds(0, 0, 1300, 900);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1300, 900);
        add(l1);

        JLabel l2 = new JLabel("Hotel Rajasthan Palace , Jaipur");
        l2.setBounds(60, 30, 1000, 100);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Serif", Font.ITALIC, 50));
        l1.add(l2);

        JButton b1 = new JButton("Next");
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1190, 600, 100, 30);
        b1.addActionListener(this);
        l1.add(b1);

        setLayout(null);
        setVisible(true);

        while (true) {
            l2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            l2.setVisible(true);
            try {
                Thread.sleep(700);
            } catch (Exception ae) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}


