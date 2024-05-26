# Virtual Betting System Application

## Overview

The Virtual Betting System Application is a simple Java Swing application that allows users to place virtual bets on horses. Users can select a horse from a dropdown menu, enter a bet amount, and then place the bet. The application will display a confirmation message if the bet is placed successfully or an error message if the bet amount is not provided.

## Features

- Select a horse from a dropdown menu
- Enter a bet amount
- Place a bet and receive a confirmation or error message

## Code Description

### Main Class: `VirtualBettingSystemApplication`

This class sets up the main application window and handles the user interface components and actions.

#### Constructor

The constructor does not contain any code as all the initialization is done in the `main` method and `placeComponents` method.

```java
public VirtualBettingSystemApplication() {
}
```

#### Main Method

The `main` method sets up the main application window (`JFrame`) and calls `placeComponents` to initialize the UI components.

```java
public static void main(String[] args) {
    JFrame frame = new JFrame("Virtual Betting System");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    frame.add(panel);
    placeComponents(panel);
    frame.setSize(400, 200);
    frame.setVisible(true);
}
```

#### UI Initialization: `placeComponents`

The `placeComponents` method sets up the UI components and their layout within the panel. It also defines the action listener for the "Place Bet" button.

```java
private static void placeComponents(final JPanel panel) {
    panel.setLayout(null);  // Using absolute positioning for simplicity

    // Label for horse selection
    JLabel horseLabel = new JLabel("Select Horse:");
    horseLabel.setBounds(10, 20, 120, 25);
    panel.add(horseLabel);

    // ComboBox for horse selection
    String[] horseOptions = {"Horse 1", "Horse 2", "Horse 3"};
    final JComboBox<String> horseComboBox = new JComboBox<>(horseOptions);
    horseComboBox.setBounds(140, 20, 200, 25);
    panel.add(horseComboBox);

    // Label for bet amount
    JLabel betLabel = new JLabel("Bet Amount:");
    betLabel.setBounds(10, 50, 120, 25);
    panel.add(betLabel);

    // TextField for bet amount
    final JTextField betTextField = new JTextField();
    betTextField.setBounds(140, 50, 200, 25);
    panel.add(betTextField);

    // Button to place the bet
    JButton betButton = new JButton("Place Bet");
    betButton.setBounds(140, 80, 120, 25);
    panel.add(betButton);

    // Action listener for the bet button
    betButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String selectedHorse = (String)horseComboBox.getSelectedItem();
            String betAmount = betTextField.getText();

            if (!betAmount.isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Bet placed successfully on " + selectedHorse + " for $" + betAmount, "Bet Placed", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panel, "Please enter a bet amount.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}
```

## How to Run

1. Ensure you have Java installed on your machine.
2. Copy the code into a file named `VirtualBettingSystemApplication.java`.
3. Compile the program using the command:
   ```bash
   javac VirtualBettingSystemApplication.java
   ```
4. Run the program using the command:
   ```bash
   java VirtualBettingSystemApplication
   ```

## User Interface

When you run the program, a window will appear with the following components:

- A dropdown menu to select a horse
- A text field to enter the bet amount
- A button to place the bet

## Example Usage

1. Select a horse from the dropdown menu.
2. Enter a bet amount in the text field.
3. Click the "Place Bet" button.
4. If the bet amount is entered, a confirmation dialog will appear indicating the bet has been placed. If the bet amount is not entered, an error dialog will appear requesting the user to enter a bet amount.

## License

This code is provided for educational purposes and is free to use and modify.

---

