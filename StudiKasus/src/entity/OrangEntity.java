package entity;
public abstract class OrangEntity {
    private String nama;
    private String password;

    public OrangEntity(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public OrangEntity() {
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
