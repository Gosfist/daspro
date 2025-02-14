import java.util.Scanner;

public class soal4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jmljamkerja;
        double upahperjam, gaji, bonus, gajibonus, pajak, gajibulanan;
        pajak = 0.05;

        System.out.print("Masukan jumlah jam kerja karyawan: ");
        jmljamkerja = input.nextInt();
        System.out.print("Masukan gaji per jam karyawan: ");
        upahperjam = input.nextDouble();

        gaji = jmljamkerja*upahperjam;
        bonus = 0.10*gaji;
        gajibonus = gaji+bonus;
        pajak = 0.05*gajibonus;
        gajibulanan = gajibonus-pajak;

        System.out.println("Gaji bulanan karyawan yaitu: "+gajibulanan);


    }
}
