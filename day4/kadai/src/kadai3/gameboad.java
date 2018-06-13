package kadai3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class gameboad extends JFrame implements ActionListener {
	JPanel p;
	DrawModel model1, model2, model3, model4, model5, model6, model7, model8, model9;
	ViewPanel view1, view2, view3, view4, view5, view6, view7, view8, view9;
	DrawController cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9;
	String[] cmlist1 = { "red", "blue", "yellow" }, cmlist2 = { "四角", "円" };
	JToolBar tb;
	JComboBox cm1, cm2;

	public gameboad() {
		model1 = new DrawModel();
		model2 = new DrawModel();
		model3 = new DrawModel();
		model4 = new DrawModel();
		model5 = new DrawModel();
		model6 = new DrawModel();
		model7 = new DrawModel();
		model8 = new DrawModel();
		model9 = new DrawModel();
		cont1 = new DrawController(model1);
		cont2 = new DrawController(model2);
		cont3 = new DrawController(model3);
		cont4 = new DrawController(model4);
		cont5 = new DrawController(model5);
		cont6 = new DrawController(model6);
		cont7 = new DrawController(model7);
		cont8 = new DrawController(model8);
		cont9 = new DrawController(model9);
		view1 = new ViewPanel(model1, cont1);
		view2 = new ViewPanel(model2, cont2);
		view3 = new ViewPanel(model3, cont3);
		view4 = new ViewPanel(model4, cont4);
		view5 = new ViewPanel(model5, cont5);
		view6 = new ViewPanel(model6, cont6);
		view7 = new ViewPanel(model7, cont7);
		view8 = new ViewPanel(model8, cont8);
		view9 = new ViewPanel(model9, cont9);
		view1.setBorder(new LineBorder(Color.blue, 3));
		view2.setBorder(new LineBorder(Color.blue, 3));
		view3.setBorder(new LineBorder(Color.blue, 3));
		view4.setBorder(new LineBorder(Color.blue, 3));
		view5.setBorder(new LineBorder(Color.blue, 3));
		view6.setBorder(new LineBorder(Color.blue, 3));
		view7.setBorder(new LineBorder(Color.blue, 3));
		view8.setBorder(new LineBorder(Color.blue, 3));
		view9.setBorder(new LineBorder(Color.blue, 3));
		p = new JPanel();
		p.setLayout(new GridLayout(3, 3));
		p.add(view1);
		p.add(view2);
		p.add(view3);
		p.add(view4);
		p.add(view5);
		p.add(view6);
		p.add(view7);
		p.add(view8);
		p.add(view9);
		tb = new JToolBar();
		tb.setLayout(new GridLayout(1, 2));
		cm1 = new JComboBox(cmlist1);
		cm2 = new JComboBox(cmlist2);
		tb.add(cm1);
		tb.add(cm2);
		cm1.addActionListener(this);
		cm2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (cm1.getSelectedIndex() == 0) {
			model1.setColor(Color.red);
			model2.setColor(Color.red);
			model3.setColor(Color.red);
			model4.setColor(Color.red);
			model5.setColor(Color.red);
			model6.setColor(Color.red);
			model7.setColor(Color.red);
			model8.setColor(Color.red);
			model9.setColor(Color.red);
		} else if (cm1.getSelectedIndex() == 1) {
			model1.setColor(Color.blue);
			model2.setColor(Color.blue);
			model3.setColor(Color.blue);
			model4.setColor(Color.blue);
			model5.setColor(Color.blue);
			model6.setColor(Color.blue);
			model7.setColor(Color.blue);
			model8.setColor(Color.blue);
			model9.setColor(Color.blue);
		} else if (cm1.getSelectedIndex() == 2) {
			model1.setColor(Color.yellow);
			model2.setColor(Color.yellow);
			model3.setColor(Color.yellow);
			model4.setColor(Color.yellow);
			model5.setColor(Color.yellow);
			model6.setColor(Color.yellow);
			model7.setColor(Color.yellow);
			model8.setColor(Color.yellow);
			model9.setColor(Color.yellow);
		} 
		if (cm2.getSelectedIndex() == 0) {
			cont1.setnum(0);
			cont2.setnum(0);
			cont3.setnum(0);
			cont4.setnum(0);
			cont5.setnum(0);
			cont6.setnum(0);
			cont7.setnum(0);
			cont8.setnum(0);
			cont9.setnum(0);
		}
		else if(cm2.getSelectedIndex() == 1) {
			cont1.setnum(1);
			cont2.setnum(1);
			cont3.setnum(1);
			cont4.setnum(1);
			cont5.setnum(1);
			cont6.setnum(1);
			cont7.setnum(1);
			cont8.setnum(1);
			cont9.setnum(1);
		}
	}

}
