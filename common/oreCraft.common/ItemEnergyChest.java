package oreCraft.common;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Potion;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemEnergyChest extends ItemArmor implements IArmorTextureProvider{

	public ItemEnergyChest(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		
		super(par1, par2EnumArmorMaterial, par3, par4);
		//this.setPotionEffect(Potion.heal.id, 100, 2, 1.0F);
		this.setItemName("energyChest");
		this.setIconIndex(33);
	}
	public String getArmorTextureFile (ItemStack par1) {
		if(par1.itemID == OreCraft.adamHat.shiftedIndex || par1.itemID == OreCraft.energyChest.shiftedIndex || par1.itemID == OreCraft.energyBoots.shiftedIndex) {
				return "/armor/energy_1.png";
		} if (par1.itemID == OreCraft.adamLegs.shiftedIndex) {
				return  "/armor/adamantium_2.png";
		}	return "/armor/adamantium_2.png";
	}
	
	@SideOnly(Side.CLIENT)
	 
    public boolean hasEffect(ItemStack itemstack)
    {
            return true;
    }
    public EnumRarity getRarity(ItemStack itemstack)
    {
            return EnumRarity.rare;
    }
	
	public String getTextureFile() {
		return "/OreCraftItems.png";
	}
}
