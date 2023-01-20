package GUI;
import GUI.NewJFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistrasiPage extends NewJFrame {
    private JLabel label;
    private JTextField tField1, tField2, tField3, tField4;
    private JButton btn1, btn2;
    
    public RegistrasiPage(){
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
       btn1 = new JButton(" Login ");
       btn1.setBounds(60,250,300,30);
       add(btn1);

       btn2 = new JButton(" exit ");
       btn2.setBounds(60,200,300,30);
       add(btn2);

       tField1 = new JTextField(" Email ");
       tField1.setBounds(60,100,290, 30);
       add(tField1);

       tField2 = new JTextField(" Nama ");
       tField2.setBounds(60,150,290,30);
       add(tField2);
       
       tField3 = new JTextField(" Password ");
       tField3.setBounds(60,150,290,30);
       add(tField3);
       
       tField4 = new JTextField(" Nomor HP ");
       tField4.setBounds(60,150,290,30);
       add(tField4);
    }
}
