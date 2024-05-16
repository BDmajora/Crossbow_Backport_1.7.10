package micdoodle8.mods.crossbowmod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class CrossbowItems
{
    public static ItemWoodCrossbow woodenCrossbowBase;

    public static Item attachmentLimbBolt;

    public static void initItems()
    {
        CrossbowItems.woodenCrossbowBase = (ItemWoodCrossbow) new ItemWoodCrossbow().setUnlocalizedName("woodenCrossbow").setMaxStackSize(1);

        GameRegistry.registerItem(CrossbowItems.woodenCrossbowBase, CrossbowItems.woodenCrossbowBase.getUnlocalizedName());
    }
}
