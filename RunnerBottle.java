public class RunnerBottle {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(10);
        System.out.println(bottle.start());
        System.out.println(bottle.drink());
        System.out.println(bottle.empty());
        System.out.println(bottle.full());

    }
}
