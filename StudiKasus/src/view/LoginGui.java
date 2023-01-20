package view;
import java.awt.Font;
import javax.swing.*;

public class LoginGui extends JFrame {
    private JLabel label;
    private JTextField tField1, tField2;
    private JButton btn1, btn2;
    
    public LoginGui(){
        setTitle("Swing Button");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Field");
        setSize(400,350);
        setLayout(null);
        
        component();
        //event();
    }
    
    private void component(){
      
        btn1 = new JButton(" exit ");
        btn1.setBounds(60,250,300,30);
        add(btn1);

        btn2 = new JButton(" login ");
        btn2.setBounds(60,200,300,30);
        add(btn2);
        
        tField1 = new JTextField(" Email ");
        tField1.setBounds(60,100,290, 30);
        add(tField1);
        
        tField2 = new JTextField(" Password ");
        tField2.setBounds(60,150,290,30);
        add(tField2);
        
        
    }

   public static void main(String[] args) {
        LoginGui gui = new LoginGui();
        gui.setVisible(true);
   
   }
}
