import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "nana";
        String pass = "123";
        // System.out.print("Masukan user: ");
        // String user = input.nextLine();

        // System.out.print("Masukan user: ");
        // String pass = input.next();

        if (user=="nana" && pass == "123") {
            System.out.println("pengguna dapat masuk ke dalam sistem");
        } else {
            System.out.println("user dan password salah");
        }
    }
}
