/**
 * Demo file for coin code.
 * 
 * @author Eva Anderson
 * @author
 * @author
 * @author
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Coin coin = new Coin(0.01, 2015);
        coin.setCommonName("Penny");
        coin.setFrontMotto("In God We Trust");
        coin.setFrontImage("penny-front.jpg");
        coin.setBackImage("penny-back.jpg");
        coin.setBackMotto("E Pluribus Unum");
        coin.setFrontLabel("Front");
        coin.setBackLabel("Back");
        coin.setValueDescription("One cent");
        coin.setRidgedEdge(false);
        coin.setMetallurgy("Copper-plated zinc");

        System.out.println(coin.toString());
    }
}