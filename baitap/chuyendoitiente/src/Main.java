import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền usd: ");
        usd = scanner.nextDouble();
        double rate = usd * vnd;
        System.out.print("Giá trị quu đổi sang vnđ là: "+ rate);
    }
}
