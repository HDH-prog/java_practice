
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Classroom {
    // 필드
    private final List<Student> students;

    // 생성자
    public Classroom() {
        this.students = new ArrayList<>();
    }

    // 메소드
    // addStudent(...), getStudents(), findById(...), getPassedStudents(), findTopStudent(), searchByName(...)

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(this.students);
    }

    public Optional<Student> findById(int id) {
        return this.students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public List<Student> getPassedStudents() {
        return students.stream()
                .filter(student -> student.getPassStatus() == PassStatus.PASSED)
                .collect(Collectors.toList());
    }

    public Optional<Student> findTopStudent() {
        return students.stream()
                .max((first, second) -> Integer.compare(first.getScore(), second.getScore()));
    }


    public List<Student> searchByName(String name) {
        return students.stream()
                .filter(student -> student.getName().contains(name))
                .collect(Collectors.toList());
    }
}
