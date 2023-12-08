package Org.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue()
	private int studrollno;
	private String studname;
	private String studbranch;
	
	@ManyToOne
	@JoinColumn(name="teacherinfo")
	private Teacher teacher;

	public int getStudrollno() {
		return studrollno;
	}

	public void setStudrollno(int studrollno) {
		this.studrollno = studrollno;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getStudbranch() {
		return studbranch;
	}

	public void setStudbranch(String studbranch) {
		this.studbranch = studbranch;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [studrollno=" + studrollno + ", studname=" + studname + ", studbranch=" + studbranch
				+ ", teacher=" + teacher + "]";
	}
}
