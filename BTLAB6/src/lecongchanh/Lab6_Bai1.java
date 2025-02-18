package lecongchanh;

import java.util.Scanner;

public class Lab6_Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.println("Tên: " + hoten.substring(hoten.lastIndexOf(" ") + 1).toUpperCase());
	}

}
