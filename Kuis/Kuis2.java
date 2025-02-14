import java.util.Scanner;

public class Kuis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        do {
            System.out.println("ketik 999 untuk keluar");
            System.out.print("Masukan Nilai: ");
            nilai = input.nextInt();
            if (nilai==999) {
               break; 
            }
            if (nilai>=0 && nilai<=70) {
                System.out.println("Tidak Lulus");
            } else if (nilai>=71 && nilai<=100) {
                System.out.println("Lulus");
            } else {
                System.out.println("Nilai tidak valid");
            }
        } while (true);
    }
}
