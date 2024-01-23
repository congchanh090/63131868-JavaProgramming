package lecongchanh;
import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài hcn : ");
		double chieudai = scanner.nextDouble();
		System.out.print("Chiều rộng hcn :  ");
		double chieurong = scanner.nextDouble();
        
		double chuvi = (chieudai  + chieurong )*2 ; 
		double dientich = chieudai * chieurong ; 
		double  canhnhonhat = Math.min(chieudai, chieurong) ; 
		
		System.out.printf("Chu vi hcn : %.f , Dien tich hcn :  %.2f , Canh nho nhat %.2f " , chuvi , dientich , canhnhonhat) ;
		
		

	}

}