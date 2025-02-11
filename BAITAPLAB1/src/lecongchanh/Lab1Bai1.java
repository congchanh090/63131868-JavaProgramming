package lecongchanh;

import java.util.Scanner;

public class Lab1Bai1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
        System.out.printf("Họ và tên : %s , Điểm tb :  %f", hoTen, diemTB);
	}

}
