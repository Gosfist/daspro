import java.util.Scanner;

public class Kuis4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlTiket,harga;
        int hargaTiket=60000;
        int totalTiket=0;
        int totalHarga=0;
        double diskon,hargaTotal;

        System.out.println("==============================");
        System.out.println("    Selamat Datang Di CGV     ");
        System.out.println("==============================");
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk mengakhiri): ");
            jmlTiket = input.nextInt();

            if (jmlTiket<0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }
            if (jmlTiket==0) {
                break;
            }

            if (jmlTiket>=10) {
                harga  = jmlTiket*hargaTiket;
                diskon = 0.15*harga;
                int diskonn = (int) diskon;
                hargaTotal = harga-diskon;
                int hargaTotall = (int) hargaTotal;
                System.out.println("==============================");
                System.out.println("Jumlah Tiket: "+jmlTiket);
                System.out.println("Harga Tiket : "+harga);
                System.out.println("Diskon      : "+diskonn);
                System.out.println("Harga Total : "+hargaTotall);
                System.out.println("==============================");
                System.out.println();
            } else if (jmlTiket>4 && jmlTiket<10) {
                harga = jmlTiket*hargaTiket;
                diskon = 0.10*harga;
                int diskonn = (int) diskon;
                hargaTotal = harga-diskon;
                int hargaTotall = (int) hargaTotal;
                System.out.println("==============================");
                System.out.println("Jumlah Tiket: "+jmlTiket);
                System.out.println("Harga Tiket : "+harga);
                System.out.println("Diskon      : "+diskonn);
                System.out.println("Harga Total : "+hargaTotall);
                System.out.println("==============================");
                System.out.println();
            } else {
                hargaTotal  = jmlTiket*hargaTiket;
                int hargaTotall = (int) hargaTotal;
                System.out.println("==============================");
                System.out.println("Jumlah Tiket: "+jmlTiket);
                System.out.println("Harga tiket : "+hargaTotall);
                System.out.println("==============================");
                System.out.println();
            }

            totalTiket += jmlTiket;
            totalHarga += hargaTotal;
        } while (true);
        System.out.println("===============================");
        System.out.println("Penjualan  tiket hari ini : " +totalTiket);
        System.out.println("Pendapatan tiket hari ini : " +totalHarga);
        System.out.println("==============================");
        System.out.println();
    }
}
