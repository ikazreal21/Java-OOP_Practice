package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class practiceGUI implements ActionListener {

    private int clicks;
    private JFrame frame = new JFrame();
    private JLabel label = new JLabel("Number of clicks: 0");

    public practiceGUI() {

        JPanel panel = new JPanel();
        JButton button = new JButton("Click");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gui Practice");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new practiceGUI();
    }

    public void actionPerformed(ActionEvent arg0) {
        clicks++;
        label.setText("Number of Click: " + clicks);
    }

}
