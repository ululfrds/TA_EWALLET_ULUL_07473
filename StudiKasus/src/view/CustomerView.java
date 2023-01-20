package view;
import controller.CustomerController;
import entity.CustomerEntity;
import java.util.ArrayList;
import model.CustomerModel;
import java.util.Scanner;


public class CustomerView implements ViewInterface {
    private CustomerController customer = new CustomerController();
    public void CustomerView(){
        CustomerModel customerModel = new CustomerModel();
        Scanner keyboard = new Scanner(System.in);
        int pilih;
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Update Data");
        System.out.println("PILIH = ");
        pilih = keyboard.nextInt();
            switch (pilih){
                case 1 :
                    view();
                    break;
                case 2 :
                    update();
                    break;
                default :
        //                customerModel.updateCustomer();
                    break;
            }  
    }
    public void view(){
        ArrayList<CustomerEntity> customerEntities = customer.toViewCustomer();
        System.out.println("Nama Customer = "+customerEntities.getNama());
        System.out.println("Email = "+customerEntities.getEmail());
        System.out.println("No. Telpon = "+customerEntities.get(index).getNoTelp());   
    }
    public void update(){
        Scanner input = new Scanner(System.in);
        ArrayList<CustomerEntity> customerEntities = customer.toViewCustomer();
        
        System.out.println("Data Yang di Update");
        System.out.println("1. Nama");
        System.out.println("2. No telpon");
        System.out.println("PILIH = ");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih){
            case 1 :
                System.out.println("Nama Baru = ");
                String nama=input.nextLine();
                customer.updateNama(nama);
                break;
            case 2 :
                System.out.println("No telp Baru");
                String noTelp = input.nextLine();
                break;
            default :
                System.out.println("PILIHAN TIDAK ADA");
                break;
        }
        
    }
}