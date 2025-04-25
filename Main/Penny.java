package Main;

public class Penny extends Coin {
    public Penny() {
        super(PENNY_VALUE, "Penny", new Copper());
    }

    @Override
    protected boolean shouldHaveRidges() {
        return false;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "A_Lincoln";
        return this;
    }

    @Override
    protected Coin imprintFrontText(Coin c) {
        this.frontMotto = "IN GOD WE TRUST";
        this.frontLabel = "LIBERTY";
        return this;
    }

    @Override
    protected Coin imprintBackImage(Coin c) {
        this.backImage = "Lincoln_Memorial";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "ONE CENT";
        return this;
    }
}
