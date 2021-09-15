package BT;
import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
		System.out.println("tuoi cua ban >= 16");
		Scanner input = new Scanner(System.in);
		System.out.println("nhap can nang: ");
		double a = input.nextDouble();
		System.out.println("nhap chieu cao: ");
		double b = input.nextDouble();
		double bmi;
		bmi = a/(b*b);
		System.out.print("BMI cua ban la: ");
		if (bmi < 18.5) {
			System.out.print("Underweight");
		}
		else if ((bmi >= 18.5)&&(bmi < 25.0)) {
			System.out.print("Normal");
		}
		else if ((bmi >= 25.0)&&(bmi < 30.0)) {
			System.out.print("Overweight");
		}
		else {
			System.out.print("Obese");
		}
	}
}
