package org.santosh.ds.hashing;

public class StudentRecord {
	
	private int studentId;
	private String studentName;
	
	public StudentRecord(int id, String name) {
		this.studentId = id;
		this.studentName = name;
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

}
