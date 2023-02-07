import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    Converter converter = new Converter();
    MonthData[] monthToData;
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        monthToData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (0 - 11)");
        int mon = scanner.nextInt();
        if (mon < 0 || mon > 11) {
            System.out.println("Введите корректный номер месяца: 0-Январь, ..., 11-Декабрь");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Введите корректное число месяца: от 1 до 30");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Количество шагов не может быть отрицательным");

            return;
        }
        MonthData monthData = monthToData[mon];
        monthData.days[day - 1] = steps;
        monthToData[mon] = monthData;
        System.out.println("Данные сохранены");
    }
    void changeStepGoal (){
        System.out.println("Введите новую цель:");
        int newStepGoal = scanner.nextInt();
        if (newStepGoal < 0) {
             System.out.println("Количество шагов не может быть отрицательным");
             return;
            }
        goalByStepsPerDay = newStepGoal;
        System.out.println("Новая цель по количеству шагов в день: " + newStepGoal + " шагов");
    }
    void printStatistic() {
        System.out.println("Введите число месяца (0 - 11)");
        printMonth();
        int mon = scanner.nextInt();
        if (mon <= 0 || mon > 11) {
            System.out.println("Введен не правильный номер месяца");
        return;
        }
        MonthData monthData = monthToData[mon];
        int sumSteps = monthData.sumStepsFromMonth();

        System.out.println("Количество пройденных шагов по дням: ");
        monthData.printDaysAndStepsFromMonth();
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps());
        System.out.println("Среднее количество шагов за месяц: " + monthData.averageSteps());
        System.out.println("Пройденная за месяц дистанции в км: " + converter.stepToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий за месяц: " + converter.StepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println(); //дополнительный перенос строки
    }
    void printMonth() {
        System.out.println("Январь - 0, .... Декабрь - 11");
    }
    }



