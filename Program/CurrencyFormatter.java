import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // US Locale
        Locale us = Locale.US;
        // India Locale (no built-in Locale, so we construct one)
        Locale india = new Locale("en", "IN");
        // China Locale
        Locale china = Locale.CHINA;
        // France Locale
        Locale france = Locale.FRANCE;

        // Currency formatters
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        // Formatted outputs
        String usFormatted = usFormat.format(payment);
        String indiaFormatted = indiaFormat.format(payment);
        String chinaFormatted = chinaFormat.format(payment);
        String franceFormatted = franceFormat.format(payment);

        // Print the results
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
