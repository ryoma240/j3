package kadai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ClockPanel extends JPanel implements Observer{
	private TimeObservable timeObservable;
	  private int diff;
	  private JLabel timeLabel;
	  public ClockPanel(TimeObservable to, String place, int diff) {
	    timeObservable = to;
	    this.diff = diff;
	    timeObservable.addObserver(this);
	    timeLabel = new JLabel(to.getValue(diff), JLabel.CENTER);
	    this.setLayout(new GridLayout(1,2));
	    this.add(new JLabel(place));
	    this.add(timeLabel);
	  }
	  public void update(Observable o, Object arg) {
	    timeLabel.setText(timeObservable.getValue(diff));
	  }
}
