import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kendaraan;
        int waktu,hasil;

        System.out.print("Masukan jenis kendaraan: ");
        kendaraan = input.nextLine();

        System.out.print("Masukan lama parkir: ");
        waktu = input.nextInt();
        
        switch (kendaraan) {
            case "mobil":
                hasil = waktu*5000;
                System.out.println("jenis kendaraan: "+kendaraan);
                System.out.println("Tarif: "+hasil);
                break;
            case "motor":
                hasil = waktu*3000;
                System.out.println("jenis kendaraan: "+kendaraan);
                System.out.println("Tarif: "+hasil);
                break;
        
            default:
                System.out.println("salah");
                break;
        }

    }
}
