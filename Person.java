package select;
public class Person {
	public Person(){
		
	}
	public Person(int id,String name,int age,String sex,int mark){
		this.id=id;
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.mark=mark;
	}
	public Person(int id,String name,int age,String sex,String course_name){
		this.id=id;
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.course_name=course_name;
	}
	private int id;
	private String name;
	private int age;
	private String sex;
	private int mark;
	private String course_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	
	
	
	

}
