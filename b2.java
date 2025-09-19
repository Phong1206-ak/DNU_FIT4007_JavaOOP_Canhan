import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.println("Chu vi hình tròn = " + chuVi);
        System.out.println("Diện tích hình tròn = " + dienTich);

        scanner.close();
    }
}
