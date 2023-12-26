import java.util.Scanner;

public class BT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		// Nhap
		int a;
		System.out.println("Vui long nhap so nguyen duong ");
		a = scanner.nextInt();
		// xu ly
		if (a >= 0) {
			// xuất
			System.out.println(" Đây là số nguyên dương");
		} else {
			// xuất
			System.out.println(" Đây là số nguyên âm ");
		}
		if (a % 2 == 0) {
			// xuất
			System.out.println(" Đây là số chẵn ");
		} else {
			// xuất
			System.out.println(" Đây là số lẽ  ");
		}
		// Kiểm tra số nhập là số nguyên tố hay là không số nguyên 
		int dem = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			System.out.println(" Đây là số nguyên tố");
		}else {
			System.out.println(" Đây không là số nguyên tố");
		}
		

	}

}
