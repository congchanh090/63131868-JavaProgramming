package lecongchanh;


import java.util.*;

public class Lab3_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử mảng: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.printf("a[%d] = ", i);
			a[i] = scanner.nextInt();
		}
		System.out.print("Mảng vừa nhập: ");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.print("\nMảng sau khi sắp xếp: ");
		Arrays.sort(a);
		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		
		int min = a[0];
		for(int i = 0; i < n; i++)
		{	
			min = Math.min(min, a[i]);
		}	
		System.out.print("\nPhần tử nhỏ nhất của mảng: " + min);
		
		int count = 0;
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] % 3 == 0)
			{
				sum += a[i];
				count++;
			}
		}
		System.out.printf("\nTrung bình cộng các phần tử chia hết cho 3: %.2f", (float)sum/count);
	}

}
