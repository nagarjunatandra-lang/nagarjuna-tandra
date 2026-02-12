public class TaxBracket {
    private double lowerBound;
    private double upperBound;
    private double taxRate;

    public TaxBracket(double lowerBound, double upperBound, double taxRate) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.taxRate = taxRate;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double getTaxRate() {
        return taxRate;
    }
}