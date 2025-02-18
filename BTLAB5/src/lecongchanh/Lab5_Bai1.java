package lecongchanh;



import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_Bai1 {
    public static void main(String[] main)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> ls = new ArrayList<>();
        while(true)
        {
            double x = scanner.nextDouble();
            ls.add(x);
            scanner.nextLine();
            System.out.print("Nhập thêm (Y/N)?: \n");

            if(scanner.nextLine().equals("N"))
            {
            break;
            }
        }

        System.out.print("Danh sách số thực: ");
        for(double n : ls)
        {
            System.out.printf("%.1f ", n);
        }

        double sum = 0;
        for(double n : ls)
        {
            sum += n;
        }
        System.out.printf("\nTổng các số thực: " + sum);
    }
}
