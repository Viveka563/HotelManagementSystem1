package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;

    AddEmployee(){
        JLabel name = new JLabel("NAME");
        name.setFont(new Font ("Tahoma",Font.PLAIN,17));
        name.setBounds(60,30,100,20);
        add (name);

        t1 = new JTextField();
        t1.setBounds(150, 30, 150, 25 );
        add(t1);

        JLabel age = new JLabel("AGE");
        age.setFont(new Font ("Tahoma",Font.PLAIN,17));
        age.setBounds(60,70,100,20);
        add (age);
        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 25 );
        add(t2);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font ("Tahoma",Font.PLAIN,17));
        gender.setBounds(60,110,100,20);
        add (gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        r1.setBounds(150, 110, 70, 25);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        r2.setBounds(220, 110, 70, 25);
        r2.setBackground(Color.WHITE);
        add(r2);

        JLabel job = new JLabel("JOB");
        job.setFont(new Font ("Tahoma",Font.PLAIN,17));
        job.setBounds(60,150,100,20);
        job.setBackground(Color.WHITE);
        add (job);

        String str[] = {"None","Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Services","Waitress","Accountant"};
        c1 = new JComboBox(str);
        c1.setBounds(150,150,150,25);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font ("Tahoma",Font.PLAIN,17));
        salary.setBounds(60,190,100,20);
        add (salary);

        t3 = new JTextField();
        t3.setBounds(150, 190, 150,25 );
        add(t3);

        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font ("Tahoma",Font.PLAIN,17));
        phone.setBounds(60,230,100,20);
        add (phone);

        t4 = new JTextField();
        t4.setBounds(150, 230, 150,25 );
        add(t4);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font ("Tahoma",Font.PLAIN,17));
        aadhar.setBounds(60,270,100,20);
        add (aadhar);

        t5 = new JTextField();
        t5.setBounds(150, 270, 150,25 );
        add(t5);

        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font ("Tahoma",Font.PLAIN,17));
        email.setBounds(60,310,100,20);
        add (email);

        t6 = new JTextField();
        t6.setBounds(150, 310, 150,25 );
        add(t6);

        b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 350 , 150, 25);
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/five.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,355,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(300,80,400,300);
        add(l1);

        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLUE);
        l2.setBounds(330,10,470,25);
        l2.setFont(new Font("Tahoma", Font.PLAIN,30));
        add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(350,180,680,420);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String aadhar = t5.getText();
        String email = t6.getText();

        String gender = null;
        if(r1.isSelected()) {
            gender = "male";
        }else if(r2.isSelected()) {
            gender = "female";
        }
        String job = (String) c1.getSelectedItem();

        conn c = new conn();
        String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
        try {
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog( null, "New Employee Added");
            this.setVisible(false);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new AddEmployee().setVisible(true);
    }}

