package Main;

import javax.swing.*;
import java.awt.*;

public class TotalCoinsDashboard extends JFrame implements CoinObserver {

    private final JLabel totalLabel;
    private final CoinCounts counts;

    public TotalCoinsDashboard(CoinCounts counts) {
        super("Total Coins Dashboard");
        this.counts = counts;

        totalLabel = new JLabel();
        totalLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        update();

        add(totalLabel);
        setSize(300, 100);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        counts.addObserver(this);
    }

    @Override
    public void update() {
        totalLabel.setText("Total Coins: " + counts.getTotalCoins());
    }
}