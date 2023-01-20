package GUI;
import java.awt.Font;
import javax.swing.*;

public class TopupPage extends NewJFrame{
    private JLabel label, label2, label3, label4;
    private JTextField tField1, tField2, tField3;
    private JButton btn1, btn2;
    
    public TopupPage(){
        setTitle("Swing Frame");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Button");
        setSize(400, 200);
        setLayout(null);
        
        setTitle("Swing Field");
        setSize(400,500);
        setLayout(null);
        
        component();
        //event();
    }
    
    private void component(){
      
        btn1 = new JButton(" kembali ");
        btn1.setBounds(-296, 29, 92,29);
        add(btn1);

        btn2 = new JButton(" lanjutkan transaksi ");
        btn2.setBounds(-115, 29, 92, 29);
        add(btn2);
        
        tField1 = new JTextField("  ");
        tField1.setBounds(-198, -100, 204, 26);
        add(tField1);
        
        tField2 = new JTextField("  ");
        tField2.setBounds(-198, -62, 204, 26);
        add(tField2);
        
        tField3 = new JTextField("  ");
        tField3.setBounds(-198, -48, 204, 26);
        add(tField3);
        
        label = new JLabel("TOPUP");
        label.setBounds(-211,-200,115,66);
        add(label);
        
        label2 = new JLabel(" Nominal ");
        label2.setBounds(-301,-103, 85, 28);
        add(label2);
        
        label3 = new JLabel(" Quantity ");
        label3.setBounds(-301, -64, 85, 28);
        add(label3);
        
        label4 = new JLabel(" Quantity ");
        label4.setBounds(-301, -64, 85, 28);
        add(label4);
    }
    
    public static void main(String[] args) {
        TopupPage home = new TopupPage();
        home.setVisible(true);
    }
}
