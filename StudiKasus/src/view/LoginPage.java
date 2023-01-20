package view;

import controller.CustomerController;
import controller.HomePageController;
import java.util.Scanner;

public class LoginPage {
    private static Scanner input = new Scanner(System.in);
    CustomerController customer = new CustomerController();
    private String data = null;
            
    public void LoginPage() {
      while(true){
        System.out.print("Masukkan Email = ");
        String email = input.nextLine();
        System.out.print("Masukkan Password = ");
        String password = input.nextLine();
        data = customer.loginProccess(email, password);
        if(email!=null){
           System.out.println(" SELAMAT DATANG "+email);
           new HomePageController().toViewMenu();
        }else{
            System.out.println("email/password salah");
            System.out.println("DAFTAR?Y/T");
            char daftar;
            daftar=input.nextLine().charAt(0);
            if(daftar=='Y'){
                customer.toViewRegistrasi();
            }else{
                customer.toViewLogin();
            }
        }
            
    }
}
}
