package com.framestudy.studentManage.bean;

public class StudentBean {
	private String stuName;
	private int age;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(String stuName, int age) {
		super();
		this.stuName = stuName;
		this.age = age;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentBean [stuName=" + stuName + ", age=" + age + "]";
	}
	
	
}
