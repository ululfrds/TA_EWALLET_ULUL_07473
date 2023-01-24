package view;

import controller.*;
import java.util.Scanner;

public class LoginPage {
    private static Scanner input = new Scanner(System.in);
    CustomerController customer = new CustomerController();
    private String data = null;
    
    public void cekLogin(){
    
        System.out.println("==========LOGIN PAGE===========");
        System.out.print("Masukkan Nama = ");
        String nama = input.nextLine();
        System.out.print("Masukkan Password = ");
        String password = input.nextLine();
        data = customer.loginProccess(nama, password);
        if(data!=null){
           System.out.println("SELAMAT DATANG "+data);
           new HomePageController().toViewMenu();
        }else{
            System.out.println("email/password salah");
            System.out.println("DAFTAR?Y/T");
            char daftar;
            daftar=input.nextLine().charAt(0);
            if(daftar=='y' || daftar=='Y'){
                customer.toViewRegistrasi();
            }else{
                customer.toViewLogin();
            }
        }
    }
        
}
