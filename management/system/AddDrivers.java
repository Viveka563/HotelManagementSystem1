package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddDrivers extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox c1,c2;
    JButton b1,b2;

    AddDrivers() {
        JLabel title = new JLabel("Add Driver");
        title.setBounds(110,15,150,30);
        title.setFont(new Font ("Tahoma",Font.BOLD,19));
        add (title);

        JLabel name = new JLabel("Name");
        name.setFont(new Font ("Tahoma",Font.PLAIN,16));
        name.setBounds(30,60,100,25);
        add (name);

        t1 = new JTextField();
        t1.setBounds(160, 60, 150, 25 );
        add(t1);

        JLabel age = new JLabel("Age");
        age.setFont(new Font ("Tahoma",Font.PLAIN,16));
        age.setBounds(30,90,100,25);
        add (age);

        t2 = new JTextField();
        t2.setBounds(160, 90, 150, 25 );
        add(t2);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font ("Tahoma",Font.PLAIN,16));
        gender.setBounds(30,120,100,25);
        add (gender);



        c1 = new JComboBox (new String[] {"Select Option", "Male", "Female"});
        c1.setBounds(160, 120, 150, 25);
        c1.setBackground(Color.WHITE);
        add(c1);


        JLabel car = new JLabel("Car Company");
        car.setFont(new Font ("Tahoma",Font.PLAIN,16));
        car.setBounds(30,150,100,25);
        add (car);

        t4 = new JTextField();
        t4.setBounds(160, 150, 150, 25 );
        add(t4);

        JLabel model = new JLabel("Car Model");
        model.setFont(new Font ("Tahoma",Font.PLAIN,16));
        model.setBounds(30,180,100,25);
        add (model);

        t5 = new JTextField();
        t5.setBounds(160, 180, 150, 25 );
        add(t5);

        JLabel available = new JLabel("Avaible");
        available.setFont(new Font ("Tahoma",Font.PLAIN,16));
        available.setBounds(30,210,100,25);
        add (available);

        c2 = new JComboBox (new String[] {"Select Option","Avaible", "Busy"});
        c2.setBounds(160,210,150,25);
        c2.setBackground(Color.WHITE);
        add(c2);

        JLabel location = new JLabel("Location");
        location.setFont(new Font ("Tahoma",Font.PLAIN,16));
        location.setBounds(30,240,100,25);
        add (location);

        t7 = new JTextField();
        t7.setBounds(160, 240, 150, 25 );
        add(t7);

        b1 = new JButton("Add Driver");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 270 , 100, 25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(170, 270 , 80, 25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/driver.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(320,30,400,260);
        add(l5);

        getContentPane().setBackground(Color.WHITE);


        setBounds(350,180,680,370);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() ==b1) {

            String name = t1.getText();
            String age = t2.getText();
            String gender = (String) c1.getSelectedItem();
            String company = t4.getText();
            String brand = t5.getText();
            String available = (String) c2.getSelectedItem();
            String location = t7.getText();


            try {
                conn c = new conn();

                String str = "insert into drivers values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";


                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "New Driver Added");
            }catch(Exception e){
                System.out.println(e);

            }

        }else if(ae.getSource() ==b2) {
            setVisible(false);
        }else if(ae.getSource() ==b2) {
            System.exit(0);}
    }
    public static void main(String[] args) {
        new AddDrivers().setVisible(true);
    }

}

