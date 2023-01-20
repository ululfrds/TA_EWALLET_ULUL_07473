package controller;

import entity.TopupEntity;
import model.TopupModel;

public class TopupController {
    
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
