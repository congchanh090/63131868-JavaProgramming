package lecongchanh;

import java.util.Scanner; 
public class Chuongtrinhchinh {

	public static void main(String[] args) {
		int namSinh ; 
		String hoten ; 
		//chuẩn bị nhập 
		Scanner banPhim = new Scanner (System.in) ;  
		
		System.out.print("ho va ten ");
		hoten = banPhim.nextLine() ; 
		
		System.out.print("nam sinh");
		namSinh = banPhim.nextInt() ;
		
		int tuoi = 2024 - namSinh + 1 ; 
		System.out.printf("Tuoi: %d",tuoi);
		
		
	}

}
