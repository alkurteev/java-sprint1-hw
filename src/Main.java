import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

            printMenu();
            int command = scanner.nextInt();
        while (command != 0) {
            if (command == 1) {
                // кол-во шагов в день
                int month;
                int day;
                int stepsPerDay;

                while (true) {
                    System.out.println("Введите номер месяца (0 - 11)");
                    stepTracker.printMonth();
                    month = scanner.nextInt();
                    if (month < 0 || month > 11) {
                        System.out.println("Введите корректный номер месяца: 0-Январь, ..., 11-Декабрь");
                    } else break;
                }
                while (true) {
                    System.out.println("Введите день от 1 до 30 (включительно)");
                    day = scanner.nextInt();
                    if (day < 1 || day > 30) {
                        System.out.println("Введите корректное число месяца: от 1 до 30");
                    }
                    else break;
                }
                while (true) {
                    System.out.println("Введите количество шагов");
                    stepsPerDay = scanner.nextInt();
                    if (stepsPerDay < 0) {
                        System.out.println("Количество шагов не может быть отрицательным");
                    }
                    else break;
                }
                stepTracker.saveSteps(month, day, stepsPerDay);
            } else if (command == 2) {
                // установить цель
                int goalByStepsPerDay;
                while (true) {
                    System.out.println("Введите новую цель:");
                    goalByStepsPerDay = scanner.nextInt();
                    if (goalByStepsPerDay < 0) {
                        System.out.println("Количество шагов не может быть отрицательным");
                    } else break;
                }
                stepTracker.changeStepGoal(goalByStepsPerDay);
            } else if (command == 3) {
                // вывод статистики
                int month;
                while (true) {
                    System.out.println("Введите число месяца (0 - 11)");
                    stepTracker.printMonth();
                    month = scanner.nextInt();
                    if (month <= 0 || month > 11) {
                        System.out.println("Введен не правильный номер месяца");
                    }
                    else break;
                }
                stepTracker.printStatistic(month);
            } else {
                System.out.println("Такой команды нет");
            }
            printMenu();
            command = scanner.nextInt();
        }
        System.out.println("Программа завершена!");
        scanner.close();
        }
    static void printMenu() {
        System.out.println("Введите команду");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Поставить цель по количеству шагов");
        System.out.println("3 - Напечатать статистику за определенный месяц");
        System.out.println("0 - Выход");
    }

}