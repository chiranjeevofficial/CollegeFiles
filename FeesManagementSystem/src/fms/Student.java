package fms;

public class Student {
    private String studentName, fatherName, course, phoneNumber, address;
    private int studentId, age;
    private char gender;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student() {}

    public String getStudentName() {
        return studentName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getCourse() {
        return course;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return  getStudentId()+"\n"+
                getStudentName()+"\n"+
                getFatherName()+"\n"+
                getCourse()+"\n"+
                getAge()+"\n"+
                getGender()+"\n"+
                getPhoneNumber()+"\n"+
                getAddress();
    }
}
