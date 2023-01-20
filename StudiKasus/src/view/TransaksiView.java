package view;
import entity.TransaksiEntity;
import controller.TransaksiController;
import entity.TopupEntity;
import java.util.ArrayList;
import java.util.Scanner;
import model.TransaksiModel;
import model.TopupModel;
import utils.LocalDate;

//view transaksi hanya untuk menampilkan nota atau histori dari topup  
//jadi tidak ada Create, delete, dan Update 
public class TransaksiView {
    private TransaksiController topup = new TransaksiController();
    public void TransaksiView(){
    TransaksiModel transaksiModel = new TransaksiModel();
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
    
    /*public void viewTransaksi(){
        ArrayList<TopupEntity> topupEntities = topup.toViewTopup();
        if (topupEntities.isEmpty()){
            System.out.println("DATA KOSONG");
            System.out.println("");
        }
        else
        {
            for(TopupEntity topup : topupEntities){
                System.out.println("Tanggal = "+topup.get());
                System.out.println("Id Transaksi = "+topup.getNoTransaksi());
            }
        }
    }*/
}
