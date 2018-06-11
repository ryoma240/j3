package kadai4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HelloFrame extends JFrame implements ActionListener{
	private JLabel label;
	
	 public HelloFrame(){
	      this.setSize(300,200);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JButton b = new JButton("Divine");
	      this.add(b,BorderLayout.SOUTH);
	      label = new JLabel(" ",JLabel.CENTER);
	      this.add(label,BorderLayout.CENTER);
	      b.addActionListener(this);
	      this.setVisible(true);
	    }
	    public void actionPerformed(ActionEvent ev) {
	    	double r = Math.random();
	    	if(r <= 0.2) {
	    		label.setText("bad");}
		    	else {
		    		if(r <= 0.7)
		    			label.setText("so so");
		    		else {
		    			if(r <= 1.0)
		    				label.setText("good");
		    		}
		    	}
	    	}
	    
	    public static void main(String argv[]) {
	      new HelloFrame();
	    }

}
