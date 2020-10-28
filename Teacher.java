package select;

public class Teacher extends Person{
	public Teacher(){
		super();
	}
	public Teacher(int id,String name,int age,String sex,String course_name ){
		super(id,name,age,sex,course_name);
	}
	//老师给学生打分方法
	public void inputMark(int mark){
		super.setMark(mark);
		System.out.println("你英语的分数为："+mark);
	}

}
