import java.io.*;
import java.util.ArrayList;

class chelovek {
    String imya;

    chelovek(String imya) {
        this.imya = imya;
    }

    public String toString() {
        return imya;
    }
}

class uchenik extends chelovek {
    double sredniyBall;

    uchenik(String imya, double sredniyBall) {
        super(imya);
        this.sredniyBall = sredniyBall;
    }

    double raschitatBall() {
        return sredniyBall;
    }
}

class uchitel extends chelovek {
    double zarplata;
    int stazh;

    uchitel(String imya, double zarplata, int stazh) {
        super(imya);
        this.zarplata = zarplata;
        this.stazh = stazh;
    }

    void povysitZarplatu() {
        if (stazh > 10) {
            zarplata *= 1.1;
        }
    }

    public String toString() {
        return imya + " (Зарплата: " + zarplata + ")";
    }
}

class shkola {
    ArrayList<chelovek> uchastniki = new ArrayList<>();

    void dobavitUchastnika(chelovek chelovek) {
        uchastniki.add(chelovek);
    }

    void pechatatUchastnikov() {
        for (chelovek chelovek : uchastniki) {
            System.out.println(chelovek);
        }
    }
}

