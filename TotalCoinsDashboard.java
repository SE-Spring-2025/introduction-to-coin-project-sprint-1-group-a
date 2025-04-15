import javax.swing.*;
import java.awt.*;
import java.util.*;

class TotalCoinsDashboard extends JFrame implements CoinObserver, Runnable {
    private JLabel label;
    private CoinCounts counts;

    public TotalCoinsDashboard(CoinCounts counts) {
        this.counts = counts;
        counts.addObserver(this);
    }

    public void run() {
        setTitle("Total Coins Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Total Coins: " + counts.getTotalCoins());
        add(label);

        pack();
        setVisible(true);
    }

    public void update() {
        label.setText("Total Coins: " + counts.getTotalCoins());
    }
}
