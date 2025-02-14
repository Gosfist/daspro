public class Soal3 {
    public static void main(String[] args) {
        // deklarasi
        int panjang,lebar,banyakPohon,jarak,pohonPanjang,pohonLebar;

        // input
        panjang = 500;
        lebar = 300;
        jarak = 5;

        // proses
        pohonPanjang = panjang / jarak;
        pohonLebar = lebar / jarak;
        banyakPohon = 2 * (pohonPanjang+pohonLebar);
        // output
        System.out.println("Total Pohon = "+banyakPohon);
    }
}


