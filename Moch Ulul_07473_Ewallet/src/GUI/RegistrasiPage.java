package GUI;
import entity.CustomerEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrasiPage extends JFrame {
    private Font fontKata, fontKeterangan;
    private JLabel labelRegist, labelNama, labelEmail, labelTelp, labelPass;
    private JTextField tFieldNama, tFieldEmail, tFieldTelp, tFieldPass;
    private JButton btnSimpan, btnExit;
    
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
    
    public RegistrasiPage(){
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
       btnSimpan = new JButton(" Simpan ");
       btnSimpan.setBounds(295,310,92,29);
       btnSimpan.setBackground(Color.decode("#A9A9A9"));
       btnSimpan.setForeground(Color.black);
       add(btnSimpan);

       btnExit = new JButton(" exit ");
       btnExit.setBounds(165,310,92,29);
       btnExit.setBackground(Color.decode("#A9A9A9"));
       btnExit.setForeground(Color.black);
       add(btnExit);
       
       labelRegist = new JLabel(" REGISTRASI ");
       labelRegist.setBounds(150,40,200,66);
       labelRegist.setFont(fontKeterangan);
       add(labelRegist);
       
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
       
       labelTelp = new JLabel(" NO TELPON ");
       labelTelp.setBounds(115,205,90,28);
       labelTelp.setFont(fontKata);
       labelTelp.setForeground(Color.WHITE);
       add(labelTelp);
       
       labelPass = new JLabel(" PASSWORD ");
       labelPass.setBounds(115,245,90,28);
       labelPass.setFont(fontKata);
       labelPass.setForeground(Color.WHITE);
       add(labelPass);

       tFieldNama = new JTextField("");
       tFieldNama.setBounds(198,125,215,35);
       tFieldNama.setFont(fontKata);
       add(tFieldNama);

       tFieldEmail = new JTextField("");
       tFieldEmail.setBounds(198,165,215,35);
       tFieldEmail.setFont(fontKata);
       add(tFieldEmail);
       
       tFieldTelp = new JTextField("");
       tFieldTelp.setBounds(198,205,215,35);
       tFieldTelp.setFont(fontKata);
       add(tFieldTelp);
       
       tFieldPass = new JTextField("");
       tFieldPass.setBounds(198,245,215,35);
       tFieldPass.setFont(fontKata);
       add(tFieldPass);
       
        JLabel regist = background();
        regist.setBounds(0,0, 490, 440);
        add(regist);
        
        btnSimpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CustomerEntity customer = new CustomerEntity();
                if(tFieldNama.getText().equals(customer.getNama()) && tFieldEmail.getText().equals(customer.getEmail()) && tFieldTelp.getText().equals(customer.getNoTelp()) && tFieldPass.getText().equals(customer.getPassword())){
                
                new LoginPage().setVisible(true);
                setVisible(false);
            }else{
                    JOptionPane.showMessageDialog(null, "REGISTRASI BERHASIL");
                    System.out.println("SILAHKAN LOGIN ULANG");
                }
                
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
   
}
