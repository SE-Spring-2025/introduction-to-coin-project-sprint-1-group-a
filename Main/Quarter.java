package Main;

public class Quarter extends Coin {
    public Quarter() {
        super(QUARTER_VALUE, "Quarter", new CuproNickel());
        coinCounts.incrementQuarters();
    }

    @Override
    protected boolean shouldHaveRidges() {
        return true;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "G_Washington";
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
        this.backImage = "Eagle";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "QUARTER DOLLAR";
        return this;
    }
}
