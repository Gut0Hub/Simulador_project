import java.util.Random;

public class SensorSimulado {
    private Random random = new Random();

    public float getTemperatura() {
        return 20 + random.nextFloat() * 15; // 20°C a 35°C
    }

    public float getUmidade() {
        return 40 + random.nextFloat() * 40; // 40% a 80%
    }

    public int getLuminosidade() {
        return random.nextInt(1024); // 0 a 1023
    }
}
