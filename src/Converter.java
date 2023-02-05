public class Converter {
    double lenghtStep = 0.00075;
    double calories = 0.05;
    double stepToKm(int sumSteps) {
        double kilometrs =  sumSteps * lenghtStep;
        return (int) kilometrs;
    }
    double StepsToKilocalories(int Sumsteps) {
        double kilocalories =  sumSteps * calories;
        return (int) kilocalories;
    }
}
