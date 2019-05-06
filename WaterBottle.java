public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int start(){
        return volume = 100;
    }

    public int drink(){
        return volume - 10;
    }

    public int empty(){
        return volume = 0;
    }

    public int full(){
        return start();
    }
}
