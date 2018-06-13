package kadai3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OvalangleFigure extends Figure{
	public OvalangleFigure(int x,int y,int w,int h,Color c) {
	    super(x,y,w,h,c);
	    // 引数付きのコンストラクタは継承されないので，コンストラクタを定義．
	    // superで親のコンストラクタを呼び出すだけ．
	  }
	  public void draw(Graphics g) {
	    g.setColor(color);
	    g.fillOval(x,y,width,height);
	  }
}
