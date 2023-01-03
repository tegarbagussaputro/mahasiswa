package mahasiswa;

public class entity implements ClassInterface{

    String nama,alamat,tgllhr,tmptlhr,nohp,nim;
    static String Username;
    static String Password;

    public void setUsername(String username){
        this.Username = username;
    }

    public void getPassword(String password) {
        this.Password = password;
    }
}
