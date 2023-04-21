// BMI = m / ( h * h )
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyWeight = 98; // в кг.
        double bodyHeight = 187; // в см.
        double bmi = service.calculate(bodyWeight, bodyHeight);
        String bmiResult = String.format("%.1f", bmi);
        System.out.println("Индекс массы вашего тела " + bmiResult);
        if (bmi < 20) {
            System.out.println("Надо кушать!");
        } else {
            if (bmi < 25) {
                System.out.println("Ты умничка, так держать!");
            } else {
                if (bmi < 30) {
                    System.out.println("Есть небольшие излишки массы!");
                } else {
                    System.out.println("Пора худеть, ты состоишь из жира!");
                }
            }
        }
    }
}