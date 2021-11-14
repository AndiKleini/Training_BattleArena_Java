package screamobserver;

public interface IDamageCausedSubject {
    void subscribeTo(IDamageCausedObserver notifyMeWhenDamageCaused);
    void unsubscribeFrom(IDamageCausedObserver notifyMeWhenDamageCaused);
}
