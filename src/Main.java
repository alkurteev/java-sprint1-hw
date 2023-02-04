import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            String command = scanner.nextLine();
            if (command.equals("1")) {
                // кол-во шагов в день
                stepTracker.addNewNumberStepsPerDay();
            } else if (command.equals("2")) {
                // установить цель
                System.out.println("Введите новую цель:");
                int goalByStepsPerDay = scanner.nextInt();
                stepTracker.changeStepGoal();
            } else if (command.equals("3")) {
                // вывод статистики
                stepTracker.printStatistic();
            } else if (command.equals("4")) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu() {
        System.out.println("Введите команду");
        System.out.println("Ввести количество шагов за определенный день");
        System.out.println("Поставить цель по количеству шагов");
        System.out.println("Напечатать статистику за определенный месяц");
        System.out.println("Введите команду");
    }
}