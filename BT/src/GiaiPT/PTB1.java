package GiaiPT;
import java.util.Scanner;
public class PTB1 {
	public static void main(String[] args) {
		float a,b;
		Scanner input = new Scanner (System.in);
		System.out.println("Moi nhap he so a: ");
		a = input.nextFloat();
		System.out.println("Moi nhap he so b: ");
		b = input.nextFloat();
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				System.out.print("Phuong trinh vo nghiem");
			}	
		}else {
			System.out.println("Phuong trinh co nghiem la x = "+(-b/a));
		}
	}
}
