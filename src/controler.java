package mahasiswa;

import java.util.Scanner;
import java.util.ArrayList;

public class controler extends entity{ //object class menu admin
    private ArrayList<String> nama = new ArrayList<>(); //arraylist bisa menggunakan generic, bersifat dinamis dan dapat diubah
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> nohp = new ArrayList<>();
    private ArrayList<String> tmptlhr = new ArrayList<>();
    private ArrayList<String> tgllhr = new ArrayList<>();
    private ArrayList<String> nim = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    
    void tambah(String nama, String alamat, String nohp,String tmptlhr, String tgllhr, String nim){ //method tambah
        this.nama.add(nama); //menambahkan data pada array menggunakan add
        this.alamat.add(alamat);
        this.nohp.add(alamat);
        this.tmptlhr.add(tmptlhr);
        this.tgllhr.add(tgllhr);
        this.nim.add(nim);
    }
    void hapus(int number){
        this.nama.remove(number-1); //remove untuk menghapus nilai/value pada arraylist
        this.alamat.remove(number-1);
        this.nohp.remove(number-1);
        this.tmptlhr.remove(number-1);
        this.tgllhr.remove(number-1);
        this.nim.remove(number-1);
    }
    void edit(int number, String nama, String alamat, String nohp,String tmptlhr, String tgllhr,String nim){
        this.nama.set(number-1,nama); //menggunakan set untuk memberikan nilai pada value
        this.alamat.set(number-1,alamat);
        this.nohp.set(number-1,nohp);
        this.tmptlhr.set(number-1,tmptlhr);
        this.tgllhr.set(number-1,tgllhr);
        this.nim.set(number-1,nim);
    }
    void tampil(){
        for(int i = 0; i<nim.size() ;i++){
            int j= i+1;
            System.out.println(j+ " Nama                 : " + nama.get(i));
            System.out.println( "   Alamat               : " + alamat.get(i));
            System.out.println( "   Nohp                 : " + nohp.get(i));
            System.out.println( "   tempat tanggal lahir : " + tmptlhr.get(i));
            System.out.println( "   tanggal lahir        : " + tgllhr.get(i));
            System.out.println( "   nip                  : " + nim.get(i));
        }
    }

    public ArrayList<String> getNama() {
        return nama;
    } // get berfungsi untuk mengembalikan nilai value pada variabel

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public ArrayList<String> getNohp() {
        return nohp;
    }

    public ArrayList<String> getTmptlhr() {
        return tmptlhr;
    }

    public ArrayList<String> getTgllhr() {
        return tgllhr;
    }

    public void tambah(String nama, String alamat, String nohp, String tmptlhr, String tgllhr) {
    }
    }

