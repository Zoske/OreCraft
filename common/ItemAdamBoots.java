package oreCraft.common;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

import common.lib.CustomItemRarity;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemAdamBoots extends ItemArmor  implements IArmorTextureProvider{

	public ItemAdamBoots(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setItemName("adamBoots");
		this.setIconIndex(64);
	}
	public String getArmorTextureFile (ItemStack par1) {
		if(par1.itemID == OreCraft.adamHat.shiftedIndex || par1.itemID == OreCraft.adamChest.shiftedIndex || par1.itemID == OreCraft.adamBoots.shiftedIndex) {
				return "/armor/adamantium_1.png";
		} if (par1.itemID == OreCraft.adamLegs.shiftedIndex) {
				return  "/armor/adamantium_2.png";
		}	return "/armor/adamantium_2.png";
	}
	@SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) {
	 return OreCraft.proxy.getCustomRarityType(CustomItemRarity.CYAN);
    }
	
	public String getTextureFile() {
		return "/MoresTexturesItems.png";
	}
}
