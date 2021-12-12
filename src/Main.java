public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(7800);
        System.out.println("Итого Вам начислено " + bonusMiles + " миль");
    }
}