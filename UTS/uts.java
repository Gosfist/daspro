import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklrasi
        int hp;
        double kredit,hargaKredit,uangMuka,sisaPinjaman,cicilan;

        // input
        System.out.print("Masukan Harga HP: ");
        hp = input.nextInt();

        // proses
        kredit = 0.10*hp;
        hargaKredit = kredit + hp;
        uangMuka = 0.30 * hargaKredit;
        sisaPinjaman = hargaKredit - uangMuka;
        cicilan = sisaPinjaman / 12;
      
        // output
        System.out.println("Uang Muka: "+uangMuka);
        System.out.println("cicilan: "+cicilan);

    }
}
