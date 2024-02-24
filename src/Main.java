public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("Ваш индекс массы тела равен: " + (int) service.calculate(98, 1.98));

        System.out.println();
        System.out.println("Ваш индекс массы тела равен: " + (int) service.calculate(76, 1.58));

        System.out.println();
        System.out.println("Ваш индекс массы тела равен: " + (int) service.calculate(58, 1.88));


    }
}
