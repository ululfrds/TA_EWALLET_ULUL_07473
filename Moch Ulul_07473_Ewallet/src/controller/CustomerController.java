package controller;


import java.util.ArrayList;
import model.CustomerModel;
import entity.CustomerEntity;
import view.RegistrasiPage;
import view.LoginPage;

public class CustomerController {
    public ArrayList<CustomerEntity> toViewCustomer(){
        return CustomerModel.getCustomer();
    }
    
    public boolean inputCustomer(CustomerEntity customerList){
        return CustomerModel.createCustomer(customerList);
    }
    
    public boolean registerUser(String nama, String email, String noTelp, String password){
        if(CustomerModel.findUser(email)==null){
            CustomerEntity customerBaru = new CustomerEntity(nama, email, noTelp, password);
            CustomerModel.createCustomer(customerBaru);
            return true;
        }
        return false;
    }
    
    public String loginProccess(String email, String Password){
        CustomerEntity customerEntity = CustomerModel.findUser(email);
        if(customerEntity!=null){
            if((customerEntity.getPassword().equals(Password)) && (customerEntity.getEmail().equals(email))){
                return customerEntity.getEmail();
            }
        }
        return null;
    }
    
    public boolean updateProfil(String nama, String email, String password, String noTelp){
        CustomerEntity customerProfil = new CustomerEntity(nama, email, noTelp, password);
        CustomerModel.updateProfil(customerProfil);
        return true; 
    }
    
    
    public int getIndexCustomer(String email){
        return CustomerModel.getIndexCustomer(email);
    }
    
    public void updateNama(String email, String nama){
        int index = CustomerModel.getIndexCustomer(email);
        CustomerModel.updateNamaCustomer(index, email);
    }
    
    public void updateNoTelp(String email, String NoTelp){
        int index = CustomerModel.getIndexCustomer(email);
        CustomerModel.updateNoTelponCustomer(index, NoTelp);
    }
    
    public void updatePassword(String email, String password){
        int index = CustomerModel.getIndexCustomer(email);
        CustomerModel.updatePasswordCustomer(index, password);
    }
   
    
    public void toViewLogin(){
        LoginPage login = new LoginPage();
        login.cekLogin();
    }
    
    public void toViewRegistrasi(){
        RegistrasiPage regis = new RegistrasiPage();
        regis.inputRegistrasi();
    }
    
    public CustomerEntity findemail(String email){
        return CustomerModel.findUser(email);
    }
    public boolean kurangSaldo(String email, int jumlah){
        return CustomerModel.kurangSaldo(email, jumlah);
    }
    public boolean tambahSaldo(String email, int jumlah){
        return CustomerModel.tambahSaldo(email, jumlah);
    }
}
