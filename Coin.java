import java.util.Calendar;
import java.text.DecimalFormat;

public abstract class Coin 
{
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;
    public static final double HALFDOLLAR_VALUE = 0.50;
    public static final double DOLLAR_VALUE = 1.00;

    double value;
    String commonName;
    String frontMotto;
    int manufactureYear;
    String frontImage;
    String backImage;
    String backMotto;
    String frontLabel;
    String backLabel;
    String valueDescription;
    boolean ridgedEdge;
    protected String metallurgy;
    protected Metallurgy smelter;

    /**
     * Default constructor.
     */
    public Coin() 
    {
	    this(0);
    }

    public Coin(double value) 
    {
        this(value, (Calendar.getInstance()).get(Calendar.YEAR));
    }

    public Coin(double value, int year, String frontMotto, int manufactureYear, 
    String frontImage, String backImage, String backMotto, String frontLabel, 
    String backLabel, String valueDescription, boolean ridgedEdge, String metallurgy, 
    Metallurgy smelter) {

        if (cmpDoubles(value, PENNY_VALUE)) {
            commonName = "Penny";
            this.year = year;
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else if (cmpDoubles(value, NICKEL_VALUE)) {
            commonName = "Nickel";
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else if (cmpDoubles(value, DIME_VALUE)) {
            commonName = "Dime";
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else if (cmpDoubles(value, QUARTER_VALUE)) {
            commonName = "Quarter";
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else if (cmpDoubles(value, HALFDOLLAR_VALUE)) {
            commonName = "HalfDollar";
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else if (cmpDoubles(value, DOLLAR_VALUE)) {
            commonName = "Dollar";
            this.frontMotto = frontMotto;
            this.manufactureYear = manufactureYear;
            this.frontImage = frontImage;
            this.backImage = backImage;
            this.backMotto = backMotto;
            this.frontLabel = frontLabel;
            this.backLabel = backlabel;
            this.valueDescription = valueDescription;
            this.ridgedEdge = ridgedEdge;
            this.metallurgy = metallurgy;
            this.smelter = smelter;
        }
        else {
	value = 0;
        this.manufactureYear = year;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backlabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.metallurgy = metallurgy;
        this.smelter = smelter;
	}
	    coinCounts.incrementTotal();
        }

        private boolean cmpDoubles(double a, double b) 
        {
            return Math.abs(a-b) < 0.00001;
        }

        public String toString() 
        {
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
                + ",'" + metallurgy
                + "']";
        }

    public double getValue() 
    {
        return value;
    }

    public String getCommonName() 
    {
        return commonName;
    }

    public String getFrontMotto() 
    {
        return frontMotto;
    }

    public int getManufactureYear() 
    {
        return manufactureYear;
    }

    public String getFrontImage() 
    {
        return frontImage;
    }

    public String getBackImage() 
    {
        return backImage;
    }

    public String getBackMotto() 
    {
        return backMotto;
    }

    public String getFrontLabel() 
    {
        return frontLabel;
    }

    public String getBackLabel() 
    {
        return backLabel;
    }

    public String getValueDescription() 
    {
        return valueDescription;
    }

    public boolean getRidgedEdge() 
    {
        return ridgedEdge;
    }

    public String getMetallurgy() 
    {
        return metallurgy;
    }

    public void setValue(double value) 
    {
        this.value = value;
    }

    public void setCommonName(String commonName) 
    {
        this.commonName = commonName;
    }

    public void setFrontMotto(String frontMotto) 
    {
        this.frontMotto = frontMotto;
    }

    public void setManufactureYear(int manufactureYear) 
    {
        this.manufactureYear = manufactureYear;
    }

    public void setFrontImage(String frontImage) 
    {
        this.frontImage = frontImage;
    }

    public void setBackImage(String backImage) 
    {
        this.backImage = backImage;
    }

    public void setBackMotto(String backMotto) 
    {
        this.backMotto = backMotto;
    }

    public void setFrontLabel(String frontLabel) 
    {
        this.frontLabel = frontLabel;
    }

    public void setBackLabel(String backLabel) 
    {
        this.backLabel = backLabel;
    }

    public void setValueDescription(String valueDescription) 
    {
        this.valueDescription = valueDescription;
    }

    public void setRidgedEdge(boolean ridgedEdge) 
    {
        this.ridgedEdge = ridgedEdge;
    }

    public void setMetallurgy(String metallurgy) 
    {
        this.metallurgy = metallurgy;
    }

    public String smelt()
    {
        smelter.smelt();
    }

}
