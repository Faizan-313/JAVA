package library.members;

public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", ID: " + studentId);
    }

    public String getId() {
        return studentId;
    }
}
