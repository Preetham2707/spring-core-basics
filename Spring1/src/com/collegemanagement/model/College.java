package com.collegemanagement.model;

import java.io.Serializable;
import java.util.Map;

public class College implements Serializable {

    private static final long serialVersionUID = 1L;

    private int collegeId;
    private String collegeName;
    private String location;
    private Student student;
    private Map<Integer, String> examCenters;

    public College() {
    }

    public College(int collegeId, String collegeName, String location,
                   Student student, Map<Integer, String> examCenters) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.location = location;
        this.student = student;
        this.examCenters = examCenters;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Map<Integer, String> getExamCenters() {
        return examCenters;
    }

    public void setExamCenters(Map<Integer, String> examCenters) {
        this.examCenters = examCenters;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", location='" + location + '\'' +
                ", student=" + student +
                ", examCenters=" + examCenters +
                '}';
    }
}