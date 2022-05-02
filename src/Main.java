public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 52;
        float height = (float) 1.65;
        float bmi = service.calculate(weight, height);
        System.out.println("Ваш Индекс массы тела: " + bmi);
    }
}
