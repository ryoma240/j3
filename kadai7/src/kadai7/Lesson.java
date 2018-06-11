package kadai7;

public class Lesson {
	private String name;    // 課題名
	  private String teacher; // 担当者 
	  private int max;        // 最大履修者数
	  private int num;        // 登録履修者数
	  private student st[];   // Student class の配列
	 
	  public Lesson(String name,String teacher,int max){
	    this.name=name;
	    this.teacher=teacher;
	    this.max=max;  
	    this.num=0;          // num は 0 に初期化．
	    st=new student[max]; // 配列の確保(オブジェクトは別に生成する必要がある)
	  }
	  public void add(student s) {
		  if(num == max) {
			  System.out.println("warning:最大人数を越えています");
			  return;
		  }
	    st[this.num++] = s; 
	  }
	  public void sort_id() {
		  int i,j;
		  String t;
		  for(i = num; i > 1; i--) {
			  for(j = 1; j < i; j++) {
				  if(st[j].id.compareTo(st[j-1].id) < 0) {
					 t = st[j-1].id; st[j-1].id = st[j].id; st[j].id = t; 
				  }
			  }
		  }
	  }
	  public void sort_name() {
		  int i,j;
		  String t;
		  for(i = num; i > 1; i--) {
			  for(j = 1; j < i; j++) {
				  if(st[j].name.compareTo(st[j-1].name) < 0) {
					 t = st[j-1].name; st[j-1].name = st[j].name; st[j].name = t; 
				  }
			  }
		  }
	  }
	  public void sort_grade() {
		  int i,j,t;
		  for(i=num;i>1;i--)
		    for(j=1;j<i;j++)
		      if (st[j-1].grade>st[j].grade){
		        t=st[j-1].grade; st[j-1].grade=st[j].grade; st[j].grade=t; 
		      }
	  }
	  
	  
	  
	  int i;
	  public void print() {
		  System.out.println("Lesson            :"+name);
		  System.out.println("Teacher           :"+teacher);
		  System.out.println("Nunber of Students:"+num);
		  for(i = 0; i < num; i++) {
			  st[i].print_short();
		  }
		  System.out.println("----------");  
	  }
	
}
