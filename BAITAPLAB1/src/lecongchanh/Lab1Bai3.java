/**
 * 
 */
package lecongchanh;

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai3 {

	
	public static void main(String[] args) {
		Scanner scanner  =  new Scanner (System.in) ; 
		//nhap 
		System.out.print("nhâp vào cạnh của khối lập phương : ");
		double canh = scanner.nextDouble();
		
		double dientich   = canh * canh * canh ; 
		System.out.printf("dien tich : %.2f" ,  dientich ); 

	}

}
