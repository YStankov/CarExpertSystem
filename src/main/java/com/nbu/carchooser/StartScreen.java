package com.nbu.carchooser;

import javax.swing.*;
import java.awt.*;

public class StartScreen extends JPanel {
	private static final long serialVersionUID = 703772187234939485L;
	
	private JButton button;

    public StartScreen() {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        JLabel label = new JLabel("Експертна система за избор на автомобил");
        label.setFont(new Font("Times New Roman", Font.BOLD, 24));
        gbc.weighty = 0.1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(label, gbc);
        add(label);

        ImagePanel image = new ImagePanel("img/cars.jpg");
        image.setMinimumSize(new Dimension(465, 465));
        image.setPreferredSize(new Dimension(465, 465));
        gbc.weighty = 1.0;
        gbl.setConstraints(image, gbc);
        add(image);

        button = new JButton("СТАРТ");
        gbc.weighty = 0.1;
        gbl.setConstraints(button, gbc);
        add(button);

    }

    public JButton getButton()
    {
        return button;
    }
}

