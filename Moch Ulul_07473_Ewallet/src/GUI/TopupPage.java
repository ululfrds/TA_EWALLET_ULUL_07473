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
import entity.TopupEntity;

public class TopupPage extends JFrame{
    private Font fontKata, fontKeterangan;
    private JLabel label, label2, label3, label4;
    private JTextField tFieldNominal, tFieldQuantity, tFieldJenisTopup;
    private JButton btn1, btn2;
    
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
    
    public TopupPage(){
        setTitle("");
        setSize(490, 440);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        fontKata = new Font("Times New Roman", Font.BOLD,12);
        fontKeterangan = new Font("Arial", Font.PLAIN,35);
        
        component();
        //event();
    }
    
    private void component(){
      
        btn1 = new JButton(" kembali ");
        btn1.setBounds(70, 340, 92,29);
        btn1.setBackground(Color.decode("#A9A9A9"));
        btn1.setFont(fontKata);
        btn1.setForeground(Color.black);
        add(btn1);

        btn2 = new JButton(" lanjutkan ");
        btn2.setBounds(200, 340, 92, 29);
        btn2.setBackground(Color.decode("#A9A9A9"));
        btn2.setFont(fontKata);
        btn2.setForeground(Color.black);
        add(btn2);
        
        tFieldNominal = new JTextField("");
        tFieldNominal.setBounds(20, 130, 204, 26);
        tFieldNominal.setFont(fontKata);
        add(tFieldNominal);
        
        tFieldQuantity = new JTextField("");
        tFieldQuantity.setBounds(20, 200, 204, 26);
        tFieldQuantity.setFont(fontKata);
        add(tFieldQuantity);
        
        tFieldJenisTopup = new JTextField("");
        tFieldJenisTopup.setBounds(20, 270, 204, 26);
        tFieldJenisTopup.setFont(fontKata);
        add(tFieldJenisTopup);
        
        label = new JLabel(" TOPUP ");
        label.setBounds(170,20,150,66);
        label.setFont(fontKeterangan);
        label.setForeground(Color.BLACK);
        add(label);
        
        label2 = new JLabel(" Nominal ");
        label2.setBounds(20,100, 85, 28);
        add(label2);
        
        label3 = new JLabel(" Quantity ");
        label3.setBounds(20,170, 85, 28);
        add(label3);
        
        label4 = new JLabel(" Jenis Topup ");
        label4.setBounds(20,240, 85, 28);
        add(label4);
        
        JLabel topup = background();
        topup.setBounds(0,0, 490, 440);
        add(topup);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                MenuPage menu = new MenuPage();
                menu.setVisible(true);
            }
        });
         
        btn2.addActionListener(new ActionListener(){
            @Override
            
            public void actionPerformed(ActionEvent e){
                TopupEntity topup = new TopupEntity();
                if(tFieldNominal.getText().equals(topup.getNominal()) && tFieldQuantity.getText().equals(topup.getQuantityTopup()) && tFieldJenisTopup.getText().equals(topup.getNamaTopup())){
                   new MenuPage().setVisible(true);
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "TOPUP BERHASIL");
                    System.out.println("TOPUP BERHASIL");
                }
            }
        });
    }
    
}
