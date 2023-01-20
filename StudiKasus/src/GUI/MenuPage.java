package GUI;
import java.awt.Font;
import javax.swing.*;

public class MenuPage extends NewJFrame{
     private JLabel label1, label2, label3, label4;
     private JButton btn1, btn2, btn3, btn4;
     
     public MenuPage(){
        setTitle("Swing Button");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Frame");
        setSize(400, 200);
        setLayout(null);
        
        component();
        //event();
     }
     
     private void component(){
        label1 = new JLabel("LIHAT PROFIL");
        label1.setBounds(-211, -209, 115, 66);
        add(label1);
        
        btn1 = new JButton(" PROFIL ");
        btn1.setBounds(-200, -112, 92, 29);
        add(btn1);

        btn2 = new JButton(" TOPUP ");
        btn2.setBounds(-200, -28, 92, 29);
        add(btn2);
        
        btn3 = new JButton(" HISTORI TOPUP ");
        btn3.setBounds(-200, -24, 92, 29);
        add(btn3);

        btn4 = new JButton(" EXIT ");
        btn4.setBounds(-200, 21, 92, 29);
        add(btn4);
     }
}
