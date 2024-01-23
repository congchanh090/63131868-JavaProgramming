package lecongchanh;
import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        //nhap du lieu
	        
	        System.out.print("nhap so dien : ");
	        double sodien = scanner.nextDouble();
	        
	        double  tiendien= 0 ; 
	        
	        if(sodien < 50 ) {
	        	tiendien = sodien * 1000 ; 
	        	System.out.printf("%.2f", tiendien) ; 

	        	
	        }else {
	        	tiendien = 50 * 1000  + (sodien- 50) * 1200 ; 
	        	System.out.printf("%.2f", tiendien) ; 
	        }
	        
	}

}
