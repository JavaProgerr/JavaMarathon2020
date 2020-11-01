package day6;

public class Teacher {
    private String name;
    private String lesson;

    public void evaluate(Student student) {
        int gradeGen = (int) (Math.random() * (6 - 2) + 2);
        String grade = "";
        switch (gradeGen){
            case 2:
                grade = "неудовлетворительно";
                break;
            case  3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }
//        Второй вариант через if
//        if (gradeGen == 2) {
//            grade = "неудовлетворительно";
//        }
//        if (gradeGen == 3) {
//            grade = "удовлетворительно";
//        }
//        if (gradeGen == 4) {
//            grade = "хорошо";
//        }
//        if (gradeGen == 5) {
//            grade = "отлично";
//        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getLesson() + " на оценку " + grade);
    }

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
