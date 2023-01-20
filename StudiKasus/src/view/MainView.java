package view;
import view.CustomerView;
import view.TopupView;
import view.TransaksiView;
import java.util.Scanner;


public class MainView {
    Scanner input = new Scanner(System.in);
    int pilih;
    public void mainView(){
        System.out.println("MENU");
        System.out.println("1. Daftar");
        System.out.println("2. Edit Customer");
        System.out.println("3. Daftar Transaksi");
        System.out.println("4. Topup");
        System.out.print("PILIH = ");
        pilih = input.nextInt();
        switch (pilih){
            case 1 :
                break;
            
            case 2 :
//                CustomerView customer = new CustomerView();
//                customer.CustomerView();
                break;
            case 3 :
                TransaksiView transaksi = new TransaksiView();
                transaksi.TransaksiView();
                break;
            case 4 :
                TopupView topup = new TopupView();
                topup.TopupView();
                break;
            default :
                System.out.println("DATA TIDAK DITEMUKAN");
                break;
        }
    
    }

   
        
}
