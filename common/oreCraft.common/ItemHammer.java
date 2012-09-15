package oreCraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemHammer extends ItemPickaxe {
	
	public ItemHammer (int ItemID, EnumToolMaterial material) {
		
		super (ItemID, material);
		this.setItemName("hammer");
		this.setIconIndex(18);
		
	}
	
	public String getTextureFile() {
		
		return "/OreCraftItems.png";
	}
	 
	public boolean canHarvestBlock(Block par1Block) {
		
		return par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (par1Block != Block.blockDiamond && par1Block != Block.oreDiamond ? (par1Block == Block.oreEmerald ? this.toolMaterial.getHarvestLevel() >= 3 : (par1Block != Block.blockGold && par1Block != Block.oreGold ? (par1Block != Block.blockSteel && par1Block != Block.oreIron ? (par1Block != Block.blockLapis && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true : par1Block.blockMaterial == Material.iron) : this.toolMaterial.getHarvestLevel() >= 3) : this.toolMaterial.getHarvestLevel() >= 3) : this.toolMaterial.getHarvestLevel() >= 3) : this.toolMaterial.getHarvestLevel() >= 3)) : this.toolMaterial.getHarvestLevel() >= 3);
	}
	 
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		
		if(par2Block.blockID == Block.obsidian.blockID || par2Block.blockID == Block.leaves.blockID || par2Block.blockID == OreCraft.quartz.blockID || par2Block.blockID == Block.stoneOvenActive.blockID || par2Block.blockID == Block.stoneOvenIdle.blockID || par2Block.blockID == Block.sand.blockID || par2Block.blockID == Block.gravel.blockID || par2Block.blockID == Block.grass.blockID || par2Block.blockID == Block.dirt.blockID || par2Block.blockID == OreCraft.blockAdam.blockID || par2Block.blockID == OreCraft.oreAdamantium.blockID || par2Block.blockID == OreCraft.dyte.blockID || par2Block.blockID == OreCraft.oreLightGem.blockID || par2Block.blockID == Block.fence.blockID || par2Block.blockID == Block.fenceGate.blockID || par2Block.blockID == Block.fenceIron.blockID || par2Block.blockID == Block.blockClay.blockID || par2Block.blockID == Block.blockDiamond.blockID || par2Block.blockID == Block.blockEmerald.blockID || par2Block.blockID == Block.cocoa.blockID || par2Block.blockID == Block.bookShelf.blockID || par2Block.blockID == Block.blockSnow.blockID || par2Block.blockID == Block.brick.blockID || par2Block.blockID == Block.cactus.blockID || par2Block.blockID == Block.cauldron.blockID || par2Block.blockID == Block.enderChest.blockID || par2Block.blockID == Block.doorWood.blockID || par2Block.blockID == Block.doorSteel.blockID || par2Block.blockID == Block.vine.blockID || par2Block.blockID == Block.cobblestoneMossy.blockID || par2Block.blockID == Block.dispenser.blockID || par2Block.blockID == Block.workbench.blockID || par2Block.blockID == Block.blockGold.blockID || par2Block.blockID == Block.blockSteel.blockID || par2Block.blockID == Block.sandStone.blockID || par2Block.blockID == Block.slowSand.blockID || par2Block.blockID == Block.netherrack.blockID || par2Block.blockID == Block.wood.blockID || par2Block.blockID == Block.woodDoubleSlab.blockID || par2Block.blockID == Block.woodSingleSlab.blockID || par2Block.blockID == OreCraft.blockDarkstone.blockID || par2Block.blockID == OreCraft.expite.blockID || par2Block.blockID == Block.oreLapis.blockID || par2Block.blockID == Block.blockLapis.blockID || par2Block.blockID == Block.cobblestone.blockID || par2Block.blockID == Block.stone.blockID || par2Block.blockID == Block.glowStone.blockID || par2Block.blockID == Block.glass.blockID ) {
			
			return 100F;
	} else
		return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
	}

	@SideOnly(Side.CLIENT)
	 
	public boolean hasEffect(ItemStack itemstack) {
		
		return true;
	}
	
	public EnumRarity getRarity(ItemStack itemstack) {
	          
		return EnumRarity.rare;
	}
}
