public class Converter {
    double lenghtStep = 0.00075;
    double calories = 0.05;
    public double stepToKm(int step) {
        double kilometrs =  step * lenghtStep;
        return (int) kilometrs;
    }
    public double StepsToKilocalories(int step) {
        double kilocalories =  step * calories;
        return (int) kilocalories;
    }
}
