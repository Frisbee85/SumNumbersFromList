import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbersFromList {

    public static final String SUM_EXIT = "=";
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
            List<Double> numbers = new ArrayList<>();
            fillList(numbers);
            printData(numbers);
        }

        //wczytywanie danych
        static void fillList(List<Double> list) {
            System.out.println("Podaj kolejną liczbę lub wpisz znak '='");

            String input = scanner.nextLine();
            if (input.equals(SumNumbersFromList.SUM_EXIT))
                return;

            try {
                Double num = Double.valueOf(input);
                list.add(num);
            } catch (NumberFormatException e) {
                System.err.println("Liczba w niepoprawnym formacie");
            }

            fillList(list);
        }

        //wyświetlanie danych
        static void printData(List<Double> list) {
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                double sum = 0;
                for (double d : list) {
                    sb.append(d);
                    sb.append('+');
                    sum += d;
                }
                sb.replace(sb.length() - 1, sb.length(), "=");
                sb.append(sum);
                System.out.println(sb.toString());
            }
        }
    }