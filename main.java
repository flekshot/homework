import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        shkola shkola = new shkola();
        try {
            BufferedReader chitatUchenikov = new BufferedReader(new FileReader("students.txt"));
            BufferedReader chitatUchiteley = new BufferedReader(new FileReader("teachers.txt"));

            String stroka;
            while ((stroka = chitatUchenikov.readLine()) != null) {
                String[] chast = stroka.split(",");
                uchenik uchenik = new uchenik(chast[0], Double.parseDouble(chast[1]));
                shkola.dobavitUchastnika(uchenik);
            }
            chitatUchenikov.close();

            while ((stroka = chitatUchiteley.readLine()) != null) {
                String[] chast = stroka.split(",");
                uchitel uchitel = new uchitel(chast[0], Double.parseDouble(chast[1]), Integer.parseInt(chast[2]));
                uchitel.povysitZarplatu();
                shkola.dobavitUchastnika(uchitel);
            }
            chitatUchiteley.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файлов.");
        }

        shkola.pechatatUchastnikov();
    }
}
