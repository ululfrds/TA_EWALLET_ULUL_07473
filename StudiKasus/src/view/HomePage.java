package view;

import java.util.Scanner;
import entity.CustomerEntity;
import entity.TopupEntity;
import model.TopupModel;
import controller.CustomerController;

public class HomePage {
    private static Scanner input = new Scanner(System.in);
    int pilihan = input.nextInt();
    public void menu(){
        do{
        System.out.println("---------------------------------------------------");
        System.out.println("SELAMAT DATANG DI EWALLET YANG SANGAT MEMBANGONGKAN");
        System.out.println("---------------------------------------------------");
        System.out.println("Masukkan Pilihan anda ");
        System.out.println("1. TOPUP PULSA DAN SALDO EWALLET");
        System.out.println("2. LIHAT RIWAYAT TRANSAKSI");
        System.out.println("3. TAMPILKAN DATA USER");
        System.out.println("4. EDIT PROFIL");
        System.out.println("5. LOGOUT");
        System.out.println("Masukkan pilihan = ");
        }while(pilihan!=4);
        
        switch(pilihan){
            case 1: 
                break;
            case 2: 
                break;
            case 3 :
                break;
            default:
                System.out.println("PILIHAN TIDAK ADA SILAHKAN COBA LAGI");
                break;
        }
    }
}
