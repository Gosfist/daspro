import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean keanggotaan ;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi, hargaTeh, hargaRoti, totalHarga, nominalBayar;
        float diskon;

        hargaKopi = 12000;
        hargaTeh = 7000;
        hargaRoti = 20000;
        diskon = 0.1f;

        System.out.print("Apakah sudah daftar anggota? (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah Kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah Teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah Roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi*hargaKopi)+(jmlTeh*hargaTeh)+(jmlRoti*hargaRoti);
        nominalBayar = totalHarga-(diskon*totalHarga);
        nominalBayar = Math.round(nominalBayar);
        System.out.println("Nominal bayar adalah: "+nominalBayar);
    }
}
