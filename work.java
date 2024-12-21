import java.util.ArrayList;

public class work import java.util.ArrayList;

public class Student {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private double gpa;
    private ArrayList<Course> courses;

    public Student() {
        this.id_gen = id++;
    }

    public Student(String name, String surname, int age, boolean gender) {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public int getId_gen() {
        return id_gen;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
        calculateGPA();
    }

    private void calculateGPA() {
        double totalGrade = 0;
        int totalCredits = 0;
        for (Course course : courses) {
            totalGrade += course.getGrade() * course.getCourseCreadit();
            totalCredits += course.getCourseCreadit();
        }
        gpa = totalGrade / totalCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_gen=" + id_gen +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }
}{
}
