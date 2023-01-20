package GUI;
import java.awt.Font;
import javax.swing.*;

public class LoginPage extends NewJFrame {
    private JLabel label, label2, label3;
    private JTextField tField1, tField2;
    private JButton btn1, btn2;
    
    public LoginPage(){
        
        setTitle("Swing Frame");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Button");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Field");
        setSize(204,26);
        setLayout(null);
        
        component();
        //event();
    }
    
    private void component(){
      
        btn1 = new JButton(" exit ");
        btn1.setBounds(-296, 29, 92,29);
        add(btn1);

        btn2 = new JButton(" login ");
        btn2.setBounds(-115, 29, 92, 29);
        add(btn2);
        
        tField1 = new JTextField("  ");
        tField1.setBounds(-198, -100, 204, 26);
        add(tField1);
        
        tField2 = new JTextField("  ");
        tField2.setBounds(-198, -62, 204, 26);
        add(tField2);
        
        label = new JLabel("LOGIN");
        label.setBounds(-211,-200,115,66);
        add(label);
        
        label2 = new JLabel("EMAIL");
        label2.setBounds(-301,-103, 85, 28);
        add(label2);
        
        label3 = new JLabel("PASSWORD");
        label3.setBounds(-301, -64, 85, 28);
        add(label3);
    }
     public static void main(String[] args) {
        LoginPage home = new LoginPage();
        home.setVisible(true);
    }
 
}

