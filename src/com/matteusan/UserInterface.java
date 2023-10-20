package com.matteusan;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * @author Matthew Hernandez
 */
public final class UserInterface extends JFrame {
    private JPanel root, content, search, information, div1, price, size, houseType;
    private JPanel selectField1, formField1, formField2, selectField2;
    private JScrollPane results;
    private JComboBox blockComboBox, houseTypeComboBox;
    private JTextField sizeTextField, priceTextField;
    private JButton searchButton, clearFilterButton;
    private JLabel lotNumberDisplay, blockDisplay, priceDisplay, sizeDisplay, houseTypeDisplay, reservedIndicator, soldIndicator;
    private JButton buyButton, reserveButton;
    private JTable resultsTable;

    private final Data data = new Data(resultsTable);

    public UserInterface() {
        // Initialize components
        createUIComponents();

        // Search action
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterTable();
            }
        });

        clearFilterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blockComboBox.setSelectedIndex(0);
                sizeTextField.setText("");
                priceTextField.setText("");
                houseTypeComboBox.setSelectedIndex(0);
                filterTable();
            }
        });

        blockComboBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == KeyEvent.VK_ENTER) filterTable();
            }
        });

        sizeTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == KeyEvent.VK_ENTER) filterTable();
            }
        });

        priceTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == KeyEvent.VK_ENTER) filterTable();
            }
        });

        houseTypeComboBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyChar() == KeyEvent.VK_ENTER) filterTable();
            }
        });

        // Lot selection
        resultsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = resultsTable.getSelectedRow();
                // System.out.println(row); // For debugging
                if (row != -1) {
                    DecimalFormat formatter = new DecimalFormat("#,###.00");

                    lotNumberDisplay.setText("Lot " + resultsTable.getValueAt(row, 0).toString());
                    blockDisplay.setText("(" + resultsTable.getValueAt(row, 1).toString() + ")");
                    priceDisplay.setText("PHP" + formatter.format(resultsTable.getValueAt(row, 4)));
                    sizeDisplay.setText(resultsTable.getValueAt(row, 2).toString() + "sq/m");
                    houseTypeDisplay.setText(resultsTable.getValueAt(row, 3).toString());

                    soldIndicator.setVisible(resultsTable.getValueAt(row, 5).toString().equals("Sold"));
                    reservedIndicator.setVisible(resultsTable.getValueAt(row, 5).toString().equals("Reserved"));

                    buyButton.setEnabled(true);
                    reserveButton.setEnabled(true);
                }
            }
        });

        // Buy and reserve actions
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = resultsTable.getSelectedRow();
                if (row != -1) {
                    String status = resultsTable.getValueAt(row, 5).toString();
                    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to purchase this lot?", "Confirm Purchase", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        if (!Objects.equals(status, "Sold") && !Objects.equals(status, "Reserved")) {
                            JOptionPane.showMessageDialog(null, "Lot " + resultsTable.getValueAt(row, 0).toString() + " has been purchased.", "Purchase Successful", JOptionPane.INFORMATION_MESSAGE);
                            resultsTable.setValueAt("Sold", row, 5);
                            soldIndicator.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lot " + resultsTable.getValueAt(row, 0).toString() + " is already " + status.toLowerCase() + ".", "Purchase Failed", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });

        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = resultsTable.getSelectedRow();
                if (row != -1) {
                    String status = resultsTable.getValueAt(row, 5).toString();
                    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to reserve this lot?", "Confirm Reservation", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        if (!Objects.equals(status, "Sold") && !Objects.equals(status, "Reserved")) {
                            JOptionPane.showMessageDialog(null, "Lot " + resultsTable.getValueAt(row, 0).toString() + " has been reserved.", "Reservation Successful", JOptionPane.INFORMATION_MESSAGE);
                            resultsTable.setValueAt("Reserved", row, 5);
                            reservedIndicator.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lot " + resultsTable.getValueAt(row, 0).toString() + " is already " + status.toLowerCase() + ".", "Reservation Failed", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });
    }

    private void filterTable() {
        String blockFilterQuery = Objects.requireNonNull(blockComboBox.getSelectedItem()).toString();
        String sizeFilterQuery = sizeTextField.getText();
        String priceFilterQuery = priceTextField.getText();
        String houseTypeFilterQuery = Objects.requireNonNull(houseTypeComboBox.getSelectedItem()).toString();

        if (!Objects.equals(sizeFilterQuery, "")) {
            if (Integer.parseInt(sizeFilterQuery) < 100) {
                JOptionPane.showMessageDialog(null, "Minimum size is 100sq/m", "Invalid Size", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (!Objects.equals(priceFilterQuery, "")) {
            if (Integer.parseInt(priceFilterQuery) < 1000000) {
                JOptionPane.showMessageDialog(null, "Minimum price is PHP 1000000", "Invalid Price", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        data.filter(blockFilterQuery, sizeFilterQuery, priceFilterQuery, houseTypeFilterQuery);
    }

    private void setupDisplays() {
        soldIndicator.setVisible(false);
        reservedIndicator.setVisible(false);
    }

    private void setupResultsTable() {
        resultsTable.setDefaultEditor(Object.class, null);
        data.populate();
    }

    private void createUIComponents() {
        setupDisplays();
        setupResultsTable();
    }

    public static void render() {
        JFrame app = new JFrame("Real Estate Management System");
        app.setContentPane(new UserInterface().root);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}