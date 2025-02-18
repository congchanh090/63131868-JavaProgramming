package lecongchanh;



import java.util.Scanner;

public class Lab4_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm 1: ");
		String tensp1 = scanner.nextLine();
		System.out.print("Nhập đơn giá sản phẩm 1: ");
		double dongia1 = scanner.nextDouble();
		System.out.print("Nhập tiền giảm giá sản phẩm 1: ");
		double giamgia1 = scanner.nextDouble();
		SanPham sp1 = new SanPham(tensp1, dongia1, giamgia1);
		scanner.nextLine();
		System.out.print("Nhập tên sản phẩm 2: ");
		String tensp2 = scanner.nextLine();
		System.out.print("Nhập đơn giá sản phẩm 2: ");
		double dongia2 = scanner.nextDouble();	
		SanPham sp2 = new SanPham(tensp2, dongia2);	
		System.out.println("Thông tin sản phẩm 1");
		sp1.output();
		System.out.println("Thông tin sản phẩm 2");
		sp2.output();	
	}

}
