import java.util.Scanner;

public class Pemilihan2Percobaan1No26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukan tahun: ");
        tahun = input26.nextInt();

        if (tahun % 4 == 0) {
            if ((tahun % 100) !=0 ) {
                System.out.println("Tahun Kabinet");
            } else 
                System.out.println("Bukan Tahun Kabiset");
            }
    }
}
