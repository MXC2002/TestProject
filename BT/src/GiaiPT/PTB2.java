package GiaiPT;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PTB2{
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, delta;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a = input.nextInt();
        System.out.println("Nhap b= ");
        b = input.nextInt();
        System.out.println("Nhap c= ");
        c = input.nextInt();
        delta = (b*b - (4*a*c))/(2*a);
        if (delta<0) {
            System.out.println("PT vo nghiem");
        } else if(delta==0) {
            x1 = x2 = (-b/(2*a));
            System.out.println("PT co nghiem kep x1 = x2= " + x1);
        }else {
            x1 = (float) ((-b + sqrt(delta))/(2*a));
            x2 = (float) ((-b - sqrt(delta))/(2*a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "\tx2 = " + x2);
        }         
    } 
}
