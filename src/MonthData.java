public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        // подсчет кол-ва пройденых шагов по дням
        for (int i = 0; i < 30; i++) {
            System.out.println("(i + 1) + " день: " + days[i]");
        }
    }

    int sumStepsFromMonth() {
        // подсчет суммы шагов месяц
        int sumSteps = 0;
        for (int i = 0; i < 30; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        // максимально кол-во шагов в месяц
        int maxSteps = 0;
        for (int i = 0; i < 30; i++) {
            if (days[i] > maxSteps) {
            maxSteps = days[i];
            }
        }
        return maxSteps;
    }
        public double averageSteps() {
        //среднее количество шагов
        double sumStepsDouble = sumStepsFromMonth();
        double monthToDataLengthDouble = days[].length;
        return sumStepsDouble / monthToDataLengthDouble;
    }

    int bestSeries(int goalByStepsPerDay) {
        // поиск масимальной серии
        int bestSession = 0;
        int countBest = 0;
        for (int i = 0; i < 30; i++) {
            if (days[i] >= goalByStepsPerDay) & (days[i - 1] >= goalByStepsPerDay) {
                bestSession = bestSession++;
                if (bestSession > countBest) {
                    countBest = bestSession;
                }
            } else {
                bestSession = 1;
            }
        }
        return countBest;
    }
}