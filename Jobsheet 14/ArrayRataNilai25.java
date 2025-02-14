import java.util.Scanner;

public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total1 = 0,total2 = 0;
        double rata1, rata2;
        int lulus = 0,tidakLulus = 0,mahasiswa;

        System.out.print("Masukan jumlah mahasiswa : ");
        mahasiswa = input.nextInt();
        int[] nilaiMhs = new int[mahasiswa];

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai Mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = input.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) { 
                total1 += nilaiMhs[i];
                lulus++;
            } else {
                total2 += nilaiMhs[i];
                tidakLulus++;
            }
        }

        if (lulus > 0) {
            rata1 = total1 / lulus;
            System.out.println("Rata-rata nilai lulus = " + rata1);
        } else {
            System.out.println("Rata-rata nilai lulus = 0");
        }

        if (tidakLulus > 0) {
            rata2 = total2 / tidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rata2);
        } else {
            System.out.println("Rata-rata nilai lulus = 0");
        }
    }
}

