import java.util.Scanner;

public class PemilihanBilangan26 {
    public static void main(String[] args) {
        int angka;
        String hasil;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        angka = input.nextInt();

        hasil = (angka % 2 == 0) ? "Termasuk Bilangan Genap" : "Termasuk Bilangan Ganjil";
        System.out.println("hasil: "+hasil);
    }
}

