public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        // подсчет кол-ва пройденых шагов по дням
        for (int i = 0; i < 30; i++) {
            System.out.print(i + 1 + " день: " + days[i] + ", ");
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
        double averageSteps = 0;
                for (int i = 0; i < 30; i++) {
            averageSteps += days[i];
        }
        return averageSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        // поиск масимальной серии
        int bestSession = 0;
        int countBest = 0;
        for (int i = 0; i < 30; i++) {
            if (days[i] >= goalByStepsPerDay) {
                bestSession++;
            } else {
                if (bestSession > countBest) {
                    countBest = bestSession;
                }
                bestSession = 0;
            }
        }
        if (bestSession > countBest) {
            countBest = bestSession;
        }
        return countBest;
    }
}

