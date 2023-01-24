package model;
import java.util.*;
import java.util.ArrayList;
import entity.TopupEntity;


public class TopupModel {
    static ArrayList<TopupEntity> topupEntities = new ArrayList<>();
    
    public static ArrayList<TopupEntity> getTopup(){
        return topupEntities;
    }
    
    public static boolean createTopup(TopupEntity TopupList){
        topupEntities.add(TopupList);
        return true;
    }
            
    public static void topupPulsa(TopupEntity TopupList){
        topupEntities.add(TopupList);
    }
    
    public static void topupSaldo(TopupEntity TopupList){
        topupEntities.add(TopupList);
    }
    
   public int getIndexTopup( ArrayList<TopupEntity> listTopup, String namaTopup){
       int index = -1;
       if (listTopup.isEmpty()){
           System.out.println("DATA KOSONG");
       }
       else
       {
            for(TopupEntity topup : listTopup){
                if (topup.getNamaTopup().equals(namaTopup)){
                    index = listTopup.indexOf(topup);
                }
            } 
       }
       return index;
   }
   
}
