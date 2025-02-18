package lecongchanh;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện (kWh): ");
        double sodien = scanner.nextDouble();

        double tiendien;

        if (sodien <= 50) { 
            tiendien = sodien * 1000;
        } else {
            tiendien = 50 * 1000 + (sodien - 50) * 1200;
        }

        System.out.printf("Tiền điện phải trả: %.2f VND\n", tiendien);

  
    }
}
