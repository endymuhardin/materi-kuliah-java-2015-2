package com.muhardin.endy.belajar.swing;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JPasswordField;;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginDialog extends JDialog {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private TampilanUtama induk;

    public LoginDialog(TampilanUtama u){

        induk = u;
    
        setModal(true);
        setSize(300,150);
        pasangKomponen();
        pasangEventHandler();
        setTitle("Login dulu ya");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        setLocationRelativeTo(induk);
    }

    private void pasangKomponen(){
        setLayout(new FlowLayout());

        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        btnLogin = new JButton("Login");

        getContentPane().add(new JLabel("Username"));
        getContentPane().add(txtUsername);
        getContentPane().add(new JLabel("Password"));
        getContentPane().add(txtPassword);
        getContentPane().add(btnLogin);
    }

    private void pasangEventHandler(){

        btnLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                String usernameSeharusnya = "endy";
                String passwordYangBenar = "123";
                
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                System.out.println("Input username : "+username);
                System.out.println("Input password : "+password);

                if(!usernameSeharusnya.equals(username)){
                    JOptionPane.showMessageDialog(
                        LoginDialog.this,
                        "Username belum terdaftar",
                        "Gagal Login",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                if(!passwordYangBenar.equals(password)){
                    JOptionPane.showMessageDialog(
                        LoginDialog.this,
                        "Password salah",
                        "Gagal Login",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                induk.setUserAktif(username);
                
                LoginDialog.this.dispose();
            }
        });
    }

}
