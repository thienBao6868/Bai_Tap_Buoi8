import java.util.Scanner;

public class BT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner scanner = new Scanner(System.in);
		int n;
		int mangSo [];
		// nhap so phan tu mang
		System.out.println(" nhập số phần tử của mãng : ");
		n = scanner.nextInt();
		mangSo = new int[n];
		// duyet nhap gia tri phan tu cua mang
		for (int i=0; i< n; i++) {
			System.out.println("nhập giá trị phần tử thứ " + i + "của mãng là : ");
			mangSo[i] = scanner.nextInt();
		}
		// xu ly so nho nhat trong mang
		int soNhoNhat = mangSo[0];
		int soLonNhat = mangSo[0];
		for (int i=1; i < n; i++) {
			if (mangSo[i] < soNhoNhat ) {
				soNhoNhat = mangSo[i];
			}
			if (mangSo[i] > soNhoNhat ) {
				soLonNhat = mangSo[i];
			}
		}
		System.out.println(" số nhỏ nhất trong mãng là : "  + soNhoNhat );
		System.out.println(" số lớn nhất trong mãng là : "  + soLonNhat );
		
	}

}
