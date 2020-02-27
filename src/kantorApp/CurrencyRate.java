package kantorApp;

public class CurrencyRate {
    private final String currency;
    private final String code;
    private final double mid;

    public CurrencyRate(String currency, String code, double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public double getMid() {
        return mid;
    }

    @Override
    public String toString() {
        return "" + currency + " " + code + " " + mid;
    }
}
