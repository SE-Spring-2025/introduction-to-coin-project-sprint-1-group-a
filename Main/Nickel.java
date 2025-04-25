package Main;

public class Nickel extends Coin {
    public Nickel() {
        super(NICKEL_VALUE, "Nickel", new CuproNickel());
    }

    @Override
    protected boolean shouldHaveRidges() {
        return false;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "T_Jefferson";
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
        this.backImage = "Jefferson_Memorial";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "FIVE CENTS";
        return this;
    }
}
