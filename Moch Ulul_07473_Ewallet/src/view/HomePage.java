package view;

import java.util.Scanner;
import entity.*;
import model.TopupModel;
import model.CustomerModel;
import model.TransaksiModel;


public class HomePage {
    private static Scanner input = new Scanner(System.in);
    public void menu(){
        int pilihan;
        do{
            System.out.println("---------------------------------------------------");
            System.out.println("SELAMAT DATANG DI EWALLET");
            System.out.println("---------------------------------------------------");
            System.out.println("Masukkan Pilihan anda ");
            System.out.println("1. PROFIL");
            System.out.println("2. TOPUP");
            System.out.println("3. HISTORI TOPUP");
            System.out.println("4. LOGOUT");
            System.out.print("Masukkan pilihan = ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 : new CustomerView().customerPage();
                    break;
                case 2 : new TopupView().TopupView();
                    break;
                case 3 : new TransaksiView().TransaksiView();
                    break;
                case 4 : new LoginPage().cekLogin();
                    break; 
                default :
                    System.out.println("PILIHAN TIDAK ADA SILAHKAN COBA LAGI");
                    break;
            }
        }while(pilihan!=5);
    }

   
}
