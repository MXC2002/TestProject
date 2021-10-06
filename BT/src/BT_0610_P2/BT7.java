package BT_0610_P2;
import java.util.Scanner;
public class BT7 {
	private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac chu so " + "cua %d la: %d", n, totalDigitsOfNumber(n));
    }
    static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }

}
