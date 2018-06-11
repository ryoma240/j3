package kadai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CirclePanel extends JPanel implements MouseListener{

	private int radius=5;         // 円の半径
	  private Color color; // 円の
	  private int   x[],y[],r[];     // すべての丸の位置と半径を記録する位置を配列
	  private Color c[];   // 丸の色を記録するColorクラス型の配列
	  private int   num=0;           // 今まで記録した丸の数
	  final static int MAX=5000;     // 記録できる丸の最大数 (定数)
	 
	  public CirclePanel(){
	    x=new int[MAX];
	    y=new int[MAX];
	    r=new int[MAX];
	    c=new Color[MAX];
	    this.addMouseListener(this);
	  }
	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    for(int i=0;i<num;i++){
	      g.setColor(c[i]);
	      g.fillOval(x[i]-r[i],y[i]-r[i],r[i]*2,r[i]*2);
	    }
	  }
	  
	  public void setPanelColor(Color c1) {
		  this.color = c1;
	  }
	  public void setRadius(int r1) {
		  this.radius = r1;
	  }
	  private void addCircle(int x0,int y0){
	    if (num>=MAX) return;
	    x[num]=x0; y[num]=y0;
	    c[num] = color;
	    r[num] = radius; 
	    num++;
	    this.repaint();
	  }
	  
	 
	  public void mousePressed(MouseEvent e) {
	     addCircle(e.getX(),e.getY());
	  }
	  public void mouseClicked(MouseEvent e) { }
	  public void mouseReleased(MouseEvent e){ }
	  public void mouseEntered(MouseEvent e) { }
	  public void mouseExited(MouseEvent e)  { }
}
