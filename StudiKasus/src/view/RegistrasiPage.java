package view;

import controller.CustomerController;
import java.util.Scanner;

public class RegistrasiPage {
   private CustomerController customer = new CustomerController();
    public void inputRegistrasi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String nama =input.next();
        System.out.print("Masukkan Email = ");
        String email=input.next();
        System.out.print("Masukkan No telp = ");
        String noTelp=input.nextLine();
        System.out.println("Masukkan Password = ");
        String password=input.nextLine();
        boolean status = customer.registerUser(nama, email, noTelp, password);
        if(status==true){
            System.out.println("Registrasi Berhasil");
            customer.toViewLogin();
        }
        else{
            System.out.println("Username Sudah Digunakan");
            customer.toViewRegistrasi();
        }
    }
}
