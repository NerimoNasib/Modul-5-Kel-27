
package modul.pkg5.tugas;

import java.util.Scanner;

public class Modul5Tugas {
    public static void main(String[] args) {

         String email, password;
        //obyek untuk input
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
       //object untuk memanggil class 
        userService satu = new userService( email, password );
        satu.login();//memanggil method tanpa parameter 
    }
    
}
