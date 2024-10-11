package JAWAK;

// Kelas utama
public class jawaa1 {
    public static void main(String[] args) {
        // Membuat objek dari kelas data dengan parameter
        Data mahasiswa1 = new Data(19, 4.0, 'A', true);
        Data mahasiswa2 = new Data(21, 3.5, 'B', true);

        // Mencetak data mahasiswa dengan toString
        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
    }
}

// Kelas Data
class Data {
    // Deklarasi variabel
    private int umur;
    private double ipk;
    private char grade;
    private boolean isStudent;

    // Constructor untuk inisialisasi variabel
    public Data(int umur, double ipk, char grade, boolean isStudent) {
        this.umur = umur;
        this.ipk = ipk;
        this.grade = grade;
        this.isStudent = isStudent;
    }

    // Override toString untuk mencetak data
    @Override
    public String toString() {
        return "Umur: " + umur + ", IPK: " + ipk + ", Grade: " + grade + ", Mahasiswa: " + isStudent;
    }
}
