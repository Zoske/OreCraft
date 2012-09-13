package oreCraft.common;

import common.lib.CustomItemRarity;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class ItemCore extends Item {
	
	 public ItemCore(int i) {
	        super(i);
	        maxStackSize = 1;
	        this.setItemName("core");
	        this.setIconIndex(17);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	 
	public String getTextureFile() {
		 
		 return "/MoresTexturesItems.png";
	}
	 
	@SideOnly(Side.CLIENT)
	 
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
	 
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		 return OreCraft.proxy.getCustomRarityType(CustomItemRarity.LIGHTR);
	}

}