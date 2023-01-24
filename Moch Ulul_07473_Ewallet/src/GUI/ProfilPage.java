package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ProfilPage extends JFrame {
    private Font fontKata, fontKeterangan;
    private JLabel labelProfil, labelNama, labelEmail, labelNoTelp, labelPassword;
    private JTextField tField1, tField2, tField3, tField4;
    private JButton btnSimpan, btnKembali;
    
    private JLabel background(){
        String imagePath="src/GUI/image/backgorund 2.jpg";
        
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
    
    
    public ProfilPage(){
       setTitle(" ");
       setSize(490, 440);
       setLayout(null);
       setLocationRelativeTo(null);
       setResizable(false);
       fontKata = new Font("Times New Roman", Font.BOLD,12);
       fontKeterangan = new Font("Arial", Font.BOLD,28);

       component();
       //event();
    }
     
    private void component(){
       btnSimpan = new JButton(" simpan ");
       btnSimpan.setBounds(295,310,92,29);
       btnSimpan.setBackground(Color.decode("#A9A9A9"));
       btnSimpan.setForeground(Color.black);
       add(btnSimpan);

       btnKembali = new JButton(" kembali ");
       btnKembali.setBounds(165,310,92,29);
       btnKembali.setBackground(Color.decode("#A9A9A9"));
       btnKembali.setForeground(Color.black);
       add(btnKembali);
       
       labelProfil = new JLabel(" PROFIL USER ");
       labelProfil.setBounds(150,40,250,66);
       labelProfil.setFont(fontKeterangan);
       add(labelProfil);
       
       labelNama = new JLabel(" NAMA ");
       labelNama.setBounds(115,125,90,28);
       labelNama.setFont(fontKata);
       labelNama.setForeground(Color.WHITE);
       add(labelNama);
       
       labelEmail = new JLabel(" EMAIL ");
       labelEmail.setBounds(115,165,90,28);
       labelEmail.setFont(fontKata);
       labelEmail.setForeground(Color.WHITE);
       add(labelEmail);
       
       labelNoTelp = new JLabel(" NO TELPON ");
       labelNoTelp.setBounds(115,205,90,28);
       labelNoTelp.setFont(fontKata);
       labelNoTelp.setForeground(Color.WHITE);
       add(labelNoTelp);
       
       labelPassword = new JLabel(" PASSWORD ");
       labelPassword.setBounds(115,245,90,28);
       labelPassword.setFont(fontKata);
       labelPassword.setForeground(Color.WHITE);
       add(labelPassword);

       tField1 = new JTextField("");
       tField1.setBounds(198,125,215,35);
       tField1.setFont(fontKata);
       add(tField1);

       tField2 = new JTextField("");
       tField2.setBounds(198,165,215,35);
       tField2.setFont(fontKata);
       add(tField2);
       
       tField3 = new JTextField("");
       tField3.setBounds(198,205,215,35);
       tField3.setFont(fontKata);
       add(tField3);
       
       tField4 = new JTextField("");
       tField4.setBounds(198,245,215,35);
       tField4.setFont(fontKata);
       add(tField4);
       
       JLabel profil = background();
       profil.setBounds(0,0, 490, 440);
       add(profil);
       
       btnSimpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MenuPage menu = new MenuPage();
                menu.setVisible(true);
            }
        });
       
        btnKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MenuPage menu = new MenuPage();
                menu.setVisible(true);
            }
        });
    }
}
