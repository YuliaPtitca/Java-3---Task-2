public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 62;
        double height = 1.72;
        double bmi = service.calculate(weight, height);
        String result = String.format("%.2f",bmi);
        System.out.println( "Ваш индекс массы тела: " + result);
    }

}
