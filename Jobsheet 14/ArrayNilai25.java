import java.util.Scanner;

public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i=0;i<nilaiAkhir.length;i++) {
            System.out.print("masukan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for(int i=0;i<nilaiAkhir.length;i++) {
            if (nilaiAkhir[i] >70) {
                System.out.println("mahasiswa ke-"+i+" lulus!");
            } else {
                System.out.println("mahasiswa ke-"+i+" tidak lulus!");
            }

        }
    }
}
