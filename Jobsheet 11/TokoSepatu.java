import java.util.Scanner;

public class TokoSepatu {

    static String merk,kategori;
    static int ukuran,harga;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Selamat Datang");
        System.out.println("====================");
     
        System.out.println("Merk: ");
        System.out.println("1. Converse");
        System.out.println("2. Sketcher");
        System.out.println("3. Nike");
        System.out.print("pilih merk kesukaan anda: ");
        merk = input.nextLine();

        if (merk.equalsIgnoreCase("Converse")) {
            System.out.println("====================");
            System.out.println("Kategori: ");
            System.out.println("1. Slip On");
            System.out.println("2. High Top");
            System.out.print("pilih kategori: ");
            kategori = input.nextLine();

            if (kategori.equalsIgnoreCase("slip on")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 36-40: ");
                ukuran = input.nextInt();
                if (ukuran>=36 && ukuran<=40) {
                    harga = 800000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 40-44: ");
                ukuran = input.nextInt();
                if (ukuran>=40 && ukuran<=44) {
                    harga = 1200000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else { 
                System.out.println("Maaf kategori tidak tersedia");
                return;
            }

        } else if (merk.equalsIgnoreCase("Sketcher")) {
            System.out.println("====================");
            System.out.println("Kategori: ");
            System.out.println("1. Woman");
            System.out.println("2. Man");
            System.out.print("pilih kategori: ");
            kategori = input.nextLine();
            

            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 36-40: ");
                ukuran = input.nextInt();
                if (ukuran>=36 && ukuran<=41) {
                    harga = 1000000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 40-44: ");
                ukuran = input.nextInt();
                if (ukuran>=41 && ukuran<=44) {
                    harga = 1800000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else { 
                System.out.println("Maaf kategori tidak tersedia");
                return;
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            System.out.println("====================");
            System.out.println("Kategori: ");
            System.out.println("1. Kids");
            System.out.println("2. Adult");
            System.out.print("pilih kategori: ");
            kategori = input.nextLine();

            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 36-40: ");
                ukuran = input.nextInt();
                if (ukuran>=36 && ukuran<=40) {
                    harga = 750000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.println("====================");
                System.out.print("Masukan ukuran sepatu 40-44: ");
                ukuran = input.nextInt();
                if (ukuran>=40 && ukuran<=44) {
                    harga = 1500000; 
                } else {
                    System.out.println("Maaf ukuran tidak tersedia");
                    return;
                }
            } else { 
                System.out.println("Maaf kategori tidak tersedia");
                return;
            }
        } else {
            System.out.println("Maaf merk tidak tersedia");
            return;
        }

        System.out.println("====================");
        System.out.println("Merk sepatu: "+merk);
        System.out.println("Kategori sepatu: "+kategori);
        System.out.println("Ukuran sepatu: "+ukuran);
        System.out.println("Harga sepatu: Rp."+harga);
        System.out.println("====================");

    }
}
