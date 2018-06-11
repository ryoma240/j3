package kadai6;

import java.util.*;

public class Lesson {
	  private String name;    // 課題名
	  private String teacher; // 担当者 
	  private int num;        // 登録履修者数
	  private ArrayList<student> st;
	 
	  public Lesson(String name,String teacher){
	    this.name=name;
	    this.teacher=teacher;
	    this.num=0;          // num は 0 に初期化．
	    st=new ArrayList<student>(); 
	  }
	  public void add(student s) {
		  String id0 = s.getID();
		  num++;
		  for(int i=0; i<st.size(); i++) {
			  student s0=st.get(i);
			  if(id0.compareTo(s0.getID())<0) {
				  st.add(i, s);
				  return;
			  }
		  }
		  st.add(s);
	  }
	  
	  
	  
	  int i;
	  public void print() {
		  System.out.println("Lesson            :"+name);
		  System.out.println("Teacher           :"+teacher);
		  System.out.println("Nunber of Students:"+num);
		  for(i = 0; i < num; i++) {
			  st.get(i).print_short();
		  }
		  System.out.println("----------");  
	  }
}
