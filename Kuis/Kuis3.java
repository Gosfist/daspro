import java.util.Scanner;

public class Kuis3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori,gaji;
        double pajak,gajibersih;

        do {   
        System.out.println("=============================");
        System.out.println("Kategori pekerjaan");
        System.out.println("0. keluar");
        System.out.println("1. Swasta");
        System.out.println("2. Negeri");
        System.out.print("Masukan kategori pekerjaan: ");
        kategori = input.nextInt();
        
        if (kategori==0) {
            break;
        }
        if (kategori==1) {
            System.out.print("Masukan nominal gaji: ");
            gaji = input.nextInt();
            if (gaji<1500000) {
                System.out.println("Gaji bersih: "+gaji);
            } else if (gaji>=1500000 && gaji<=10000000) {
                pajak = 0.025*gaji;
                gajibersih = gaji - pajak;
                System.out.println("Total Pajak: "+pajak);
                System.out.println("Gaji bersih: "+gajibersih);
            } else {
                pajak = 0.05*gaji;
                gajibersih = gaji - pajak;
                System.out.println("Total Pajak: "+pajak);
                System.out.println("Gaji bersih: "+gajibersih);
            }
        } else if (kategori==2) {
            System.out.print("Masukan nominal gaji: ");
            gaji = input.nextInt();
            if (gaji<1200000) {
                System.out.println("Gaji bersih: "+gaji);
            } else if (gaji>=1200000 && gaji<=5000000) {
                pajak = 0.02*gaji;
                gajibersih = gaji - pajak;
                System.out.println("Total Pajak: "+pajak);
                System.out.println("Gaji bersih: "+gajibersih);
            } else {
                pajak = 0.0*gaji;
                gajibersih = gaji - pajak;
                System.out.println("Total Pajak: "+pajak);
                System.out.println("Gaji bersih: "+gajibersih);
            }
        } else {
            System.out.println("Kategori tidak valid");
        }
        } while (true);
    }
}
