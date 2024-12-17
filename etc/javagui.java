import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Task11GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Return Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
        panel.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel needToPayLabel = new JLabel("The customer needs to pay (Taka):");
        needToPayLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(needToPayLabel, gbc);

        JTextField needToPayText = new JTextField(20);
        needToPayText.setBackground(Color.DARK_GRAY);
        needToPayText.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(needToPayText, gbc);

        JLabel customerGaveLabel = new JLabel("Customer gave (Taka):");
        customerGaveLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(customerGaveLabel, gbc);

        JTextField customerGaveText = new JTextField(20);
        customerGaveText.setBackground(Color.DARK_GRAY);
        customerGaveText.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(customerGaveText, gbc);

        // Add input validation to only accept integers
        KeyListener integerOnlyKeyListener = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();  // Ignore this key press
                }
            }
        };
        needToPayText.addKeyListener(integerOnlyKeyListener);
        customerGaveText.addKeyListener(integerOnlyKeyListener);

        // Move focus to customerGaveText when Enter is pressed in needToPayText
        needToPayText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    customerGaveText.requestFocus();
                }
            }
        });

        JButton calculateButton = new JButton("Calculate");
        styleButton(calculateButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(calculateButton, gbc);

        JButton clearButton = new JButton("Clear");
        styleButton(clearButton);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(clearButton, gbc);

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setBackground(Color.BLACK);
        resultArea.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(new JScrollPane(resultArea), gbc);

        // Trigger calculation when Enter is pressed in customerGaveText
        customerGaveText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calculateButton.doClick();
                }
            }
        });

        // Clear fields and result area when Clear button is clicked
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                needToPayText.setText("");
                customerGaveText.setText("");
                resultArea.setText("");
                needToPayText.requestFocus();
            }
        });

        // Add KeyListener to clear fields with Delete key
        needToPayText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    clearButton.doClick();
                }
            }
        });

        customerGaveText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    clearButton.doClick();
                }
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int needToPay = Integer.parseInt(needToPayText.getText());
                int customerGave = Integer.parseInt(customerGaveText.getText());
                int diff = customerGave - needToPay;

                if (diff == 0) {
                    resultArea.setText("No returns :D");
                } else if (diff < 0) {
                    resultArea.setText("Please pay " + Math.abs(diff) + " taka more.");
                } else {
                    int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
                    int tempDiff = diff;

                    while (tempDiff > 0) {
                        if (tempDiff >= 100) {
                            tempDiff -= 100;
                            hundred++;
                        } else if (tempDiff >= 50) {
                            tempDiff -= 50;
                            fifty++;
                        } else if (tempDiff >= 20) {
                            tempDiff -= 20;
                            twenty++;
                        } else if (tempDiff >= 10) {
                            tempDiff -= 10;
                            ten++;
                        } else if (tempDiff >= 5) {
                            tempDiff -= 5;
                            five++;
                        } else if (tempDiff >= 2) {
                            tempDiff -= 2;
                            two++;
                        } else if (tempDiff >= 1) {
                            tempDiff -= 1;
                            one++;
                        } else {
                            break;
                        }
                    }

                    resultArea.setText("The returned amount is: " + diff + " taka\n"
                            + "100 taka note: " + hundred + "\n"
                            + "50 taka note: " + fifty + "\n"
                            + "20 taka note: " + twenty + "\n"
                            + "10 taka note: " + ten + "\n"
                            + "5 taka coin: " + five + "\n"
                            + "2 taka coin: " + two + "\n"
                            + "1 taka coin: " + one);
                }
            }
        });
    }

    private static void styleButton(JButton button) {
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    }
}
