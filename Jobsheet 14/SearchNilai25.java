import java.util.Scanner;

public class SearchNilai25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        int key;
        int hasil = -1;  
        
        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        nilai = input.nextInt();
        int[] arrnilai = new int[nilai];

        for(int i=0; i<arrnilai.length;i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            arrnilai[i] = input.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari : ");
        key = input.nextInt();
        
        for(int i=0; i<arrnilai.length;i++) {
            if (key==arrnilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil == -1) {
            System.out.println("nilai yang dicari tidak ditemukan");

        } else {
            System.out.println("nilai "+key+" ketemu di index ke-"+hasil);
        }
        System.out.println();
    }
}
