package Main;

import java.text.DecimalFormat;
import java.util.Calendar;

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

    protected boolean flipped = false;
    protected boolean buffed = false;

    protected Metallurgy smelter;
    protected static CoinCounts coinCounts = new CoinCounts();

    public Coin(double value, String commonName, Metallurgy smelter) {
        this.value = value;
        this.commonName = commonName;
        this.smelter = smelter;
        this.manufactureYear = Calendar.getInstance().get(Calendar.YEAR);
        coinCounts.incrementTotal();
    }

    public Coin manufacture(Coin c) {
        c = smelt(c);
        c = ridge(c);
        c = imprintFrontImage(c);
        c = imprintFrontText(c);
        c = flip(c);
        c = imprintBackImage(c);
        c = imprintBackText(c);
        c = buff(c);
        return c;
    }

    protected Coin smelt(Coin c) {
        this.metallurgy = smelter.smelt();
        return this;
    }

    protected Coin ridge(Coin c) {
        this.ridgedEdge = shouldHaveRidges();
        return this;
    }

    protected Coin flip(Coin c) {
        this.flipped = true;
        return this;
    }

    protected Coin buff(Coin c) {
        this.buffed = true;
        return this;
    }

    protected abstract boolean shouldHaveRidges();
    protected abstract Coin imprintFrontImage(Coin c);
    protected abstract Coin imprintFrontText(Coin c);
    protected abstract Coin imprintBackImage(Coin c);
    protected abstract Coin imprintBackText(Coin c);

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
    public boolean wasFlipped() { return flipped; }
    public boolean wasBuffed() { return buffed; }

    public static CoinCounts getCoinCounts() {
        return coinCounts;
    }
}
