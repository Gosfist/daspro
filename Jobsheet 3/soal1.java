import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;
        System.out.print("Masukan nama siswa: ");
        nama = input.nextLine();
        System.out.print("Masukan nim siswa: ");
        nim = input.nextLine();
        System.out.print("Masukan kelas siswa: ");
        kelas = input.next().charAt(0);
        System.out.print("Masukan absen siswa: ");
        absen = input.nextByte();
        System.out.print("Masukan nilai kuis: ");
        nilaikuis = input.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaitugas = input.nextDouble();
        System.out.print("Masukan nilai ujian: ");
        nilaiujian = input.nextDouble();
        
        nilaiakhir = (nilaikuis+nilaitugas+nilaiujian)/3;

        System.out.print("Nilai akhir "+nama+" dengan NIM "+nim+" absen "+absen+" dari kelas "+kelas+" adalah "+nilaiakhir);
    
    }
}
