package screamobserver;

import java.util.ArrayList;
import java.util.List;

public abstract class DamageCausedSubjectBase implements IDamageCausedSubject {

    private List<IDamageCausedObserver> observers = new ArrayList<IDamageCausedObserver>();

    protected void notifyHit(int hitCount) {
        this.observers.stream().forEach(s -> s.notifyDamage(hitCount));
    }

    @Override
    public void subscribeTo(IDamageCausedObserver notifyMeWhenDamageCaused) {
        this.observers.add(notifyMeWhenDamageCaused);
    }

    @Override
    public void unsubscribeFrom(IDamageCausedObserver notifyMeWhenDamageCaused) {
        this.observers.remove(notifyMeWhenDamageCaused);
    }
}
