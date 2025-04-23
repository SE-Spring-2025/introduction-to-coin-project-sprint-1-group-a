package Main;

import java.text.DecimalFormat;

public abstract class Coin {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;
    public static final double HALFDOLLAR_VALUE = 0.50;
    public static final double DOLLAR_VALUE = 1.00;

    protected double value;
    protected String commonName;
    protected String frontMotto;
    protected int manufactureYear;
    protected String frontImage;
    protected String backImage;
    protected String backMotto;
    protected String frontLabel;
    protected String backLabel;
    protected String valueDescription;
    protected boolean ridgedEdge;
    protected String metallurgy;

    protected Metallurgy smelter;
    protected static CoinCounts coinCounts = new CoinCounts();

    public Coin(double value, String commonName, String frontMotto, int manufactureYear,
                String frontImage, String backImage, String backMotto,
                String frontLabel, String backLabel, String valueDescription,
                boolean ridgedEdge, Metallurgy smelter) {

        this.value = value;
        this.commonName = commonName;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.smelter = smelter;
        smelt();

        coinCounts.incrementTotal(); // Always increment total coins
    }

    protected boolean cmpDoubles(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }

    public String smelt() {
        this.metallurgy = smelter.smelt();
        return metallurgy;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);

        return "[" + commonName
            + "," + formattedValue
            + "," + manufactureYear
            + ",'" + frontMotto
            + "','" + backMotto
            + "','" + frontImage
            + "','" + backImage
            + "','" + frontLabel
            + "','" + backLabel
            + "','" + valueDescription
            + "'," + (ridgedEdge ? "ridges" : "smooth")
            + ",'" + metallurgy + "']";
    }

    // Getters
    public double getValue() { return value; }
    public String getCommonName() { return commonName; }
    public String getFrontMotto() { return frontMotto; }
    public int getManufactureYear() { return manufactureYear; }
    public String getFrontImage() { return frontImage; }
    public String getBackImage() { return backImage; }
    public String getBackMotto() { return backMotto; }
    public String getFrontLabel() { return frontLabel; }
    public String getBackLabel() { return backLabel; }
    public String getValueDescription() { return valueDescription; }
    public boolean getRidgedEdge() { return ridgedEdge; }
    public String getMetallurgy() { return metallurgy; }

    public static CoinCounts getCoinCounts() {
        return coinCounts;
    }
}
