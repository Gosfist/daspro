import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int usia;

        System.out.print("Masukan usia: ");
        usia = input.nextInt();
        
        if (usia <= 6) {
            System.out.println("Bayi dan Balita");
        } else if (usia <= 12) {
            System.out.println("Anak-Anak");
        } else if (usia <= 18) {
            System.out.println("Remaja");
        } else if (usia <= 59) {
            System.out.println("Dewasa");
        } else {
            System.out.println("lansia");
        } 
    }
}
