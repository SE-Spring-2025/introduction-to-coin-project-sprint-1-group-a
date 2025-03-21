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
        return null;
    }




}