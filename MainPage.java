
/**
 * Write a description of class MainPage here.
 *
 * @author (Rahul)
 * @version (0.1)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
public class MainPage
{
    JFrame frm;
    JPanel Login;
    JLabel lblLogin,lblUsername,lblPassword;
    JTextField txtLogin, txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;
    public static void main(String []args){
        
        new MainPage();

    }
     
    public MainPage(){
        frame();
        Login();
    
    }
    
    public void frame(){
        //creating object frm and adding some characteristics
        frm=new JFrame("Daily Store");
        frm.setSize(800,650);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public void Login(){
        Login=new JPanel();
        Login.setBounds(0,0,850,800);
        Login.setLayout(null);
        Login.setVisible(true);
        frm.getContentPane().add(Login);
        
        lblLogin = new JLabel("LOGIN");
        lblLogin.setBounds(380, 10, 550,30);
        lblLogin.setFont(new Font("Ariel", Font.PLAIN, 20));
        Login.add(lblLogin);
        
        lblUsername = new JLabel ("Username:");
        lblUsername.setBounds(250,150,180,30);
        lblUsername.setFont(new Font("Ariel", Font.PLAIN, 20));
        Login.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(360,150,180,30);
        txtUsername.setFont(new Font("Ariel", Font.PLAIN, 20));
        Login.add(txtUsername);
        
        lblPassword = new JLabel ("Password:");
        lblPassword.setBounds(250,230,180,30);
        lblPassword.setFont(new Font("Ariel", Font.PLAIN, 20));
        Login.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(360,230,180,30);
        txtPassword.setFont(new Font("Ariel", Font.PLAIN, 20));
        Login.add(txtPassword);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(360,300,180,40);
        btnLogin.setFont(new Font("Ariel", Font.PLAIN, 15));
        Login.add(btnLogin);
        
        
    
    }
}
