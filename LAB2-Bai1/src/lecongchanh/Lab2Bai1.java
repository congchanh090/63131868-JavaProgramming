package lecongchanh;
import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        //nhap du lieu
	        
	        System.out.print("nhap a: ");
	        double a = scanner.nextDouble();
	        System.out.print("nhap b : ");
	        double b = scanner.nextDouble();
	        
	        if(a == 0){
	        	if(b == 0){
	        	System.out.print("vô số nghiệm") ; 
	        	}
	        	else{
	        	System.out.printf("vô nghiệm ") ; 
	        	}
	        }
	        	else{
	             double  x = -b/a;
		        System.out.printf("%.2f" , x) ; 

	        	}

	}

}
