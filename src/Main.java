public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 350.50;
        double salesTax = 0;
        final double SALES_TAX_RATE = 0.05;

        salesTax = purchasePrice * SALES_TAX_RATE;

        System.out.println("the sales tax on a purchase of" + purchasePrice + " is " + salesTax + ".");
    }
}