package view;
import controller.TopupController;
import entity.TopupEntity;
import java.util.ArrayList;
import java.util.Scanner;
import utils.LocalDate;

//view transaksi hanya untuk menampilkan nota atau histori dari topup  
//jadi tidak ada Create, delete, dan Update 
public class TransaksiView {
    private TopupController topup = new TopupController();
    public void TransaksiView(){
 
    Scanner keyboard = new Scanner(System.in);
    int pilih;
    System.out.println("1. Tampilkan Transaksi");
    System.out.println("PILIH = ");
    pilih = keyboard.nextInt();
    switch (pilih){
        case 1 :
            //viewTransaksi();
            break;
        }  
    }
    
    public void viewTransaksi(){
        ArrayList<TopupEntity> topupEntities = topup.toViewTopup();
        for(TopupEntity topupEntity : topupEntities){
            System.out.println("=======HISTORI TRANSAKSI=======");
            System.out.println("Nominal = "+topupEntity.getNominal());
            System.out.println("Quantity = "+topupEntity.getQuantityTopup());
            System.out.println("Nama Topup = "+topupEntity.getNamaTopup());
        }
    }   
}
