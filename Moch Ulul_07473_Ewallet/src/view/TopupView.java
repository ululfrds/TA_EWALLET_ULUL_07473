package view;
import controller.TopupController;
import model.TopupModel;
import java.util.Scanner;



public class TopupView {
private TopupController topup = new TopupController(); 
     public void TopupView(){
       
    TopupModel topupModel = new TopupModel();
    Scanner keyboard = new Scanner(System.in);
    int pilih;
    System.out.println("--------------------------------------------");
    System.out.println("------- SELAMAT DATANG DI MENU TOPUP -------");
    System.out.println("--------------------------------------------");
    System.out.println("1. TOPUP PULSA");
    System.out.println("2. TOPUP SALDO");
    System.out.print("PILIH = ");
    pilih = keyboard.nextInt();
    switch (pilih){
        case 1 :
            System.out.println("LIST HARGA PULSA");
            System.out.println("1. 5000 = Rp.5500");
            System.out.println("2. 10000 = Rp. 10500");
            System.out.println("3. 50000 = Rp. 50500");
            System.out.println("4. 100000 = Rp. 100000");
            inputPulsa();
            break;
        case 2 :
            System.out.println("LIST HARGA SALDO EWALLET");
            System.out.println("1. 5000 = Rp.5500");
            System.out.println("2. 10000 = Rp. 10500");
            System.out.println("3. 50000 = Rp. 50500");
            System.out.println("4. 100000 = Rp. 100000");
            inputSaldo();
            break;
        default :
            System.out.println("PILIHAN ANDA TIDAK ADA");
            break;
        }
    }
     
    
    public void inputPulsa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nominal = ");
        int nominal = input.nextInt();
        System.out.print("Masukkan Quantity topup = ");
        int quantityTopup = input.nextInt();
        System.out.print("Masukkan Nama Topup = ");
        String namaTopup = input.nextLine();
        boolean status = topup.inputPulsa(nominal, quantityTopup, namaTopup);
    }
    
    public void inputSaldo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nominal = ");
        int nominal = input.nextInt();
        System.out.print("Masukkan Quantity topup = ");
        int quantityTopup = input.nextInt();
        System.out.print("Masukkan Nama Topup = ");
        String namaTopup = input.nextLine();
        boolean status = topup.inputSaldo(nominal, quantityTopup, namaTopup);
    }
}
