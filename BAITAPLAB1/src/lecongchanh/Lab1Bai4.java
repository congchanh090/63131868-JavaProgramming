package lecongchanh;

import java.util.Scanner;

public class Lab1Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình không có nghiệm thực.");
        } else {
            double candelta = Math.sqrt(delta);
            System.out.printf("Căn delta: %.2f\n", candelta);
        }

    }
}
