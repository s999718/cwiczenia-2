import java.util.HashSet;
import java.util.Set;

public class StudentGroup {
    private Set<Student> students;

    public StudentGroup() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        // Check if the student is not already added
        if (!students.add(student)) {
            throw new IllegalStateException("Student is already in the group");
        }
    }

    // Method to check if the group contains a student
    public boolean containsStudent(Student student) {
        return students.contains(student);
    }

}