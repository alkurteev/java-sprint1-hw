public class StepTracker {
    Converter converter;
    MonthData[] monthToData;
    int goalByStepsPerDay = 10000;

    StepTracker() {
        converter = new Converter();
        monthToData = new MonthData[12];
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void saveSteps(int month, int day, int steps) {
        monthToData[month].stepsFromMonth()[day - 1] = steps;
    }

    void changeStepGoal(int goalByStepsPerDayNew) {
        goalByStepsPerDay = goalByStepsPerDayNew;
            System.out.println("Новая цель по количеству шагов в день: " + goalByStepsPerDay + " шагов");
        }



    void printStatistic(int month) {
        MonthData monthData = new MonthData();
        int[] steps = monthToData[month].stepsFromMonth();
        int sumStepsFromMonth = monthData.sumStepsFromMonth(steps, month);
        System.out.println("Введите число месяца (0 - 11)");
        printMonth();
        System.out.println("Количество пройденных шагов по дням: ");
        monthData.printDaysAndStepsFromMonth(steps);
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + sumStepsFromMonth);
        System.out.println("Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps(steps));
        System.out.println("Среднее количество шагов за месяц: " + monthData.averageSteps(steps));
        System.out.println("Пройденная за месяц дистанции в км: " + converter.stepToKm(sumStepsFromMonth));
        System.out.println("Количество сожжённых килокалорий за месяц: " + converter.StepsToKilocalories(sumStepsFromMonth));
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней: " + monthData.bestSeries(steps));
        System.out.println(); //дополнительный перенос строки
    }
    void printMonth() {
        System.out.println("Январь - 0, .... Декабрь - 11");
    }

}



