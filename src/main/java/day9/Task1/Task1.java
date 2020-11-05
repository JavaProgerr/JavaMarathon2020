package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Васёк", "99");
        Teacher teacher = new Teacher("Вячеслав Артурович", "Физика");
        System.out.println(student.getGroup());
        System.out.println(teacher.getLesson());
        student.printInfo();
        teacher.printInfo();
    }
}
