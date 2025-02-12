package lecongchanh;

import java.util.ArrayList;

public class CT2 {

	public static void main(String[] args) {
		
		//Khai báo danh sách sản phẩm 
		ArrayList<SanPham> dsSanPham ; 
		
		// Xin mới
		dsSanPham = new ArrayList<SanPham>() ; 
		
		// nhập 3 sản phẩm 
		SanPham sp1 = new SanPham(0,"kem" , "Giải khát" , null) ; 
		SanPham sp2 = new SanPham(1,"Cơm" , "Đồ ăn" , null) ; 
		SanPham sp3 = new SanPham(2,"Phở" , "Giải khát" , null) ; 
		
		// thêm vào arraylist
		dsSanPham.add(sp1) ; 
		dsSanPham.add(sp2) ; 
		dsSanPham.add(sp3) ; 
 
//		for(SanPham x : dsSanPham)
//			System.out.println(x.toString()); 
		
		for(int i=0 ; i<dsSanPham.size();i++) {
			SanPham sp = dsSanPham.get(i) ; 
			System.out.println(sp.toString());
		}
		
	}

}
