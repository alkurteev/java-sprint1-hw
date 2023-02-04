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
    void changeStepGoal() {
        if (goalByStepsPerDay <= 0) {
            System.out.println("Введите положительное число.");
        } else {
            goalByStepsPerDay = goalByStepsPerDayNew;
            System.out.println("Новая цель по количеству шагов в день: " + goalByStepsPerDay + " шагов");
        }

    }
        // сохранение данных
        MonthData monthData = monthToData[month];
        final int[] days = monthData.days;
        days[day - 1] = step;


    void printStatistic() {
        System.out.println("Введите число месяца (0 - 11)");
        printMonth();
        int month = scanner.nextInt();
        if (month < 0 || month > 11) {
            // Ошибка
            return;
        }
        // ввод и проверка номера месяца
        MonthData monthData = monthToData[month];
        System.out.println("вывод общей статистики");
        System.out.println("вывод суммы шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("вывод максимального пройденного количества шагов за месяц:" + monthData.sumStepsFromMonth());
        System.out.println("подсчёт и вывод максимального пройденного количества шагов за месяц");
        System.out.println("вывод пройденной за месяц дистанции в км: " + converter.stepToKm(monthData.sumStepsFromMonth()));
        System.out.println("вывод количества сожжённых килокалорий за месяц");
        System.out.println("вывод лучшей серии");
        System.out.println(); //дополнительный перенос строки
    }
    private void printMonth() {
        System.out.println("Январь - 0, .... Декабрь - 11");
    }
    public void setTarget() {
        System.out.println("Введите  цель:");
        target = scanner.nextInt();
    }
}
