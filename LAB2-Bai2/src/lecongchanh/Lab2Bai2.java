package lecongchanh;
import java.util.Scanner;

 //giải pt bậc 2  
public class Lab2Bai2 {

	public static void main(String[] args) {
 
		  Scanner scanner = new Scanner(System.in);
	        //nhap du lieu
	        
	        System.out.print("nhap a: ");
	        double a = scanner.nextDouble();
	        System.out.print("nhap b : ");
	        double b = scanner.nextDouble();
	        System.out.print("nhap c : ");
	        double c = scanner.nextDouble();
	        
	  
	        if(a == 0){
	        	if(b == 0){
	        	System.out.print("vô số nghiệm") ; 
	        	}
	        	else{
	        	System.out.printf("vô nghiệm ") ; 
	        	}
	        }
	        
	        
	        else {
	            double delta = Math.pow(b, 2) - 4 * a * c;
	            //TH1
	            if(delta < 0 ) {
	            	System.out.print("vô nghiệm") ;
	            	
	            }
	            //TH2 
	            if(delta == 0 ) {
	            	 double x = -b/(2*a) ; 
		             System.out.printf("%.2f  " , x);

	            }
	            
	            //TH3
	            if(delta > 0 ) {
	                double candelta = Math.sqrt(delta); 
	                
	            	double X1 = (-b+ candelta )/(2*a) ; 
	            	double X2 = (-b- candelta )/(2*a) ;
	             System.out.printf("%.2f  %.2f" , X1 , X2);
	            }
	        }


	}

}
