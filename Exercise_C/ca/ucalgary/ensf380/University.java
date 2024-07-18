package ca.ucalgary.ensf380;

public class University {
	
    public static void main(String[] args) {
    	
        Address professorAddress = new Address("2500 University Dr NW", "Calgary", "AB", "T2N 1N4", "Canada");
        Address studentAddress = new Address("123 Street SW", "Calgary", "AB", "T3E 7N9", "Canada");
        Professor professor = new Professor("Professor Mahdi", "1234567890", "mahdi.jaberzadehansa@ucalgary.ca", professorAddress, "ICT 114", 101000.00);
        Student student = new Student("Arnav Mittal", "0123456789", "arnav.mittal1@ucalgary.ca", studentAddress, "S456", professor, 75.5);

        System.out.println("Professor Information:");
        System.out.println("Name: " + professor.getName());
        System.out.println("Teacher Number: " + professor.getTeacherNumber());
        System.out.println("Address: " + professor.getAddress().outputAsLabel());
        System.out.println("Salary: "+ professor.getSalary());

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Average Mark: " + student.getAverageMark());
        System.out.println("Eligible to Enroll: " + student.isEligibleToEnroll());
        System.out.println("Supervisor: " + student.getSupervisor().getName());

        System.out.println("\nStudent Address:");
        System.out.println(student.getAddress().outputAsLabel());
    }
}


