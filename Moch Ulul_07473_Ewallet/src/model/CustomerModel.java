package model;
import java.util.*;
import java.util.ArrayList;
import entity.CustomerEntity;

public class CustomerModel {
    private static ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
    //view atau read
    
    public static ArrayList<CustomerEntity> getCustomer(){
        return customerEntities;
    }
    
   //create
    public static boolean createCustomer(CustomerEntity customerList){
        customerEntities.add(customerList);
        return true;
    }
    
    public static int getIndexCustomer(String email){
        int index = -1;
        if (customerEntities.isEmpty()){
            System.out.println("DATA KOSONG");
        }
        else
        {
            for(CustomerEntity customer : customerEntities){
                if(customer.getEmail().equals(email)){
                    index = customerEntities.indexOf(customer);
                }
            }
        }
        return index;
    }
    public static boolean tambahSaldo(String email, int jumlah){
        int index = getIndexCustomer(email);
        customerEntities.get(index).setSaldo(customerEntities.get(index).getSaldo() + jumlah);
        return true;
    }
    public static boolean kurangSaldo(String email, int jumlah){
        boolean status = false;
        int index = getIndexCustomer(email);
//        lakukan pengecekan apakah saldo yang ada cukup untuk melakukan transaksi
        if(customerEntities.get(index).getSaldo() < jumlah){
            status = false;
        }
        else{
            customerEntities.get(index).setSaldo(customerEntities.get(index).getSaldo() - jumlah);
            status = true;
        }
        return status;
    }
    public static void updateNamaCustomer(int index, String nama){
        customerEntities.get(index).setNama(nama);
    }
    
    public static boolean updateNoTelponCustomer(int index, String NoTelp){
        customerEntities.get(index).setNoTelp(NoTelp);
        return true;
    }
    
    public static boolean updatePasswordCustomer(int index, String password){
        customerEntities.get(index).setPassword(password);
        return true;
    }
    
    public static CustomerEntity findUser(String email){
        for(CustomerEntity customerEntity : customerEntities )
            if(customerEntity.getEmail().equals(email)){
                return customerEntity;
            }
        return null;
    }
    
    public static void updateProfil(CustomerEntity email ){
       int index = indexData(email.getEmail());
       if(index!=-1){
           customerEntities.set(index,email);
       }
    }
    
    public static int indexData(String email){
        CustomerEntity findemail=findUser(email);
        return customerEntities.indexOf(email);
    }
   
}
    