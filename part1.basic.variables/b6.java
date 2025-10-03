public class b6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);

        System.out.println("Chữ số cuối cùng của " + n + " là: " + lastDigit);
    }
}
