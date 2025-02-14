import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukan warna lampu: ");
        String lampu = input.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("warna merah");
                break;
            case "kuning":
                System.out.println("warna kuning");
                break;
            case "hijau":
                System.out.println("warna hijau");
                break;
            default:
                System.out.println("lampu tidak terdaftar");
                break;
        }

    }
}
