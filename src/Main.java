public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        System.out.println();
        System.out.println("10_000");
        System.out.println(service.calculate(10_000));

        System.out.println();
        System.out.println("0");
        System.out.println(service.calculate(0));

        System.out.println();
        System.out.println("-1_000");
        System.out.println(service.calculate(-1_000));

    }
}