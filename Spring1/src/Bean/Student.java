package Bean;

import java.io.Serializable;

public class Student implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private int id;
	private String name;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
/*
 * Before Spring

Normally in Java, if you want a Student object:

Student s = new Student();
s.setId(1000);
s.setName("Ram");
s.setMarks(80);

You create the object yourself.

With Spring

Instead of creating the object yourself:

Student s = new Student();

You tell Spring:

"You create and manage the object for me."

This is the core idea of Spring.
 */
