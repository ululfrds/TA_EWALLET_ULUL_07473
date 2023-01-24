package entity;
public class TransaksiEntity extends TopupEntity {
    private String tanggal;
    private String idTransaksi;
//no transaksi diganti menajdi id transaksi type data int
    public TransaksiEntity(String tanggal, String noTransaksi) {
        this.tanggal = tanggal;
        this.idTransaksi = noTransaksi;
    }

    public TransaksiEntity() {
    }
    

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoTransaksi() {
        return idTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.idTransaksi = noTransaksi;
    }

    
}
