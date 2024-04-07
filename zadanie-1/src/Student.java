
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public List<String> grades; // Используйте подходящую коллекцию для хранения оценок

    public double calculateAverage(List<Double> grades) {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades");
        }
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        // Rounding the average to the nearest value in the list
        return Math.round(average * 2) / 2.0;
    }
}
