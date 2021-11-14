package screamobserver;

public class PainFulScreamObserver implements IDamageCausedObserver {
    @Override
    public void notifyDamage(int hitCount) {
        String scream;
        if (hitCount < 2) {
            scream = "Autsch";
        } else if (hitCount < 5 && hitCount > 2) {
            scream = "Ahhhhh that's bad";
        } else {
            scream = "Help I need a doctor";
        }
        System.out.println(scream);
    }
}
