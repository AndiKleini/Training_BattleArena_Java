package Items;

import Items.OldVersion.LongBow;

import java.util.Random;

public final class EquipmentFactoryMethod {
    public static IEquipment create(EquipmentType equipmentType) throws Exception {
        switch (equipmentType) {
            case CynradBow -> {return new CynradBow(new Random());}
            case LongBow -> {return new LongBowAdapter(new LongBow(new Random()));}
            default -> throw new Exception("Not supported");
        }
    }
}
