import java.util.ArrayList;

class Chelovek {
    String imya;

    Chelovek(String imya) {
        this.imya = imya;
    }

    public String toString() {
        return imya;
    }
}

class Uchenik extends chelovek {
    Uchenik(String imya) {
        super(imya);
    }
}

class Uchitel extends chelovek {
    Uchitel(String imya) {
        super(imya);
    }
}

class Shkola {
    ArrayList<chelovek> uchastniki = new ArrayList<>();

    void dobavitUchastnika(chelovek chelovek) {
        uchastniki.add(chelovek);
    }

    public String toString() {
        StringBuilder rezultat = new StringBuilder();
        for (chelovek chelovek : uchastniki) {
            rezultat.append(chelovek.toString()).append(", ");
        }
        return rezultat.toString();
    }
}

class Main {
    public static void main(String[] args) {
        shkola shkola = new shkola();
        shkola.dobavitUchastnika(new uchenik("Иван Иванов"));
        shkola.dobavitUchastnika(new uchitel("Анна Петрова"));
        System.out.println(shkola);
    }
}
