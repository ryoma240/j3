package kadai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleFrame  extends JFrame implements ActionListener{
    private CirclePanel panel;
    private ButtonPanel bp;
    public CircleFrame(){
    	bp = new ButtonPanel();
    	this.add(bp.p1, BorderLayout.WEST);
    	this.add(bp.p2, BorderLayout.EAST);
    	this.setTitle("CircleFrame");
    	this.setSize(500,500);
    	panel=new CirclePanel();
    	this.add(panel);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	
    	
    	bp.b1.addActionListener(this);
    	bp.b2.addActionListener(this);
    	bp.b3.addActionListener(this);
    	bp.b4.addActionListener(this);
    	bp.b5.addActionListener(this);
    }
 
	  public void actionPerformed(ActionEvent e){ 
		  if (e.getSource()==bp.b1) panel.setPanelColor(Color.YELLOW);      
		  else if (e.getSource()==bp.b2) panel.setPanelColor(Color.BLACK);
		  else if (e.getSource()==bp.b3) panel.setPanelColor(Color.WHITE);
		  else if (e.getSource()==bp.b4) panel.setRadius(5);
		  else if (e.getSource()==bp.b5) panel.setRadius(10);
			  
	  } 
	
    
    public static void main(String argv[]) {
      new CircleFrame();
    }
}

