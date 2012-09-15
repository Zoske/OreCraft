package oreCraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemVoidWand extends ItemPickaxe {
	
	public ItemVoidWand (int ItemID, EnumToolMaterial material) {
		
		super (ItemID, material);
		this.setItemName("voidWand");
		this.setIconIndex(19);	
	}
	
	public String getTextureFile() {
		
		return "/OreCraftItems.png";
	}

	
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        entityliving.isDead = true;
          return false;
    }
	
	/*
	public ItemStack onItemLeftClick (ItemStack is, World w, EntityPlayer ep, World world, double xPos, double yPos, double zPos)
	{
		world.playSoundEffect(xPos, yPos, zPos, "portal.travel", world.rand.nextFloat()*0.2F + 0.8F, world.rand.nextFloat() * 0.2F + 0.8F);
		return null;
	}
	*/

	@SideOnly(Side.CLIENT)

	public EnumRarity getRarity(ItemStack itemstack) {
	          
		return EnumRarity.rare;
	}
}
