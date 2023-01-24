package view;
import view.CustomerView;
import view.TopupView;
import view.TransaksiView;
import java.util.Scanner;


public class MainView {
    Scanner input = new Scanner(System.in);
    int pilih;
    public void run(){
        do{
            System.out.println("MENU");
            System.out.println("1. REGISTRASI");
            System.out.println("2. LOGIN");
            System.out.println("3. KELUAR");
            System.out.print("PILIH = ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 :
                    new RegistrasiPage().inputRegistrasi();
                    break;
                case 2 :
                    new LoginPage().cekLogin();
                    break;
                case 3 :
                    System.out.println("KELUAR");
                    break;
                default :
                    System.out.println("DATA TIDAK DITEMUKAN");
                    break;
            }
        }while(pilih !=3);
        
    
    }

   
        
}
