import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int number) {
        if (number % 10 == 0) {
        return 0;
        } else {
            return sumOfDigits(number/10) + number%10;
        }
    }
}