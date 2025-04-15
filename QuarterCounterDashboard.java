import javax.swing.*;
import java.awt.*;
import java.util.*;

class QuarterCounterDashboard extends JFrame implements CoinObserver, Runnable {
    private JLabel label;
    private CoinCounts counts;

    public QuarterCounterDashboard(CoinCounts counts) {
        this.counts = counts;
        counts.addObserver(this);
    }

    public void run() {
        setTitle("Quarter Counter Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Quarters: " + counts.getQuarters());
        add(label);

        pack();
        setVisible(true);
    }

    public void update() {
        label.setText("Quarters: " + counts.getQuarters());
    }
}
