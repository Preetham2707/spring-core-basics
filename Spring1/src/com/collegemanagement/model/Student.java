package com.collegemanagement.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int studentId;
    private String studentName;
    private double marks;
    private Set<Integer> roomNumbers;
    private List<String> subjects;

    public Student() {
    }

    public Student(int studentId, String studentName, double marks,
                   Set<Integer> roomNumbers, List<String> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.roomNumbers = roomNumbers;
        this.subjects = subjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Set<Integer> getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(Set<Integer> roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", roomNumbers=" + roomNumbers +
                ", subjects=" + subjects +
                '}';
    }
}