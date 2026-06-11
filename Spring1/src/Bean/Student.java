package Bean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Student implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private int id;
	private String name;
	private double marks;
	private Set<Integer> rooms;
	private List<String> subjects;
	public Student(int id, String name, double marks, Set<Integer> rooms, List<String> subjects) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.rooms = rooms;
		this.subjects = subjects;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public Set<Integer> getRooms() {
		return rooms;
	}
	public void setRooms(Set<Integer> rooms) {
		this.rooms = rooms;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", rooms=" + rooms + ", subjects="
				+ subjects + "]";
	}
	
	
	
}
