package model;
import java.util.*;
import java.util.ArrayList;
import entity.TransaksiEntity;
import entity.TopupEntity;


public class TransaksiModel {
   private  static ArrayList<TransaksiEntity> transaksiEntities = new ArrayList<>();
    
    public static ArrayList<TransaksiEntity> getTransaksi(){
        return transaksiEntities;
    } 
    
   public int getIndexTransaksi( ArrayList<TransaksiEntity> listTransaksi, String namaProduk){
       int index = -1;
       if (listTransaksi.isEmpty()){
           System.out.println("DATA KOSONG");
       }
       else
       {
            for(TransaksiEntity transaksi : listTransaksi){
                if (transaksi.getNamaTopup().equals(namaProduk)){
                    index = listTransaksi.indexOf(transaksi);
                }
            } 
       }
       return index;
   } 
}
