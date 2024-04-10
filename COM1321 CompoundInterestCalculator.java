import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / n), n * years);
        double compoundInterest = amount - principal;

        System.out.println("Compound interest after " + years + " years: " + compoundInterest);
        System.out.println("Total amount after " + years + " years: " + amount);

        scanner.close();
    }
}
