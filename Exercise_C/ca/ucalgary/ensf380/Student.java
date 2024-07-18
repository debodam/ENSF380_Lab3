package ca.ucalgary.ensf380;

public class Student extends Person {
    private String studentNumber;
    private Professor supervisor;
    private double averageMark;

    public Student(String name, String phoneNumber, String emailAddress, Address address, String studentNumber, Professor supervisor, double averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.supervisor = supervisor;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 50.0;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}