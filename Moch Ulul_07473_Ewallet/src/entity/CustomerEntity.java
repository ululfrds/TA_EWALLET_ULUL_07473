package entity;
public class CustomerEntity extends OrangEntity{
    private String email;
    private String noTelp;
    private int saldo;


    public CustomerEntity(String email, String noTelp, String nama, String password) {
        super(nama, password);
        this.email = email;
        this.noTelp = noTelp;
    }
    
    public CustomerEntity() {
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String NoTelp) {
        this.noTelp = NoTelp;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}