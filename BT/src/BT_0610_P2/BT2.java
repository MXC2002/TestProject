package BT_0610_P2;
import java.util.Scanner;
public class BT2 {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        System.out.println("Giai thua cua " + n + " la: " + tinhGiaithua(n));
    }
 
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }

}
