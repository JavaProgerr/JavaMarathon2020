package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Эдуард Фаризович", "Математика");
        Student student = new Student("Валера");
        teacher.evaluate(student);
    }
}
