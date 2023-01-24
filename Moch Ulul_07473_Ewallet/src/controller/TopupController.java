package controller;


import entity.TopupEntity;
import java.util.ArrayList;
import model.TopupModel;

public class TopupController {
     public ArrayList<TopupEntity> toViewTopup(){
        return TopupModel.getTopup();
    }
    
    public boolean inputSaldo(int nominal, int quantityTopup, String namaTopup){
        TopupEntity saldo = new TopupEntity(nominal, quantityTopup, namaTopup);
        TopupModel.createTopup(saldo);
        return true;
    }
    
    public boolean inputPulsa(int nominal, int quantityTopup, String namaTopup){
        TopupEntity pulsa = new TopupEntity(nominal, quantityTopup, namaTopup);
        TopupModel.createTopup(pulsa);
        return true;
    }
}
