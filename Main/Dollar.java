package Main;

public class Dollar extends Coin {
    public Dollar() {
        super(DOLLAR_VALUE, "Dollar", new CuproNickel());
    }

    @Override
    protected boolean shouldHaveRidges() {
        return true;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "S_Anthony";
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
        this.backImage = "Moon_Eagle";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "ONE DOLLAR";
        return this;
    }
}
