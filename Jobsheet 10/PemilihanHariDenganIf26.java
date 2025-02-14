import java.util.Scanner;

public class PemilihanHariDenganIf26 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        angka = input.nextInt();

        if (angka >= 1 && angka <=5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.err.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
