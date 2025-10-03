import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tên của bạn: ");
        String ten = sc.nextLine();

        int doDai = ten.length();

        System.out.println("Độ dài tên của bạn là: " + doDai);

        sc.close();
    }
}
