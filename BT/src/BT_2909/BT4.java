package BT_2909;
import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();
        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 0: dayName = "Monday"; break;
            case 1: dayName = "Tuesday"; break;
            case 2: dayName = "Wednesday"; break;
            case 3: dayName = "Thursday"; break;
            case 4: dayName = "Friday"; break;
            case 5: dayName = "Saturday"; break;
            case 6: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }
}