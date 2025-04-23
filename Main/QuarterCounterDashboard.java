package Main;

import javax.swing.*;
import java.awt.*;

public class QuarterCounterDashboard extends JFrame implements CoinObserver {

    private final JLabel quarterLabel;
    private final CoinCounts counts;

    public QuarterCounterDashboard(CoinCounts counts) {
        super("Quarter Counter Dashboard");
        this.counts = counts;

        quarterLabel = new JLabel();
        quarterLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        quarterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        update();

        add(quarterLabel);
        setSize(300, 100);
        setLocation(550, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        counts.addObserver(this);
    }

    @Override
    public void update() {
        quarterLabel.setText("Quarters: " + counts.getQuarters());
    }
}
