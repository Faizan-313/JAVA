package library.members;

public class Faculty {
    private String name;
    private String facultyId;

    public Faculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public void display() {
        System.out.println("Faculty Name: " + name + ", ID: " + facultyId);
    }

    public String getId() {
        return facultyId;
    }
}
