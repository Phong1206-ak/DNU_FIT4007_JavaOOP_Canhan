import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            // Tính chu vi
            double chuVi = a + b + c;

            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác = " + chuVi);
            System.out.println("Diện tích tam giác = " + dienTich);
        } else {
            System.out.println("Ba cạnh vừa nhập không tạo thành một tam giác!");
        }

        scanner.close();
    }
}
