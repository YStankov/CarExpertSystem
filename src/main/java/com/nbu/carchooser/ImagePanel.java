package com.nbu.carchooser;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;


public class ImagePanel extends JPanel {
	private static final long serialVersionUID = 4710359590097928677L;
	
	private BufferedImage image;

    public ImagePanel(String filename) {
        try
        {
            image = ImageIO.read(new File(filename));
        }
        catch (IOException ex) { }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

}
