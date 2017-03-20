package com.nbu.carchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class QuestionPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = -797849314117421609L;
	
	private int answer;
	
    private ButtonGroup buttonGroup;
    
    private java.util.List<JRadioButton> buttons;
    
    private JButton confirmButton;

    protected void addComponentWithConstraints(JComponent comp,
                                               GridBagLayout gbl,
                                               GridBagConstraints gbc) {
        gbl.setConstraints(comp, gbc);
        add(comp);
    }
    
    public QuestionPanel(String question, String[] options) {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.weighty = 5.0;
        addComponentWithConstraints(new JLabel(question), gbl, gbc);
        
        buttons = new ArrayList<JRadioButton>();
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < options.length; i++)
        {
            JRadioButton optionButton = new JRadioButton(options[i]);
            optionButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            optionButton.addActionListener(this);
            buttons.add(optionButton);
            buttonGroup.add(optionButton);
            gbc.weighty = 0.5;
            addComponentWithConstraints(optionButton, gbl, gbc);
        }
        confirmButton = new JButton("Next");
        confirmButton.addActionListener(this);
        confirmButton.setEnabled(false);
        gbc.weighty = 4.0;
        addComponentWithConstraints(confirmButton, gbl, gbc);
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        // System.out.printf("actionPerformed - %d\n", Thread.currentThread().getId());
        if (e.getSource() instanceof JRadioButton)
            confirmButton.setEnabled(true);
        else
        {
            for (int i = 0; i < buttons.size(); i++)
                if (buttons.get(i).isSelected())
                    answer = i;
            notifyAll();
        }
    }

    public synchronized int getAnswer() {
        try { wait(); }
        catch (InterruptedException e) { }
        return answer;
    }
}
