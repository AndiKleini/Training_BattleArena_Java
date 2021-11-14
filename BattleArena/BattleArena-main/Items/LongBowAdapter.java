package Items;

import Items.OldVersion.LongBow;
import Pawn.Hero;


public class LongBowAdapter implements IEquipment{
    private LongBow longBow;

    public LongBowAdapter(LongBow longBow) {
        this.longBow = longBow;
    }

    @Override
    public void use(Hero other) {
        other.reduceHealth(longBow.looseAndHit());
    }
}
