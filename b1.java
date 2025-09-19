import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong;

        if (b != 0) {
            thuong = (double) a / b;
        } else {
            thuong = Double.NaN;
        }

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        if (b != 0) {
            System.out.println("Thương = " + thuong);
        } else {
            System.out.println("Không thể chia cho 0");
        }

        scanner.close();
    }
}
