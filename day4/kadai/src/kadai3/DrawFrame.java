package kadai3;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class DrawFrame extends JFrame {
	
	gameboad gb;
	
	public DrawFrame() {
		gb = new gameboad();
		
		
		
		this.setBackground(Color.black);
		this.setTitle("9x9game");
		this.setSize(1500, 1000);
		
		
		this.add(gb.p,BorderLayout.CENTER);
		this.add(gb.tb,BorderLayout.NORTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String argv[]) {
		new DrawFrame();
	}
}
