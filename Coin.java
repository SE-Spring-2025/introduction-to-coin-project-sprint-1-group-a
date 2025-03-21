public class Coin
{
    private double value;
    private String commonName;
    private String frontMotto;
    private int manufactureYear;
    private String frontImage;
    private String backImage;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;

    public Coin()
    {
        value = 0.0;
        commonName = "";
        frontMotto = "";
        manufactureYear = 0;
        frontImage = "";
        backImage = "";
        backMotto = "";
        frontLabel = "";
        backLabel = "";
        valueDescription = "";
        ridgedEdge = false;
        metallurgy = "";
    }

    public Coin(double value)
    {
        this.value = value;
        commonName = "";
        frontMotto = "";
        manufactureYear = 0;
        frontImage = "";
        backImage = "";
        backMotto = "";
        frontLabel = "";
        backLabel = "";
        valueDescription = "";
        ridgedEdge = false;
        metallurgy = "";
    }

    public Coin(double value, int year)
    {
        this.value = value;
        commonName = "";
        frontMotto = "";
        manufactureYear = year;
        frontImage = "";
        backImage = "";
        backMotto = "";
        frontLabel = "";
        backLabel = "";
        valueDescription = "";
        ridgedEdge = false;
        metallurgy = "";
    }

    public String toString()
    {
        String str = ("Coin Information:\nValue: " + value + "\nCommon Name: "    
            + commonName + "\nFront Motto: " + frontMotto + "\nManufacture Year: "
            + manufactureYear + "\nFront Image: " + frontImage + "\nBack Image: " 
            + backImage + "\nBack Motto: " + backMotto + "\nFront Label: " 
            + frontLabel + "\nBack Label: " + backLabel + "\nValue Description: " 
            + valueDescription + "\nRidged Edge: " + ridgedEdge + "\nMetallurgy: " + metallurgy);
        return str;
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
    
    public boolean isRidgedEdge() 
    {
        return ridgedEdge;
    }
    
    public String getMetallurgy() 
    {
        return metallurgy;
    }
}