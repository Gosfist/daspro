import java.util.Scanner;
public class Kuis5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String cabang[] = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtlit = 5;
        
        String atlet[][] = new String[cabang.length][jumlahAtlit];
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Masukkan nama atlet " + cabang[i] + ":");
            for (int a = 0; a < jumlahAtlit; a++) {
                System.out.print("Atlet ke-" + (a + 1) + ": ");
                atlet[i][a] = input.nextLine();
            }
            System.out.println();
        }

        System.out.println("Daftar Atlit:");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Cabang " + cabang[i] + ":");
            for (int a = 0; a < jumlahAtlit; a++) {
                System.out.println("- " + atlet[i][a]);
            }
            System.out.println();
        }

    }
}