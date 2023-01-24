package view;
import controller.CustomerController;
import entity.CustomerEntity;
import java.util.ArrayList;
import model.CustomerModel;
import java.util.Scanner;


public class CustomerView{
    private CustomerController customer = new CustomerController();
    public void customerPage(){
        CustomerModel customerModel = new CustomerModel();
        Scanner keyboard = new Scanner(System.in);
        int pilih;
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Update Data");
        System.out.print("PILIH = ");
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
        for(CustomerEntity customerEntity : customerEntities){
            System.out.println("==========PROFIL USER==========");
            System.out.println("Email Customer = "+customerEntity.getEmail());
            System.out.println("Nama Customer = "+customerEntity.getNama());
            System.out.println("No. Telpon = "+customerEntity.getNoTelp());
        }
          
    }
    public void update(){
        Scanner input = new Scanner(System.in);
        ArrayList<CustomerEntity> customerEntities = customer.toViewCustomer();
        
        System.out.print("Masukkan email yang akan diupdate :");
        String email = input.nextLine();
        System.out.println("=======MENU PROFIL=======");
        System.out.println("Data Yang di Update");
        System.out.println("1. Nama");
        System.out.println("2. No telpon");
        System.out.println("3. Password");
        System.out.print("PILIH = ");
        int pilih = input.nextInt();
        input.nextLine();
        switch (pilih){
            case 1 :
                System.out.print("Nama Baru = ");
                String nama=input.nextLine();
                customer.updateNama(email, nama);
                break;
            case 2 :
                System.out.print("No telp Baru");
                String noTelp = input.nextLine();
                customer.updateNoTelp(email, noTelp);
                break;
            case 3 :
                System.out.print("Password baru");
                String password = input.nextLine();
                customer.updatePassword(email, password);
            default :
                System.out.print("PILIHAN TIDAK ADA");
                break;
        }
    }
}