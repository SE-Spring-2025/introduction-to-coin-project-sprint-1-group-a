package Main;

public class Dime extends Coin {
    public Dime() {
        super(DIME_VALUE, "Dime", new CuproNickel());
    }

    @Override
    protected boolean shouldHaveRidges() {
        return true;
    }

    @Override
    protected Coin imprintFrontImage(Coin c) {
        this.frontImage = "F_Roosevelt";
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
        this.backImage = "Torch_Branches";
        return this;
    }

    @Override
    protected Coin imprintBackText(Coin c) {
        this.backMotto = "E PLURIBUS UNUM";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.valueDescription = "ONE DIME";
        return this;
    }
}
