package s25692.gui.oop.LABO01;

public class Subject {

    private static final int MAX_STUD_NUM = 2;
    private final String subjectName;
    private final Student[] students;
    private Person teacher;
    private int studentCount;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        studentCount = 0;
        students = new Student[MAX_STUD_NUM];
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) throws TooManyStudentsException {
        if (studentCount < MAX_STUD_NUM) {
            students[studentCount++] = student;
        } else {
            throw new TooManyStudentsException("This subject has reached its student limit");
        }
    }

    @Override
    public String toString() {
        String returnString = subjectName + " , teacher=" + teacher.getName() + " , students: ";

        for (Student student : students) {
            if (student != null)
                returnString += student.getName() + " ";
            else
                break;
        }

        return returnString;
    }
}
