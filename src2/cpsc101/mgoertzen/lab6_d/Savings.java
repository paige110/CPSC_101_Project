package cpsc101.mgoertzen.lab6_d;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Savings implements MouseListener {

    JTextField textField;
    JTextField intText;
    JTextField yearText;
    JLabel prntTotal = new JLabel();
    JLabel label = new JLabel();

    public void createWindow() {
        JFrame jf = new JFrame("Monies");

        jf.setSize(300, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel area = new JPanel(new BorderLayout(50, 50));
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));

        Color myColour = new Color(195, 173, 173);
        p3.setBackground(myColour);

        //creating labels and areas for user input
        JLabel savings = new JLabel("Enter your savings balance: ");
        textField = new JTextField("0", 6);

        JLabel interest = new JLabel("Enter interest rate: ");
        intText = new JTextField("0", 6);

        JLabel years = new JLabel("Enter the number of years you will save for: ");
        yearText = new JTextField("0", 6);

        JButton calculate = new JButton("Calculate");
        calculate.addMouseListener(this);

        p3.add(savings);
        p3.add(textField);
        p3.add(calculate);
        p3.add(interest);
        p3.add(intText);
        p3.add(calculate);
        p3.add(years);
        p3.add(yearText);
        p3.add(calculate);
        p3.add(label);
        p4.add(prntTotal);
        area.add(p3, BorderLayout.CENTER);
        area.add(p4, BorderLayout.SOUTH);
        jf.add(area, BorderLayout.CENTER);

        jf.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //when mouse is clicked, the input from the
        //text fields are converting into double or integer
        //then total at the bottom is updated

        String savingsInput = textField.getText();
        double savInt = Double.parseDouble(savingsInput);

        String interestInput = intText.getText();
        double interestInt = Double.parseDouble(interestInput);

        String yearInput = yearText.getText();
        int yearInt = Integer.parseInt(yearInput);

        double total = ((savInt * interestInt) * yearInt);

        String totalSavings = String.format("%.2f", total);
        label.setText("After " + yearInt + " years, you will have:");
        prntTotal.setText("$" + totalSavings);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
