public class BmiService {
    public double calculate(int bodyWeight, double bodyHeight) {
        double bmi = (bodyWeight / (bodyHeight / 100 * bodyHeight / 100));
        return bmi;
    }

}