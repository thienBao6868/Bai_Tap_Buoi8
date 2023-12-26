import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		// khai bao
		int n, sum = 0;
		System.out.println(" vui lòng nhập một số nguyên :  ");
		n = scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(" Tổng các số chẵn trong khoảng từ 0 => n là : " + sum);
	}

}
