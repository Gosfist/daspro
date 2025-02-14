import java.util.Scanner;

public class nilaiAkhir26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama,kelas,huruf,kualifikasi;
        byte absen;
        long nim;
        double nilai,kuis,tugas,ujian;

        System.out.print("Masukan nama: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        nim = input.nextLong();
        System.out.print("Masukan kelas: ");
        kelas = input.next();
        System.out.print("Masukan nomer absen: ");
        absen = input.nextByte();
        System.out.print("Masukan nilai kuis: ");
        kuis = input.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukan nilai ujian: ");
        ujian = input.nextDouble();

        nilai = (kuis+tugas+ujian)/3;

        if (nilai> 80 && nilai <= 100) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilai> 73 && nilai <= 80) {
            huruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilai> 65 && nilai <= 73) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (nilai> 60 && nilai <= 65) {
            huruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilai> 50 && nilai <= 60) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilai> 39 && nilai <= 50) {
            huruf = "D";
            kualifikasi = "kurang";
        } else {
            huruf = "E";
            kualifikasi = "Gagal";
        } 

        System.out.println("Mahasiswa dengan nama "+nama+" (NIM) "+nim+" kelas "+kelas+" nomor absen "+absen);
        System.out.println("Nilai akhir: "+nilai);
        System.out.println("Nilai akhir huruf: "+huruf);
        System.out.println("Kualifikasi: "+kualifikasi);
    }
}
