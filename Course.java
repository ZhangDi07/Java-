package select;

public class Course {
	public Course(){
		
	}
	public Course(int cou_num,String cou_name,String station,String time,String teacher_name,int score){
		this.cou_num=cou_num;
		this.cou_name=cou_name;
		this.station=station;
		this.time=time;
		this.teacher_name=teacher_name;
		this.score=score;
	}
	private int cou_num;
	private String cou_name;
	private String station;
	private String time;
	private String teacher_name;
	private int score;	//学分
	private boolean state; //状态
	public int getCou_num() {
		return cou_num;
	}
	public void setCou_num(int cou_num) {
		this.cou_num = cou_num;
	}
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public boolean judge(int mark){
		if(mark>80){
			this.state=true;
			this.check();
			return true;
		}else{
			this.state=false;
			this.check();
			return false;
		}
	}
	public void check(){
		if(state){
			System.out.println("恭喜您成功选课");
		}else{
			this.cou_num=0;
			this.cou_name=null;
			this.station=null;
			this.time=null;
			this.teacher_name=null;
			this.score=0;
			System.out.println("对不起您不满足选课要求或您已经退课");
		}
	}
	@Override
	public String toString() {
		return "课程信息： [cou_num=" + cou_num + ", cou_name=" + cou_name + ", station=" + station + ", time=" + time
				+ ", teacher_name=" + teacher_name + ", score=" + score + ", state=" + state + "]";
	}
	

}
