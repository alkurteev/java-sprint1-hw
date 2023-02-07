public class MonthData {
    int sumSteps = 0;
    int maxSteps = 0;
    int countDaysBestSeries = 0;
    int series = 0;
    double averageSteps = 0;
    int[] days = new int[30];
    int[] stepsFromMonth() {
        return days;
    }

    void printDaysAndStepsFromMonth(int[] stepsByDayPerMonth) {
        // подсчет кол-ва пройденых шагов по дням
        for (int i = 0; i < 30; i++) {
            System.out.print(i + 1 + " день: " + stepsByDayPerMonth[i] + ", ");
        }
    }

    int sumStepsFromMonth(int[] stepsByDayPerMonth, int month) {
        // подсчет суммы шагов месяц

        for (int i = 0; i < 30; i++) {
            sumSteps = sumSteps + stepsByDayPerMonth[i];
        }
        return sumSteps;
    }

    int maxSteps(int[] stepsByDayPerMonth) {
        // максимально кол-во шагов в месяц

        for (int i = 0; i < 30; i++) {
            if (stepsByDayPerMonth[i] > maxSteps) {
            maxSteps = stepsByDayPerMonth[i];
            }
        }
        return maxSteps;
    }
        public double averageSteps(int[] stepsByDayPerMonth) {
        //среднее количество шагов

            for (int i = 0; i < 30; i++) {
                averageSteps = sumSteps / stepsByDayPerMonth.length;
            }
            return averageSteps;
    }
        int bestSeries(int[] stepsByDayPerMonth) {
        // поиск масимальной серии

        for (int i = 0; i < 30; i++) {
            if (stepsByDayPerMonth[i] >= goalByStepsPerDay) {
                ++series;
                if (series > countDaysBestSeries) {
                    countDaysBestSeries = series;
                }
            }else{
                  series = 0;
                }
            }
        return countDaysBestSeries;
            }
        }
