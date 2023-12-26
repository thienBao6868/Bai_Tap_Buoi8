import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		// khai bao
		int a;
		// nhập vào một số nguyên từ 1=>10
		do {
			System.out.println(" vui lòng nhập số nguyên từ 1 đến 10 ");
			a = scanner.nextInt();
		} while (a < 1 || a > 10);
		switch (a) {
		case 1:
			System.out.println(" Một ");
			break;
		case 2:
			System.out.println(" Hai  ");
			break;
		case 3:
			System.out.println(" Ba  ");
			break;
		case 4:
			System.out.println(" Bốn  ");
			break;
		case 5:
			System.out.println(" Năm  ");
			break;
		case 6:
			System.out.println(" Sáu  ");
			break;
		case 7:
			System.out.println(" Bảy  ");
			break;
		case 8:
			System.out.println(" Tám  ");
			break;
		case 9:
			System.out.println(" Chín  ");
			break;
		case 10:
			System.out.println(" Mười  ");
			break;

		default:
			break;
		}
	}

}
