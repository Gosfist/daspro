import java.util.Scanner;

public class PemilihanHari26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = input.next();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
            dayType = "invalid day name";
                break;
        }

        System.out.println(dayName + " is a " + dayType);

    }
}
