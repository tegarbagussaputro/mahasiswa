package mahasiswa;
import java.sql.SQLOutput;
import java.util.Scanner;

public class menuutama extends entity{
    private int number;
    boolean choice =  true;
    mahasiswa.controler admin = new mahasiswa.controler();
    Scanner input = new Scanner(System.in);

    void menupilihan(){
        do {
            System.out.println("1. daftar mahasiswa");
            System.out.println("2. hapus data mahasiswa");
            System.out.println("3. edit data mahasiswa");
            System.out.println("4. tampilkan data mahasiswa");
            System.out.println("5. keluar");
            System.out.println("masukan pilihan : ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("========Menu pendataran========");
                    System.out.print("Masukan nama : ");
                    nama = input.next();
                    System.out.print("Masukan alamat : ");
                    alamat = input.next();
                    System.out.print("Masukan no hp : ");
                    nohp = input.next();
                    System.out.print("Masukan tempat lahir : ");
                    tmptlhr = input.next();
                    System.out.print("Masukan tanggal lahir : ");
                    tgllhr = input.next();
                    System.out.print("masukan nomer induk mahasiswa :");
                    nim = input.next();
                    System.out.println("========================================");
                    admin.tambah(nama, alamat, nohp, tmptlhr, tgllhr,nim);
                    break;
                case 2:
                    admin.tampil();
                    System.out.println("pilih nomer yang akan dihapus : ");
                    number = input.nextInt();
                    admin.hapus(number);
                    break;
                case 3:
                    admin.tampil();
                    System.out.println("pilih nomer yang akan diedit : ");
                    number = input.nextInt();
                    input.nextInt();
                    System.out.println("========================================");
                    System.out.print("Masukan nama : ");
                    nama = input.next();
                    System.out.print("Masukan alamat : ");
                    alamat = input.next();
                    System.out.print("Masukan no hp : ");
                    nohp = input.next();
                    System.out.print("Masukan tempat lahir : ");
                    tmptlhr = input.next();
                    System.out.print("Masukan tanggal lahir : ");
                    tgllhr = input.next();
                    System.out.print("masukan nim : ");
                    nim = input.next();
                    System.out.print("========================================");
                    admin.edit(number,nama ,alamat ,tgllhr ,tmptlhr ,nohp ,nim);
                    break;
                case 4:
                    System.out.println("===========================================================");
                    admin.tampil();
                    System.out.println("===========================================================");
                    break;
                case 5:
                    choice = false;
                    break;
            }
        }while(choice);
    }
}
