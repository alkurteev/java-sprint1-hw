import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();
            } else if (command == 0) {
                System.out.println("Программа завершена!");
                break;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu() {
        System.out.println("Введите команду");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Поставить цель по количеству шагов");
        System.out.println("3 - Напечатать статистику за определенный месяц");
        System.out.println("0 - Выход");
    }

}