/**
 * Main coins code.
 * 
 * @author Eva Anderson
 * @author
 * @author
 * @author
 * @version 1.0
 */
public class Coin {
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
    String metallurgy;

    /**
     * Default constructor.
     */
    public Coin() {

    }

    /**
     * Constructor with value.
     * 
     * @param value
     */
    public Coin(double value) {
        this.value = value;
    }

    /**
     * Constructor with value and year.
     * 
     * @param value
     * @param year
     */
    public Coin(double value, int year) {
        this.value = value;
        this.manufactureYear = year;
    }

    /**
     * To string method.
     * 
     * @return String
     */
    public String toString() {
        return "Value: " + value + "\nCommon Name: " + commonName + "\nFront Motto: " + frontMotto
                + "\nManufacture Year: " + manufactureYear + "\nFront Image: " + frontImage + "\nBack Image: "
                + backImage + "\nBack Motto: " + backMotto + "\nFront Label: " + frontLabel + "\nBack Label: "
                + backLabel + "\nValue Description: " + valueDescription + "\nRidged Edge: " + ridgedEdge
                + "\nMetallurgy: " + metallurgy;
    }

    /**
     * Get value.
     * 
     * @return double value.
     */
    public double getValue() {
        return value;
    }

    /**
     * Get common name.
     * 
     * @return String common name.
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Get front motto.
     * 
     * @return String front motto.
     */
    public String getFrontMotto() {
        return frontMotto;
    }

    /**
     * Get manufacture year.
     * 
     * @return int manufacture year.
     */
    public int getManufactureYear() {
        return manufactureYear;
    }

    /**
     * Get front image.
     * 
     * @return String front image.
     */
    public String getFrontImage() {
        return frontImage;
    }

    /**
     * Get back image.
     * 
     * @return String back image.
     */
    public String getBackImage() {
        return backImage;
    }

    /**
     * Get back motto.
     * 
     * @return String back motto.
     */
    public String getBackMotto() {
        return backMotto;
    }

    /**
     * Get front label.
     * 
     * @return String front label.
     */
    public String getFrontLabel() {
        return frontLabel;
    }

    /**
     * Get back label.
     * 
     * @return String back label.
     */
    public String getBackLabel() {
        return backLabel;
    }

    /**
     * Get value description.
     * 
     * @return String value description.
     */
    public String getValueDescription() {
        return valueDescription;
    }

    /**
     * Get ridged edge.
     * 
     * @return boolean ridged edge.
     */
    public boolean getRidgedEdge() {
        return ridgedEdge;
    }

    /**
     * Get metallurgey.
     * 
     * @return String metallurgey.
     */
    public String getMetallurgy() {
        return metallurgy;
    }

    /**
     * Set value.
     * 
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Set common name.
     * 
     * @param commonName
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * Set front motto.
     * 
     * @param frontMotto
     */
    public void setFrontMotto(String frontMotto) {
        this.frontMotto = frontMotto;
    }

    /**
     * Set manufacture year.
     * 
     * @param manufactureYear
     */
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    /**
     * Set front image.
     * 
     * @param frontImage
     */
    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    /**
     * Set back image.
     * 
     * @param backImage
     */
    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    /**
     * Set back motto.
     * 
     * @param backMotto
     */
    public void setBackMotto(String backMotto) {
        this.backMotto = backMotto;
    }

    /**
     * Set front label.
     * 
     * @param frontLabel
     */
    public void setFrontLabel(String frontLabel) {
        this.frontLabel = frontLabel;
    }

    /**
     * Set back label.
     * 
     * @param backLabel
     */
    public void setBackLabel(String backLabel) {
        this.backLabel = backLabel;
    }

    /**
     * Set value description.
     * 
     * @param valueDescription
     */
    public void setValueDescription(String valueDescription) {
        this.valueDescription = valueDescription;
    }

    /**
     * Set ridged edge.
     * 
     * @param ridgedEdge
     */
    public void setRidgedEdge(boolean ridgedEdge) {
        this.ridgedEdge = ridgedEdge;
    }

    /**
     * Set metallurgy.
     * 
     * @param metallurgy
     */
    public void setMetallurgy(String metallurgy) {
        this.metallurgy = metallurgy;
    }

}