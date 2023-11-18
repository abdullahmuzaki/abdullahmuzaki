import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    double nilai;

    public MataKuliah(String nama, int sks, double nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }
}

public class Matakuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("Semester: ");
        int semester = scanner.nextInt();

    
        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        while (true) {
            scanner.nextLine(); 
            System.out.print("Nama Mata Kuliah (selesai untuk mengakhiri): ");
            String namaMataKuliah = scanner.nextLine();

            
            if (namaMataKuliah.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("SKS: ");
            int sks = scanner.nextInt();
            System.out.print("Nilai: ");
            double nilai = scanner.nextDouble();

            
            MataKuliah mataKuliah = new MataKuliah(namaMataKuliah, sks, nilai);
            daftarMataKuliah.add(mataKuliah);
        }

        
        System.out.println("\nRekap Nilai " + namaMahasiswa + " Semester " + semester + ":");
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            System.out.println("Mata Kuliah: " + mataKuliah.nama);
            System.out.println("SKS: " + mataKuliah.sks);
            System.out.println("Nilai: " + mataKuliah.nilai);
            System.out.println();
        }

        
        scanner.close();
    }
}