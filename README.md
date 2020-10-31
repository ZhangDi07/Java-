# Java-
第二次作业 10.26  
2020322063  
计G201 张迪  

## 实验内容  
  编写一个学生模拟选课系统，学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）；  
教师（编号、姓名、性别、所授课程、……）；  
学生（编号、姓名、性别、所选课程、……）；  
课程（编号、课程名称、上课地点、时间、授课教师、……）
## 实验目的  
1.从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2.掌握面向对象的类设计方法（属性、方法）；  
3.掌握类的继承用法，通过构造方法实例化对象；  
4.学会使用super()，用于实例化子类；  
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验过程  
Course类是包含有关课程信息的类，定义一个无参和有参构造方法，其中定义课程所需的各种属性。定义一个返回boolean类型的judge方法，并在方法内用this关键字调用check方法用于判断学生是否满足选课的条件并在控制台输出  
生成tostring方法用来看类的信息

Person类是基类
生成无参的构造方法，生成两个有参的构造方法一个构造方法是让学生调用的，一个是给老师的
其中定义学生和老师共性的属性

Teacher类中继承Person类
定义无参构造方法
定义有参构造方法，并用super关键字调用父类的构造方法并向其传值
定义一个打分的方法inputMark用于给学生打分，并用super关键字将值传给父类中的属性

Student类中同样继承Person类
定义无参构造方法
定义有参构造方法，并用super关键字调用父类的构造方法并向其传值
定义choose方法参数为Course类型的 c
通过c调用Course的judge方法来实现学生选课的操作
定义nochoose方法参数上同
通过c给课程的装态设置为false再调用check方法实现学生退课操作

Test是主类
Teacher通过上转型的方式实例化其中课程名称需要将值传给课程类
然后利用强制类型转换调用老师打分的方法
Student通过上转型的方式实例化其中需要得到老师的分数
然后强制类型转换调用学生的选课和退课方法并输出

## 实验流程图
![alt console](https://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/bqQfVz5yrrGYSXMvKr.cqRvTvb*WW0EHqJ8PifOJBPpIUvta8pwZCTwwAagu9uWVnWW6Yl6v.fq1m9mnghI5DrVojKJiQbeVxvlN5hCBZV0!/b&bo=BgSGAgAAAAADB6Q!&rf=viewer_4)
## 核心方法
1.方法1 判断选课要求
```
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
 ```
 2.方法2 判断是否选课成功
 ```
 //是否成功选课
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
 ```
 3.方法3 构造方法
 ```
 //构造方法
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
 ```

## 实验结果 
![alt console](https://m.qpic.cn/psc?/V50ini880vFPiW2LYxFK2RoQRD3UEErn/bqQfVz5yrrGYSXMvKr.cqdtOrK8CiQ1q7jVmA2XN9FBGG.r4LzZb7Q0hh1UkeZFtZt5f3WZ1QVvEGewzGz6DbIQoNr06Xr40sFnrULbfil4!/b&bo=bwTOAAAAAAADB4c!&rf=viewer_4)
## 实验感想
通过本次实验理解并会使用了类的继承用法，掌握了super调用父类中的属性和tostring方法输出数据。但最初继承逻辑不合理，修改很久才改完，还是对继承的逻辑有所欠缺，后期需要更多地学习。总之，通过本次实验收获很大
