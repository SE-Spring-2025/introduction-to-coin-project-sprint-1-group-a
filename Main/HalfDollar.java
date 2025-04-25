package Main;

public class HalfDollar extends Coin {
    public HalfDollar() {
        super(HALFDOLLAR_VALUE, "HalfDollar", new CuproNickel());
    }

    @Override
    protected boolean shouldHaveRidges() {
        return true;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "J_Kennedy";
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
        this.backImage = "Presidential_Seal";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "HALF DOLLAR";
        return this;
    }
}
