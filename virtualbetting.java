//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VirtualBettingSystemApplication {
    public VirtualBettingSystemApplication() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Virtual Betting System");
        frame.setDefaultCloseOperation(3);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private static void placeComponents(final JPanel panel) {
        panel.setLayout((LayoutManager)null);
        JLabel horseLabel = new JLabel("Select Horse:");
        horseLabel.setBounds(10, 20, 120, 25);
        panel.add(horseLabel);
        String[] horseOptions = new String[]{"Horse 1", "Horse 2", "Horse 3"};
        final JComboBox<String> horseComboBox = new JComboBox(horseOptions);
        horseComboBox.setBounds(140, 20, 200, 25);
        panel.add(horseComboBox);
        JLabel betLabel = new JLabel("Bet Amount:");
        betLabel.setBounds(10, 50, 120, 25);
        panel.add(betLabel);
        final JTextField betTextField = new JTextField();
        betTextField.setBounds(140, 50, 200, 25);
        panel.add(betTextField);
        JButton betButton = new JButton("Place Bet");
        betButton.setBounds(140, 80, 120, 25);
        panel.add(betButton);
        betButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedHorse = (String)horseComboBox.getSelectedItem();
                String betAmount = betTextField.getText();
                if (!betAmount.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Bet placed successfully on " + selectedHorse + " for $" + betAmount, "Bet Placed", 1);
                } else {
                    JOptionPane.showMessageDialog(panel, "Please enter a bet amount.", "Error", 0);
                }

            }
        });
    }
}
