package Items;

import Items.OldVersion.LongBow;

import java.util.Random;

public final class EquipmentFactoryMethod {

    public static IEquipment GetEquipment(EquipmentType equipment, Random randomNumberGenerator) throws Exception {
        IEquipment newEquipment;
        switch (equipment) {
            case LongBow -> newEquipment = new LongBowAdapter(new LongBow(randomNumberGenerator));
            case CynradBow -> newEquipment = new CynradBow(randomNumberGenerator);
            default -> throw new Exception("Not Supported");
        }
        return newEquipment;
    }
}
