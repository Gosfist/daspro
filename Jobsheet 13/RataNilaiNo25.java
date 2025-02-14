import java.util.Scanner;

public class RataNilaiNo25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, j, nilaiMhs;
        float totalNilai, rataNilai;

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Masukkan nilai mahasiswa ke-" +i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" +j+ " = ");
                nilaiMhs = input.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("rata-rata Nilai Mahasiswa ke-" +i+ " adalah " +rataNilai);
            i++;
        }
    }
}
