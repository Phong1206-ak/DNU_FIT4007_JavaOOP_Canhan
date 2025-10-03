public class b7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhập số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        int nearLastDigit = Math.abs((n / 10) % 10);

        System.out.println("Chữ số gần cuối của " + n + " là: " + nearLastDigit);
    }
}
