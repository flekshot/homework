public class Person {   
    private String name;
    private String surname;
    private int age;
    private boolean gender; // true for Male, false for Female

    public Person(String name, String surname, int age, boolean gender) {
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
        Person person1 = new Person("John", "Doe", 30, true);
        Person person2 = new Person("Jane", "Smith", 25, false);

        System.out.println(person1);
        System.out.println(person2);
    }
}