import ru.netology.tax.TaxSystems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println();
                break;
            }
            switch (input) {
                case "1" :
                    System.out.println("Введите сумму дохода:");
                    earnings += Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    break;
                case "2" :
                    System.out.println("Введите сумму расхода:");
                    spendings += Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    break;
                case "3" :
                    System.out.println();
                    TaxSystems.analyse(earnings, spendings);
                    System.out.println();
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}