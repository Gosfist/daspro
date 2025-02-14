public class Soal1 {
    public static void main (String[] agrs) {

        // deklarasi
        int hargaLaptop;
        double kredit,hargaKredit,sisaPinjaman,uangMuka,cicilan;

        // input
        hargaLaptop = 7000000;

        // proses
        kredit = 0.20 * hargaLaptop;
        hargaKredit = kredit + hargaLaptop;
        uangMuka = 0.30 * hargaKredit;
        sisaPinjaman = hargaKredit - uangMuka;
        cicilan = sisaPinjaman / 12;

        // ouput
        System.out.println("Uang muka: "+uangMuka+"\nCicilan per bulan: "+cicilan);
    }
}

