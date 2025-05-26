
package pushpak.viman;
//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton submit ,reset,close;
    
    JTextField tfusername;
    JPasswordField tfpassword;
    
    
    public Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel lblusername = new JLabel("User name");
        lblusername.setBounds(20,20,100,20);
        add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(130,20,200,20);
        add(tfusername);
        
        
       JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20,60,100,20);
        add(lblpassword);
        
         tfpassword = new JPasswordField();
        tfpassword.setBounds(130,60,200,20);
        add(tfpassword);
        
         reset = new JButton("reset");
        reset.setBounds(40,120,120,20);
        add(reset);
        reset.addActionListener(this);
        
         submit = new JButton("Submit");
        submit.setBounds(190,120,120,20);
add(submit);
submit.addActionListener(this);



 close = new JButton("Close");
close.setBounds(140,160,120,20);
add(close);
         close.addActionListener(this);
        
        
        
        
        
        setSize(400,250);
        setVisible(true);
        setLocation(600,250);
//        System.out.println("hello");


    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        
        if(ae.getSource()==submit){
        String username = tfusername.getText();
        String password = tfpassword.getText();
        
        try{
            Conn c = new Conn();
            String query ="select * from login where username ='"+username+"'and password ='"+password+"'"; 
            ResultSet rs = c.s.executeQuery(query);
            
            if (rs.next()){
                new Home();
                
            }else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
           setVisible(false);
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        
        
        }else if (ae.getSource()== close){
            setVisible(false);
        }
        else if (ae.getSource()==reset){
       tfusername.setText("");
       tfpassword.setText("");
        }
        
    }
    public static void main(String[] args){
    new Login();
}
}