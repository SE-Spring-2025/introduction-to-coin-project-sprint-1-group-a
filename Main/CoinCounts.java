package Main;

import java.util.ArrayList;
import java.util.List;

public class CoinCounts {

    private int totalCoins = 0;
    private int quarters = 0;
    private final List<CoinObserver> observers = new ArrayList<>();

    public void addObserver(CoinObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CoinObserver observer) {
        observers.remove(observer);
    }

    public void incrementTotal() {
        totalCoins++;
        notifyObservers();
    }

    public void incrementQuarters() {
        quarters++;
        notifyObservers();
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public int getQuarters() {
        return quarters;
    }

    private void notifyObservers() {
        for (CoinObserver o : observers) {
            o.update();
        }
    }
    public void reset() {
        totalCoins = 0;
        quarters = 0;
    }
    
}