import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của sinh viên (tính đến năm 2023): ");
        int age = sc.nextInt();

        int birthYear = 2023 - age;
        System.out.println("Năm sinh của sinh viên là: " + birthYear);
    }
}
