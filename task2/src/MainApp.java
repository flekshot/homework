import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// Здравствуйте я пытался поменять название на таск2 но ошибки которые появились после, я не смог решить .Это задача номер 2
class Chelovek {
    private String imya;

    public Chelovek(String imya) {
        this.imya = imya;
    }

    @Override
    public String toString() {
        return "Moe imya - " + imya + ".";
    }
}

class Student extends Chelovek {
    private int studentID;
    private List<Integer> otsenki;

    public Student(String imya) {
        super(imya);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.otsenki = new ArrayList<>();
    }

    public void dobavitOtsenku(int otsenka) {
        if (otsenka >= 0 && otsenka <= 100) {
            otsenki.add(otsenka);
        } else {
            System.out.println("Otsenka dolzhna byt' ot 0 do 100.");
        }
    }

    public double vychitatGPA() {
        if (otsenki.isEmpty()) {
            return 0;
        }
        int summa = 0;
        for (int otsenka : otsenki) {
            summa += otsenka;
        }
        return (double) summa / otsenki.size();
    }

    @Override
    public String toString() {
        return super.toString() + " Ya student s ID " + studentID + ".";
    }
}

class Uchitel extends Chelovek {
    private String predmet;

    public Uchitel(String imya, String predmet) {
        super(imya);
        this.predmet = predmet;
    }

    @Override
    public String toString() {
        return super.toString() + " Ya prepodavayu " + predmet + ".";
    }
}

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.dobavitOtsenku(85);
        student.dobavitOtsenku(92);
        System.out.println(student);
        System.out.println("GPA: " + student.vychitatGPA());

        Uchitel uchitel = new Uchitel("Mr. Smith", "Matematika");
        System.out.println(uchitel);
    }
}