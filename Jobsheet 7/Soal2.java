

import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // deklarasi 
        int a,b,c,d;

        // input
        System.err.print("Masukan umur budi : ");
        b = input.nextInt();

        // proses
        a = 8 + b;
        c = 5 + b;
        d = (a+b)/2;

        System.out.println("Usia Andi = "+a);
        System.out.println("Usia Budi = "+b);
        System.out.println("Usia Candra = "+c);
        System.out.println("Usia Deni = "+d);

    }
}

