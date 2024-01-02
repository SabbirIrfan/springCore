package org.example;

public class Student {
    private  int studentId;
    private  String studentName;
    private  String studentAddress;
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = String.valueOf(studentName);
        this.studentAddress = String.valueOf(studentAddress);
    }

    public Student() {
        super();
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
        this.studentName = String.valueOf(studentName);
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = String.valueOf(studentAddress);
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName=" + studentName +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
