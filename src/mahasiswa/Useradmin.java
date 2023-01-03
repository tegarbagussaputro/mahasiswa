package mahasiswa;
import java.util.Scanner; //digunakan untuk menggunakan scanner

public class Useradmin extends  entity{

    public static void main(String[] args) {

        Password = "1234";
        Username = "admin";

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) { //equals digunakan untuk membandinkan hasil inputan

            System.out.println("=====selamat datang admin=====");

        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
            System.exit(0);
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
            System.exit(0);
        } else {
            System.out.println("Invalid Username & Password!");
            System.exit(0);
        }
        menuutama menu = new menuutama();
        menu.menupilihan();

    }

}