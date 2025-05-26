
package pushpak.viman;
//import java.awt.Color;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//
//public class Home extends JFrame implements ActionListener{
//      
//    
//    public Home(){
//       
//        setLayout(null);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pushpak/viman/icons/front.jpg"));
//      JLabel image = new JLabel(i1);
//      image.setBounds(0,0,1600,800);
//       
//        add(image);
//JLabel heading = new JLabel("PUSHPAK VIMAN WELCOME YOU  ");
//heading.setBounds(500,40,1000,40);
//heading.setForeground(Color.yellow);
//heading.setFont(new Font("Tahoma",Font.ITALIC,36));
//image.add(heading);
//
//JMenuBar menubar = new JMenuBar();
//setJMenuBar(menubar);
//
//JMenu details = new JMenu("Details");
//menubar.add(details);
//
//JMenuItem flightDetails = new JMenuItem("Flight Details");
//flightDetails.addActionListener(this);
//details.add(flightDetails);
//
//
//JMenuItem customerDetails = new JMenuItem("Add customer Details");
//customerDetails.addActionListener(this);
//details.add(customerDetails);
//
//JMenuItem bookFlight = new JMenuItem("Book Flight");
//bookFlight.addActionListener(this);
//
//details.add(bookFlight);
//
//JMenuItem journeyDetails = new JMenuItem("Journey Details");
//journeyDetails.addActionListener(this);
//
//details.add(journeyDetails);
//
//JMenuItem ticketCancellation = new JMenuItem("ticketCancellation");
//details.add(ticketCancellation);
//
//
//
//JMenu ticket  = new JMenu("ticket");
//menubar.add(ticket);
//
//JMenuItem boardingPass = new JMenuItem ("boarding Pass");
//ticket.add(boardingPass);
//
//// help desk k liye yeh wala
//JMenu helpDesk = new JMenu("help Desk");
//menubar.add(helpDesk);
//
//JMenuItem contact = new JMenu("Ayush gupta ");
//helpDesk.add(contact);
//
//
//JMenuItem number = new JMenu("9310151515");
//contact.add(number);
//
// setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setVisible(true);
//    }
//    
//    
//    public void actionPerformed(ActionEvent ae){
//       
//    String text = ae.getActionCommand();
//    
//    if(text.equals("Add customer Details")){
//    new AddCustomer();   
//    }
//    else if(text.equals("Flight Details")){
//        new FlightInfo();
//    } else if(text.equals("Book Flightt")){
//        new BookFlight();
//    }
//    else if (text.equals("Journey Details")){
//        new JourneyDetails();
//    }
//    
//    }
//    
//    public static void main(String[] args){
//    new Home();
//}
//}




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pushpak/viman/icons/frontt.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);
        
        JLabel heading = new JLabel("Pushpak Viman WELCOMES YOU");
        heading.setBounds(500, 40, 1000, 40);
        heading.setForeground(Color.red);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight1 = new JMenuItem("Book Flight");
        bookFlight1.addActionListener(this);
        details.add(bookFlight1);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight1();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } 
    }
    
    public static void main(String[] args) {
        new Home();
    }
}
