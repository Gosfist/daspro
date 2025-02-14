import java.util.Scanner;

public class KafeDoWhileNo26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int kopi,teh,roti,hargaKopi=12000,hargaTeh=7000,hargaRoti=20000,totalHarga;
            String namaPelanggan;
            
            do {
                System.out.print("Masukan nama pelanggan (ketik `batal` untuk keluar): ");
                namaPelanggan = input.nextLine();
                if (namaPelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("Transaksi dibatalkan");
                    break;
                }
                System.out.print("Jumlah Kopi: ");
                kopi = input.nextInt();
                System.out.print("Jumlah Teh: ");
                teh = input.nextInt();
                System.out.print("Jumlah Roti: ");
                roti = input.nextInt();
                totalHarga = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
                System.out.println("total yang harus dibayar: "+totalHarga);
                input.nextLine();

            } while (true);
            System.out.println("semua transaksi selesai");
    }
}
