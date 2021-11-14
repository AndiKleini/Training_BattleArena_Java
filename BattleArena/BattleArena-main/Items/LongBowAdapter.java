package Items;

import Items.OldVersion.LongBow;
import Pawn.Hero;

public class LongBowAdapter implements IEquipment {

    private LongBow longBowLegacyInstance;

    public LongBowAdapter(LongBow longBowLegacyInstance) {
        this.longBowLegacyInstance = longBowLegacyInstance;
    }

    @Override
    public void use(Hero other) {
        int damage = this.longBowLegacyInstance.looseAndHit();
        other.reduceHealth(damage);
    }
}
