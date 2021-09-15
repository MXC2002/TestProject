package BT;

import java.util.Scanner;

public class BT {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       System.out.print("nhap so thu nhat: ");
	       int number1 = input.nextInt();
	       System.out.print("nhap so thu hai: ");
	       int number2 = input.nextInt();
	       if (number1 < number2) {
	       int temp = number1;
	       number1 = number2;
	       number2 = temp;
	       } 

	       System.out.print("thuc hien phep tinh " + number1 + " - " + number2 + "? ");
	       int answer = input.nextInt(); 
	       if (number1 - number2 == answer)
	       System.out.println("cau tra loi dung roi!");
	       else
	       System.out.println("cau tra loi sai roi.\n" + number1 + " - " + number2 + " phai la " + (number1 - number2));
	}
}