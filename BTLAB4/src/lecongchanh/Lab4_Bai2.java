package lecongchanh;

public class Lab4_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		System.out.println("Nhập thông tin sản phẩm 1");
		sp1.input();
		System.out.println("Nhập thông tin sản phẩm 2");
		SanPham sp2 = new SanPham();
		sp2.input();
		System.out.println("Thông tin sản phẩm 1");
		sp1.output();
		System.out.println("Thông tin sản phẩm 2");
		sp2.output();
	}
}