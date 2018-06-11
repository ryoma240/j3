package kadai2;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TimeObservable extends Observable implements ActionListener{
	private javax.swing.Timer timer;
	  private int hour, min, sec; // 現在時刻を保持するインスタンス変数
	  public TimeObservable() {
	    timer = new javax.swing.Timer(1000, this); // 1秒毎にactionPerformedを呼び出し
	    timer.start();
	  }
	  public void actionPerformed(ActionEvent arg0) {
	    this.setValue();
	  }
	  void setValue()  {
		  Calendar cal = Calendar.getInstance(); 
		  hour= cal.get(Calendar.HOUR_OF_DAY); 
		  min = cal.get(Calendar.MINUTE); 
		  sec = cal.get(Calendar.SECOND);
		  setChanged();      // 状態変化のフラグをセット
		  notifyObservers(); 
	  }
	  String getValue(int diff) {
		  return String.format("%02d:%02d:%02d",(hour-diff+24)%24, min, sec);
	  }
	
	
}
