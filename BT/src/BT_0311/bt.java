package BT_0311;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bt {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = scanner.nextLine();
        try {
            
            FileWriter fw = new FileWriter("D:\\test.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ghi thành công");
            FileReader fw = new FileReader("D:\\test.txt");
    int i;
        System.out.println("đọc file txt");
        while ((i = fw.read()) != -1) {
            System.out.print((char) i);
        }
        fw.close();
    
}
}
