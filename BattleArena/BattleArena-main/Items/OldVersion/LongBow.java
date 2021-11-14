package Items.OldVersion;

import java.time.LocalDateTime;
import java.util.Random;

public class LongBow {

    private Random randomNumberGenerator;
    private static final int strength = 3;

    public LongBow(Random randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public int looseAndHit() {
        int probabilityOfHit = this.haveDayLight() ? 5 : 2;
        return randomNumberGenerator.nextInt(10) < probabilityOfHit ? strength : 0;
    }

    private boolean haveDayLight() {
        int hour = LocalDateTime.now().getHour();
        return hour > 6 && hour < 20;
    }
}
