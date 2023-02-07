public class Converter {
    double lenghtStep = 0.00075;
    double calories = 0.05;
    double stepToKm(int steps) {
        double kilometrs =  steps * lenghtStep;
        return kilometrs;
    }
    double StepsToKilocalories(int steps) {
        double kilocalories =  steps * calories;
        return kilocalories;
    }
}
