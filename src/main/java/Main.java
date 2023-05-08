public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1000000, true);
        System.out.println("2. " + expected + " == ? == " + actual);

        expected = 40;
        actual = service.calculate(4000, false);
        System.out.println("3. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(2000000, false);
        System.out.println("4. " + expected + " == ? == " + actual);


    }
}

