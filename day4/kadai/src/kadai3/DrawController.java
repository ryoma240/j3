package kadai3;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawController implements MouseListener, MouseMotionListener {
	protected DrawModel model;
	protected int dragStartX, dragStartY;
	int i;

	public DrawController(DrawModel a) {
		model = a;
		i = 0;
	}

	public void setnum(int n) {
		i = n;
	}
	
	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		dragStartX = e.getX();
		dragStartY = e.getY();
		if(i == 0)
		model.createRectFigure(dragStartX, dragStartY);
		if(i == 1)
			model.createOvalFigure(dragStartX, dragStartY);
	}

	public void mouseDragged(MouseEvent e) {
		model.reshapeFigure(dragStartX, dragStartY, e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}
}
