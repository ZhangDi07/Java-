package select;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Teacher(001, "仙女", 24, "女", "java");
		Course c=new Course(1306, p.getCourse_name(), "综合楼", "13:30", p.getName(), 2);
		Teacher t=(Teacher) p;
		t.inputMark(86);
		Person p1=new Student(2020322063, "张张", 22, "女",p.getMark());
		Student s=(Student) p1;
        s.choose(c); 
	    System.out.println(c);   
	    s.nochoose(c); 
	    System.out.println(c);   
	}

}
