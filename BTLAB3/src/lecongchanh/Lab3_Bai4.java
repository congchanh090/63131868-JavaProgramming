package lecongchanh;


import java.util.Scanner;

public class Lab3_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();

		String[] hoten = new String[n];
		double[] diem = new double[n];

		for(int i = 0; i < n; i++)
		{
			scanner.nextLine();
			System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
			hoten[i] = scanner.nextLine();
			System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
			diem[i] = scanner.nextDouble();
		}
		System.out.println("---DANH SÁCH SINH VIÊN---");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Sinh viên thứ %d", i + 1);
			System.out.printf("\nHọ tên: %s", hoten[i]);
			System.out.printf("\nĐiểm: %.2f", diem[i]);
			System.out.printf("\nHọc lực: ");
			if(diem[i] < 5)
			{
				System.out.print("Yếu\n");
			}
			else if(diem[i] >= 5 && diem[i] < 6.5)
			{
				System.out.print("Trung bình\n");
			}
			else if(diem[i] >= 6.5 && diem[i] < 7.5)
			{
				System.out.print("Khá\n");
			}			
			else if(diem[i] >= 7.5 && diem[i] < 9)
			{
				System.out.print("Giỏi\n");
			}
			else if(diem[i] >= 9){
				System.out.print("Xuất xắc\n");
			}
		}
		System.out.println("---DANH SÁCH SINH VIÊN SAU KHI SẮP XẾP---");
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(diem[i] > diem[j])
				{
					String temphoten = hoten[i];
					hoten[i] = hoten[j];
					hoten[j] = temphoten;
					
					Double tempdiem = diem[i];
					diem[i] = diem[j];
					diem[j] = tempdiem;					
				}
			}
		}
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Sinh viên thứ %d", i + 1);
			System.out.printf("\nHọ tên: %s", hoten[i]);
			System.out.printf("\nĐiểm: %.2f", diem[i]);
			System.out.printf("\nHọc lực: ");
			if(diem[i] < 5)
			{
				System.out.print("Yếu\n");
			}
			else if(diem[i] >= 5 && diem[i] < 6.5)
			{
				System.out.print("Trung bình\n");
			}
			else if(diem[i] >= 6.5 && diem[i] < 7.5)
			{
				System.out.print("Khá\n");
			}			
			else if(diem[i] >= 7.5 && diem[i] < 9)
			{
				System.out.print("Giỏi\n");
			}
			else if(diem[i] >= 9){
				System.out.print("Xuất xắc\n");
			}
		}
	}

}
