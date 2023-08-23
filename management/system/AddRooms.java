package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRooms extends JFrame implements ActionListener  {

    JTextField t1,t2,t3,t4,t5,t6;
    JComboBox c1,c2,c3;
    JButton b1,b2;

    AddRooms() {

        JLabel l1 = new JLabel("Add Rooms");
        l1.setFont(new Font ("Tahoma",Font.BOLD,17));
        l1.setBounds(130,20,100,25);
        add (l1);

        JLabel room= new JLabel("Room Number");
        room.setFont(new Font ("Tahoma",Font.PLAIN,15));
        room.setBounds(60,50,150,25);
        add (room);

        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30 );
        add(t1);

        JLabel available= new JLabel("Available");
        available.setFont(new Font ("Tahoma",Font.PLAIN,15));
        available.setBounds(60,90,100,25);
        add (available);

        c1 = new JComboBox(new String [] {" Choose Option","Available","Occupied"});
        c1.setBounds(180,90,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel status= new JLabel("Cleaning Status");
        status.setFont(new Font ("Tahoma",Font.PLAIN,15));
        status.setBounds(60,130,120,25);
        add (status);

        c2 = new JComboBox(new String [] {"Choose Option", "Clean","Dirty"});
        c2.setBounds(180,130,150,30);
        c2.setBackground(Color.WHITE);
        add(c2);


        JLabel price = new JLabel("Price");
        price.setFont(new Font ("Tahoma",Font.PLAIN,15));
        price.setBounds(60,170,120,25);
        add (price);

        t2 = new JTextField();
        t2.setBounds(180, 170, 150, 30 );
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setFont(new Font ("Tahoma",Font.PLAIN,15));
        type.setBounds(60,210,120,25);
        add (type);

        c3 = new JComboBox(new String [] {"Choose Option", "Single","Double", "Triple"});
        c3.setBounds(180,210,150,30);
        c3.setBackground(Color.WHITE);
        add(c3);

        b1 = new JButton("Add Room");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 260 , 110, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220, 260 , 110, 30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/six.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(340,40,400,260);
        add(l5);

        getContentPane().setBackground(Color.WHITE);

        setBounds(350,180,680,380);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() ==b1) {

            String room = t1.getText();
            String available = (String)c1.getSelectedItem();
            String status= (String)c1.getSelectedItem();
            String price = t2.getText();
            String type= (String)c1.getSelectedItem();

            try {
                conn c = new conn();

                String str = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                c.s.executeUpdate(str);

                JOptionPane.showMessageDialog(null, "New Room Added");

            }catch(Exception e) {
                System.out.println(e);

            }
        }else if(ae.getSource() ==b2) {
            this.setVisible(false);

            //System.exit(0);
        }else if(ae.getSource()==b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }

}
