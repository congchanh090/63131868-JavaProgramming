package lecongchanh;
import java.util.Scanner;

public class Lab1Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap du lieu
        
        System.out.print("nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap a : ");
        double a = scanner.nextDouble();
        System.out.print("nhap c : ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double candelta = Math.sqrt(delta);
        System.out.printf("%.2f", candelta );

    }

}