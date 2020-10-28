package select;

public class Student extends Person{
	public Student(){
		super();
	}
	public Student(int id,String name,int age,String sex,int mark){
		super(id,name,age,sex,mark);
	}
	public void choose(Course c){
		c.judge(super.getMark());
	}
	public void nochoose(Course c){
		c.setState(false);
		c.check();
		
	}
}
