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
                int goalByStepsPerDayNew = scanner.nextInt();
                stepTracker.changeStepGoal(goalByStepsPerDayNew);
            } else if (command.equals("3")) {
                // вывод статистики
                System.out.println("Введите число месяца (0 - 11)");
                stepTracker.printMonth();
                int month = scanner.nextInt();
                if (month < 0 || month > 11) {
                    System.out.println("Введен не правильный номер месяца");
                    return;
                } else {
                    stepTracker.printStatistic();
                }
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
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Поставить цель по количеству шагов");
        System.out.println("3 - Напечатать статистику за определенный месяц");
        System.out.println("4 - Выход");
    }

}