import java.util.Calendar;
import java.text.DecimalFormat;

public class Coin 
{
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;
    public static final double HALFDOLLAR_VALUE = 0.50;
    public static final double DOLLAR_VALUE = 1.00;

    protected Metallurgy smelter;
    protected String metallurgy;

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

    public Coin(double value, int year) 
    {
        this.value = value;
        this.manufactureYear = year;
    }

    public Coin(double value, String commonName, String frontMotto, int year,
    String frontImage, String backImage,
    String backMotto, String frontLabel, String backLabel,
    String valueDescription, boolean ridgedEdge, Metallurgy smelter) 
    {
        this.value = value;
        this.commonName = commonName;
        this.frontMotto = frontMotto;
        this.manufactureYear = year;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;

        this.smelter = smelter;
        smelt();
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

    public void smelt() 
    {
        metallurgy = smelter.smelt();
    }
}
