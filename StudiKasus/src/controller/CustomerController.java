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
        return true;
    }
    
    public String loginProccess(String email, String Password){
        CustomerEntity customerEntity = CustomerModel.findUser(email);
        if(customerEntity!=null){
            if(customerEntity.getPassword().equals(Password)){
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
    
    /*public void updateNama(int index, String email){
        CustomerModel.updateNamaCustomer(index, email);
    }*/
    
    public void toViewLogin(){
        LoginPage login = new LoginPage();
        login.LoginPage();
    }
    
    public void toViewRegistrasi(){
        RegistrasiPage regis = new RegistrasiPage();
        regis.inputRegistrasi();
    }
    
    public CustomerEntity findemail(String email){
        return CustomerModel.findUser(email);
    }
    
}
