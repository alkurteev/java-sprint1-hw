public class MonthData {
    int sumSteps = 0;
    int maxSteps = 0;
    int bestSession = 0;
    int countBest = 0;
    double averageSteps = 0;
    int[] days = new int[30];
    int[] stepsFromMonth() {
        return days;
    }

    void printDaysAndStepsFromMonth(int[] days) {
        // подсчет кол-ва пройденых шагов по дням
        for (int i = 0; i < 30; i++) {
            System.out.print(i + 1 + " день: " + days[i] + ", ");
        }
    }

    int sumStepsFromMonth(int[] days, int month) {
        // подсчет суммы шагов месяц

        for (int i = 0; i < 30; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxSteps(int[] days) {
        // максимально кол-во шагов в месяц

        for (int i = 0; i < 30; i++) {
            if (days[i] > maxSteps) {
            maxSteps = days[i];
            }
        }
        return maxSteps;
    }
        public double averageSteps(int[] days) {
        //среднее количество шагов

            for (int i = 0; i < 30; i++) {
                averageSteps = sumSteps / days.length;
            }
            return averageSteps;
    }
        int bestSeries(int goalByStepsPerDay) {
        // поиск масимальной серии

        for (int i = 0; i < 30; i++) {
            if (days[i] >= goalByStepsPerDay) {
                bestSession++;
                if (bestSession > countBest) {
                    countBest = bestSession;
                }
                if (countBest < bestSession) {
                    countBest = bestSession;
                }
            } else {
                bestSession = 0;
            }
        }
        return countBest;
            }
        }
