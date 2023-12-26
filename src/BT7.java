import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int l;
		
		System.out.println("Vui long Nhap chieu dai cua mang");
		l = scanner.nextInt();
		int [] mangSo = new int [l];
		
		for (int i = 0; i < l ; i++) {
			System.out.println("Nhap gia tri thu " + i + " : " );
			mangSo[i]= scanner.nextInt();
		}
		for (int i = 0; i < l ; i++) {
			System.out.print( mangSo[i] + "," );
			
		}
	}

}
