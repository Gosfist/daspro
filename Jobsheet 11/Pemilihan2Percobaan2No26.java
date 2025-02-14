import java.util.Scanner;

public class Pemilihan2Percobaan2No26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int Pilihan_menu, harga;
        double diskon,afterdiskon;
        String member,pembayaran;

        System.out.println("=====================================");
        System.out.println("============MENU CAFE JTI============");
        System.out.println("=====================================");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("=====================================");
        System.out.print("Masukan angka dari menu yang dipilih: ");
        Pilihan_menu = input26.nextInt(); 
        input26.nextLine();
        System.out.print("Apakah punya member (y/n)?: ");
        member = input26.nextLine();
        System.out.print("Masukan Jenis Pembayaran: ");
        pembayaran = input26.nextLine();
        System.out.println("=====================================");

        
        if (pembayaran.equalsIgnoreCase("qris")) {
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                System.out.println("Diskon Qris = 1000");
                if (Pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl= "+harga);
                    afterdiskon = (harga-(diskon*harga))-1000;
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else if (Pilihan_menu == 2 ) {
                    harga = 3000;
                    System.out.println("Harga Icea Tea= "+harga);
                    afterdiskon = (harga-(diskon*harga))-1000;
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else if (Pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bundling= "+harga);
                    afterdiskon = (harga-(diskon*harga))-1000;
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else {
                    System.out.println("Masukan pilhan menu dengan benar");
                    return;
                }
            } else if ((member.equalsIgnoreCase("n"))){
                System.out.println("Diskon Qris = 1000");
                if (Pilihan_menu == 1) {
                    harga = 14000;
                    afterdiskon = harga-1000;
                    System.out.println("Harga Ricebowl= "+harga);
                    System.out.println("Total Bayar= "+afterdiskon);
                } else if (Pilihan_menu == 2 ) {
                    harga = 3000;
                    afterdiskon = harga-1000;
                    System.out.println("Harga Icea Tea= "+harga);
                    System.out.println("Total Bayar= "+afterdiskon);
                } else if (Pilihan_menu == 3) {
                    harga = 15000;
                    afterdiskon = harga-1000;
                    System.out.println("Harga Paket Bundling= "+harga);
                    System.out.println("Total Bayar= "+afterdiskon);
                } else {
                    System.out.println("Masukan pilhan menu dengan benar");
                    return;
                }
            } else {
                System.out.println("Member tidak valid");
            }

        } else {
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                if (Pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl= "+harga);
                    afterdiskon = harga-(diskon*harga);
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else if (Pilihan_menu == 2 ) {
                    harga = 3000;
                    System.out.println("Harga Icea Tea= "+harga);
                    afterdiskon = harga-(diskon*harga);
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else if (Pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bundling= "+harga);
                    afterdiskon = harga-(diskon*harga);
                    System.out.println("Total bayar Setelah diskon= "+afterdiskon);
                } else {
                    System.out.println("Masukan pilhan menu dengan benar");
                    return;
                }
            } else if ((member.equalsIgnoreCase("n"))){
                if (Pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl= "+harga);
                    System.out.println("Total Bayar= "+harga);
                } else if (Pilihan_menu == 2 ) {
                    harga = 3000;
                    System.out.println("Harga Icea Tea= "+harga);
                    System.out.println("Total Bayar= "+harga);
                } else if (Pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bundling= "+harga);
                    System.out.println("Total Bayar= "+harga);
                } else {
                    System.out.println("Masukan pilhan menu dengan benar");
                    return;
                }
            } else {
                System.out.println("Member tidak valid");
            }
        }
        
    }
}
