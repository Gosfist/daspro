import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tarifkwh, totaltarifkwh, pemakaian;
        boolean bataspemakaian;
        tarifkwh = 1500;

        System.out.print("Masukan total pemakaian listrik dalam kwh: ");
        pemakaian = input.nextDouble();
        totaltarifkwh = tarifkwh*pemakaian;
        System.out.println("Tagihan listrik anda yaitu "+totaltarifkwh);
        bataspemakaian = pemakaian <= 500;
        if (bataspemakaian) {
            System.out.println("Ket: Penggunaan listrik tidak melebihi 500 kwh");
        } else {
            System.out.println("Ket: Penggunaan listrik melebihi 500 kwh");
        }
    }
}
