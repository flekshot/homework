public class task1 {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public task1(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderString + ".";
    }
    public static void main(String[] args) {
        task1 person1 = new task1("John", "Doe", 30, true);
        task1 person2 = new task1("Jane", "Smith", 25, false);

        System.out.println(person1);
        System.out.println(person2);
    }
}