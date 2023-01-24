package GUI;
import entity.CustomerEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;


public class LoginPage extends JFrame {
    private Font fontKata, fontKeterangan;
    private JLabel labelLogin, labelEmail, labelPassword;
    private JTextField tFieldEmail, tFieldPassword;
    private JButton btnExit, btnLogin, btnRegist;
    
    
    private JLabel background(){
        String imagePath="src/GUI/image/ewallet bg.png";
        
        try {
            BufferedImage bImage;
            Image imgResize;
            ImageIcon imgIcon = null;
            
            bImage = ImageIO.read(new File(imagePath));
            
            imgResize = bImage.getScaledInstance(490,440,Image.SCALE_SMOOTH);
            
            imgIcon = new ImageIcon(imgResize);
            
            return new JLabel(imgIcon);
        } catch (IOException ex) {
            return new JLabel("Gagal Membaca File");
        }
    }
    
    public LoginPage(){
        setTitle("");
        setSize(490, 440);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        fontKata = new Font("Times New Roman", Font.BOLD,12);
        fontKeterangan = new Font("Arial", Font.BOLD,35);
        
        component();
      
    
    }
    
    private void component(){
       

        btnExit = new JButton(" exit ");
        btnExit.setBounds(220, 320, 92,29);
        btnExit.setBackground(Color.decode("#A9A9A9"));
        btnExit.setFont(fontKata);
        btnExit.setForeground(Color.black);
        btnExit.setBorderPainted(false);
        add(btnExit);

        btnLogin = new JButton(" login ");
        btnLogin.setBounds(295, 270, 92, 29);
        btnLogin.setBackground(Color.decode("#A9A9A9"));
        btnLogin.setFont(fontKata);
        btnLogin.setForeground(Color.black);
        btnLogin.setBorderPainted(false);
        add(btnLogin);
        
        btnRegist = new JButton(" registrasi ");
        btnRegist.setBounds(150, 270, 92, 29);
        btnRegist.setBackground(Color.decode("#A9A9A9"));
        btnRegist.setFont(fontKata);
        btnRegist.setForeground(Color.black);
        btnRegist.setBorderPainted(false);
        add(btnRegist);
        
        tFieldEmail = new JTextField("");
        tFieldEmail.setBounds(198, 150, 215, 35);
        tFieldEmail.setFont(fontKata);
        add(tFieldEmail);
        
        tFieldPassword = new JPasswordField("");
        tFieldPassword.setBounds(198, 195, 215, 35);
        tFieldPassword.setFont(fontKata);
        add(tFieldPassword);
        
        labelLogin = new JLabel("LOGIN");
        labelLogin.setBounds(190,40,115,66);
        labelLogin.setFont(fontKeterangan);
        add(labelLogin);
        
        labelEmail = new JLabel("EMAIL");
        labelEmail.setBounds(95, 150, 90, 28);
        labelEmail.setFont(fontKata);
        add(labelEmail);
        
        labelPassword = new JLabel("PASSWORD");
        labelPassword.setBounds(95, 195, 90, 28);
        labelPassword.setFont(fontKata);
        add(labelPassword);
        
        JLabel imgLabel = background();
        imgLabel.setBounds(0,0, 490, 440);
        add(imgLabel);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            
            public void actionPerformed(ActionEvent e){
                try{
                CustomerEntity customer = new CustomerEntity();
                customer.nama = tFieldEmail.getText();
                customer.password = tFieldPassword.getText();
                new MenuPage().setVisible(true);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "id atau password salah" +ex.getMessage());
            }
        }
        });
        
        btnRegist.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                RegistrasiPage regist = new RegistrasiPage();
                regist.setVisible(true);
            }
        });
        
        btnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                LoginPage login = new LoginPage();
                login.setVisible(true);
            }
        });
    }
  
    
     
    public static void main(String[] args) {
      LoginPage login = new LoginPage();
      login.setVisible(true);
    }
}

