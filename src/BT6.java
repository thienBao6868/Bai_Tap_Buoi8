import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a;
		System.out.println(" vui lòng nhập chiều dài cạnh góc vuông : ");
		a = scanner.nextDouble();
		// Tính diện tích
        double dienTich = a * a;
        System.out.println("Diện tích hình vuông là: " + dienTich);

        // Tính chu vi
        double chuVi = 4 * a;
        System.out.println("Chu vi hình vuông là: " + chuVi);
	}

}
