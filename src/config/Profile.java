package config;
public class Profile {
    private int ID_User;
    private String Nama_User;
    private String Username;
    private String Password;
    private String Level;

    public Profile(int ID_User, String Nama_User, String Username, String Password, String Level) {
        this.ID_User = ID_User;
        this.Nama_User = Nama_User;
        this.Username = Username;
        this.Password = Password;
        this.Level = Level;
    }

    public Profile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getNama_User() {
        return Nama_User;
    }

    public void setNama_User(String Nama_User) {
        this.Nama_User = Nama_User;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }
}