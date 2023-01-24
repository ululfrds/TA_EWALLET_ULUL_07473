package controller;

import entity.TransaksiEntity;
import java.util.ArrayList;
import model.TransaksiModel;


public class TransaksiController {
    public ArrayList<TransaksiEntity> toViewTopup(){
        return TransaksiModel.getTransaksi();
    }
    
}
