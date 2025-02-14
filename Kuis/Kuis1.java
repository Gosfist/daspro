import java.util.Scanner;

public class Kuis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari;
        
        do { 
            System.out.println("0 untuk keluar");
            System.out.print("Masukan hari ke: ");
            hari = input.nextInt();
            
            if (hari==0) {
                break;
            }

            switch (hari) {
                case 1:
                case 8:
                case 15:
                case 22:
                    System.out.println("Hari: Senin");
                    System.out.println("=================");
                break;
                case 2:
                case 9:
                case 16:
                case 23:
                    System.out.println("Hari: Selasa");
                    System.out.println("=================");
                break;
                case 3:
                case 10:
                case 17:
                case 24:
                    System.out.println("Hari: Rabu");
                    System.out.println("=================");
                break;
                case 4:
                case 11:
                case 18:
                case 25:
                    System.out.println("Hari: Kamis");
                    System.out.println("=================");
                break;
                case 5:
                case 12:
                case 19:
                case 26:
                    System.out.println("Hari: Jumat");
                    System.out.println("=================");
                break;
                case 6:
                case 13:
                case 20:
                case 27:
                    System.out.println("Hari: Sabtu");
                    System.out.println("=================");
                break;
                case 7:
                case 14:
                case 21:
                case 28:
                    System.out.println("Hari: Minggu");
                    System.out.println("=================");
                break;
                default:
                System.out.println("Angka tidak valid (1-28)");
                    break;
            }
        } while (true);
        
    }
}
