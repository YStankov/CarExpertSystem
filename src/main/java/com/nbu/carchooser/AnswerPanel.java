package com.nbu.carchooser;

import javax.swing.*;
import java.awt.*;

public class AnswerPanel extends JPanel {

	private static final long serialVersionUID = 6922737086470705977L;

	public AnswerPanel(String answer, String imageFileName) {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        ImagePanel image = new ImagePanel(imageFileName);
        image.setMinimumSize(new Dimension(1000, 600));
        image.setPreferredSize(new Dimension(1000, 600));
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(image, gbc);
        add(image);

        JLabel label = new JLabel(answer);
        label.setFont(new Font("Times New Roman", Font.BOLD, 24));
        gbc.weighty = 0.1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(label, gbc);
        add(label);
    }
}
