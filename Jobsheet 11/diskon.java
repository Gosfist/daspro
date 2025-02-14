import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklrasi
        String jenis;
        int jumlah;

        System.out.print("Masukan jenis buku: ");
        jenis = input.nextLine();
        System.out.print("Masukan Jumlah buku: ");
        jumlah = input.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                System.out.println("selamat mendapatkan diskon 12%");
            } else {
                System.out.println("Selamat mendapatkan diskon 10%");
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                System.out.println("selamat mendapatkan diskon 9%");
            } else {
                System.out.println("selamat mendapatkan diskon 8%");
            }
        } else {
            if (jumlah > 3) {
                System.out.println("selamat mendapatkan diskon 5%");
            } else {
                System.out.println("tidak mendapatkan diskon");
            }
        }


    }
}
