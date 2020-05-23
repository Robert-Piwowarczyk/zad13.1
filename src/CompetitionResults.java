import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionResults {
    static Scanner sc = new Scanner(System.in);
    private static int stop;

    public static void main(String[] args) {
        final String outFileName = "stats_out.csv";

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Maria", " Zawadzka"));
        persons.add(new Person("Ryszard", "Głowacki"));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Podaj wynik kolejnego gracza (lub 0 - stop):");
            int stop = 0;
            int result = sc.nextInt();
            if (result > 0)
                System.out.println(persons.add(p) + result);
            else {
                if (result == 0) {
                    result.saveResult(result, outFileName);
                    System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
                    break;
                }
            }
        }
    }
}




