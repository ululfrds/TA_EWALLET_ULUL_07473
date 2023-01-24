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

public class TopupPilihan extends JFrame{
    private Font fontKata;
    private JLabel label;
    private JButton btn1, btn2;
    
     private JLabel background(){
        String imagePath="src/GUI/image/bacground polos.jpg";
        
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
    public TopupPilihan(){
        setTitle(" ");
        setSize(490, 440);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        fontKata = new Font("Times New Roman", Font.PLAIN,12);
        
       
        component();
    }

    private void component(){
        btn1 = new JButton(" TOPUP EWALLET ");
        btn1.setBounds(150, 125, 175, 70);
        btn1.setBackground(Color.decode("#A9A9A9"));
        btn1.setFont(fontKata);
        btn1.setForeground(Color.BLACK);
        btn1.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btn1);

        btn2 = new JButton(" TOPUP PULSA ");
        btn2.setBounds(150, 200, 175, 70);
        btn2.setBackground(Color.decode("#A9A9A9"));
        btn2.setForeground(Color.BLACK);
        btn2.setFont(fontKata);
        btn2.setBorder(BorderFactory.createEmptyBorder(0,0, 0, 0));
        add(btn2);
        
        JLabel piihanLabel = background();
        piihanLabel.setBounds(0,0, 490, 440);
        add(piihanLabel);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                TopupPage topup = new TopupPage();
                topup.setVisible(true);
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                 TopupPage topup = new TopupPage();
                topup.setVisible(true);
            }
        });
    }
   
}
