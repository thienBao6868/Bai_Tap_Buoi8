import java.util.Scanner;

public class BT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int l;
		double trungBinh = 0,sum =0;
		System.out.println("Vui long Nhap chieu dai cua mang");
		l = scanner.nextInt();
		double [] mangSo = new double [l];
		
		for (int i = 0; i < l ; i++) {
			System.out.println("Nhap gia tri thu " + i + " : " );
			mangSo[i]= scanner.nextInt();
			sum += mangSo[i];
		}
		System.out.println(sum);
		trungBinh = sum / l;
		
		System.out.println(" Giá trị trung bình của mãng là : " + trungBinh );
	}

}
