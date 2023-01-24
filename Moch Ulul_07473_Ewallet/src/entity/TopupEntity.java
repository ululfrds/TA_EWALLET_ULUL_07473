package entity;
public class TopupEntity extends CustomerEntity{
    private int nominal;
    private int quantityTopup;
    private String namaTopup;
    
//    private String 
    // tujuan/no pulsa,, tanggal pembelian, nominal pembelian pulsa 

    public TopupEntity(int nominal, int quantityTopup, String namaTopup) {
        //super(email, noTelp);
        this.quantityTopup = quantityTopup;
        this.namaTopup = namaTopup;
    }

    public TopupEntity() {
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getQuantityTopup() {
        return quantityTopup;
    }

    public void setQuantityTopup(int quantityTopup) {
        this.quantityTopup = quantityTopup;
    }

    public String getNamaTopup() {
        return namaTopup;
    }

    public void setNamaTopup(String namaTopup) {
        this.namaTopup = namaTopup;
    }
    
}
