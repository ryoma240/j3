package kadai3;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewPanel extends JPanel implements Observer {

	protected DrawModel model;

	public ViewPanel(DrawModel m, DrawController c) {
		this.setBackground(Color.white);
		this.addMouseListener(c);
		this.addMouseMotionListener(c);
		model = m;
		model.addObserver(this);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Figure f = model.drawingFigure;
		f.draw(g);
	}

	public void update(Observable o, Object arg) {
		repaint();
	}

}
