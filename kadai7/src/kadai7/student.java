package kadai7;

public class student {

    public String id;    // 学籍番号
    public String name;  // 名前
    public int grade;    // 成績

    public student(String id,String name, int grade) {
    	this.id = id; this.name =name; this.grade =grade;
    }
    
    void print() {
      System.out.println("ID   : "+id);  
      System.out.println("Name : "+name);
      System.out.println("Grade: "+grade);
    }
    public void print_short() {
        System.out.println(id+","+name+","+grade);  
      }
	
}
