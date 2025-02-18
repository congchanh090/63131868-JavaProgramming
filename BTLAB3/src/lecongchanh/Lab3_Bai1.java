package lecongchanh;


import java.util.Scanner;

public class Lab3_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên: ");
		int n = scanner.nextInt();
		boolean ok = true;
		if(n < 2)
		{
			return;
		}
		else {
			for(int i = 2; i < n - 1; i++)
			{
				if(n % i == 0)
				{
					ok = false;
					break;
				}
			}
			if(ok == false)
			{
				System.out.printf("%d không phải là số nguyên tố", n);
			}
			else {
				System.out.printf("%d là số nguyên tố", n);
			}
		}
	}

}
