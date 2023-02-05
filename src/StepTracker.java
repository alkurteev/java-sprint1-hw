import java.util.Scanner;
public class StepTracker {

    Scanner scanner;
    Converter converter;
    MonthData[] monthToData;
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        converter = new Converter();

        monthToData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (0 - 11)");
        printMonth();
        int month = scanner.nextInt();
        if (month < 1 || month > 11) {
            System.out.println("Введен не правильный номер месяца");
        } else {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int day = scanner.nextInt();
            if (day < 1 || day > 30) {
                System.out.println("Введен не правильный номер дня");
            } else {
                System.out.println("Введите количество шагов");
                int step = scanner.nextInt();
                if (step < 0) {
                    System.out.println("Количество шагов не может быть отрицательным");
                } else {
                    return;
                }
            }
        }
    }

    void changeStepGoal(int goalByStepsPerDayNew) {
        if (goalByStepsPerDay <= 0) {
            System.out.println("Введите положительное число.");
        } else {
            goalByStepsPerDay = goalByStepsPerDayNew;
            System.out.println("Новая цель по количеству шагов в день: " + goalByStepsPerDay + " шагов");
        }

    }

    // сохранение данных
    MonthData monthData = monthToData[month];
    int[] days = monthData.days;
    days[day -1]=step;
}

    void printStatistic() {
        System.out.println("Введите число месяца (0 - 11)");
        printMonth();
        MonthData monthData = monthToData[month];
        System.out.println("Количество пройденных шагов по дням: " + monthData.printDaysAndStepsFromMonth());
        System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps());
        System.out.println("Среднее количество шагов за месяц: " + monthData.averageSteps());
        System.out.println("Пройденная за месяц дистанции в км: " + converter.stepToKm(monthData.sumStepsFromMonth()));
        System.out.println("Количество сожжённых килокалорий за месяц: " + converter.StepsToKilocalories());
        System.out.println("Лучшая серия: максимально количество подряд идущих дней: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println(); //дополнительный перенос строки
    }
    private void printMonth() {
        System.out.println("Январь - 0, .... Декабрь - 11");
    }

}
}
