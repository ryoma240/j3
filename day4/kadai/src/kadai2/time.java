package kadai2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class time extends JFrame{
	private ClockPanel cp1, cp2, cp3, cp4, cp5, cp6;
	private TimeObservable to;
	
	public time () {
		to = new TimeObservable();
		cp1 = new ClockPanel(to, "Tokyo", 0);
		cp2 = new ClockPanel(to, "Beijin", 1);
		cp3 = new ClockPanel(to, "paris", 8);
		cp4 = new ClockPanel(to, "London", 9);
		cp5 = new ClockPanel(to, "New York", 14);
		cp6 = new ClockPanel(to, "Los Angels", 17);
		
		
		this.setLayout(new GridLayout(6,1));
		this.add(cp1);
		this.add(cp2);
		this.add(cp3);
		this.add(cp4);
		this.add(cp5);
		this.add(cp6);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
	    new time();
	}
}
