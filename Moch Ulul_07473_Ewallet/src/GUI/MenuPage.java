package GUI;
import java.awt.Font;
import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MenuPage extends JFrame{
     private Font fontKata, fontKeterangan;
     private JLabel labelEwallet;
     private JButton btnProfil, btnTopup, btnHistori, btnExit;
     
     private JLabel background(){
        String imagePath="src/GUI/image/1674355821-picsay.jpg";
        
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
     
     public MenuPage(){
        setTitle(" ");
        setSize(490, 440);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        fontKata = new Font("Times New Roman", Font.PLAIN,12);
        fontKeterangan = new Font("Arial", Font.BOLD,30);
        
        component();
        //event();
     }
     
     private void component(){
        labelEwallet = new JLabel(" EWALLET HOME ");
        labelEwallet.setBounds(125, 20, 300, 66);
        labelEwallet.setFont(fontKeterangan);
        add(labelEwallet);
        
        btnProfil = new JButton(" EDIT PROFIL ");
        btnProfil.setBounds(25, 125, 115, 35);
        btnProfil.setBackground(Color.decode("#A9A9A9"));
        btnProfil.setFont(fontKata);
        btnProfil.setForeground(Color.BLACK);
        btnProfil.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btnProfil);

        btnTopup = new JButton(" TOPUP ");
        btnTopup.setBounds(25, 160, 115, 35);
        btnTopup.setBackground(Color.decode("#A9A9A9"));
        btnTopup.setForeground(Color.BLACK);
        btnTopup.setFont(fontKata);
        btnTopup.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btnTopup);
        
        btnHistori = new JButton(" HISTORI TOPUP ");
        btnHistori.setBounds(25,195, 115, 35);
        btnHistori.setBackground(Color.decode("#A9A9A9"));
        btnHistori.setForeground(Color.BLACK);
        btnHistori.setFont(fontKata);
        btnHistori.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btnHistori);

        btnExit = new JButton(" LOGOUT ");
        btnExit.setBounds(25, 225, 115, 35);
        btnExit.setBackground(Color.decode("#A9A9A9"));
        btnExit.setForeground(Color.BLACK);
        btnExit.setFont(fontKata);
        btnExit.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btnExit);
        
        JLabel menuLabel = background();
        menuLabel.setBounds(0,0, 490, 440);
        add(menuLabel);
        
        btnProfil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                ProfilPage profil = new ProfilPage();
                profil.setVisible(true);
            }
        });
        
        btnTopup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                TopupPage topup = new TopupPage();
                topup.setVisible(true);
            }
        });
        
        btnHistori.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                TransaksiPage Transaksi = new TransaksiPage();
                Transaksi.setVisible(true);
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
        MenuPage men = new MenuPage();
        men.setVisible(true);
    }
}
