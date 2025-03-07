import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTaxCalculation {
    public static void main(String[] args) {
        /* Defining the net price of one product using BigDecimal */
        BigDecimal netPrice = new BigDecimal("9.99");

        /* Defining the VAT rate as 23% using BigDecimal */
        BigDecimal vatRate = new BigDecimal("0.23");

        /* Calculating the gross price: net price * (1 + VAT rate) */
        BigDecimal grossPrice = netPrice.multiply(BigDecimal.ONE.add(vatRate))
                .setScale(2, RoundingMode.HALF_UP); // Round to 2 decimal places

        /* Calculating the total gross price for 10,000 units */
        BigDecimal totalGross = grossPrice.multiply(new BigDecimal("10000"));

        /* Calculating the total net price after removing VAT */
        BigDecimal totalNet = totalGross.divide(BigDecimal.ONE.add(vatRate), 2, RoundingMode.HALF_UP);

        /* Printing the results */
        System.out.println("Gross price of one item: " + grossPrice);
        System.out.println("Total gross value for 10,000 items: " + totalGross);
        System.out.println("Total net value after excluding VAT: " + totalNet);
    }
}
