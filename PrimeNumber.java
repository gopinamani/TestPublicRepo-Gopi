import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = number >= 2;
        for (int divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        System.out.println(number + (isPrime ? " is prime." : " is not prime."));
        scanner.close();
    }
}
