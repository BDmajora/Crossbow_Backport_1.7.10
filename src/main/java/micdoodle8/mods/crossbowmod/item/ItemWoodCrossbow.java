package micdoodle8.mods.crossbowmod.item;

import java.util.List;
import micdoodle8.mods.crossbowmod.CrossbowModCore;
import micdoodle8.mods.crossbowmod.entity.EntityBolt;
import micdoodle8.mods.crossbowmod.entity.EntityWoodBolt;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWoodCrossbow extends ItemCrossbow
{
    public ItemWoodCrossbow()
    {
        super();
        CrossbowModCore.woodenCrossbowsList.add(this);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(ItemCrossbow.setAttachmentAndMaterial(new ItemStack(par1, 1, 0), EnumAttachmentType.none, EnumCrossbowMaterial.wooden, EnumCrossbowFireRate.none));
        par3List.add(ItemCrossbow.setAttachmentAndMaterial(new ItemStack(par1, 1, 0), EnumAttachmentType.none, EnumCrossbowMaterial.wooden, EnumCrossbowFireRate.tri));
        }

    @Override
    public EntityBolt getEntity(World world, EntityLivingBase entityliving, float f)
    {
        return new EntityWoodBolt(world, entityliving, 0.75F, f);
    }

    @Override
    public EntityBolt getEntity(World world, EntityLivingBase entityliving)
    {
        return new EntityWoodBolt(world, entityliving, 0.75F, 0.0F);
    }

    @Override
    public int getCrossbowMaxDamage()
    {
        return 60;
    }

    @Override
    public int getReloadTime()
    {
        return 12;
    }

    @Override
    public int requiredMetadata(EntityLivingBase entityliving)
    {
        return 0;
    }

    @Override
    public String getSpriteSheetLoc()
    {
        return "/micdoodle8/mods/crossbowmod/resources/gui/wood.png";
    }

    @Override
    public String getShortName()
    {
        return "wood";
    }
}
