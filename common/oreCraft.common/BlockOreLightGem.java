package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockOreLightGem extends Block
{
    public BlockOreLightGem(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(2F);
        this.setResistance(2F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setLightValue(0.6F);
        this.setBlockName("oreLightgGem");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile() {
    	
    	return "/OreCraftBlocks.png";
    }
    
    public int idDropped(int par1, Random par2Random, int par3) {
    	
    	return OreCraft.lightGem.shiftedIndex;
    }

	public int quantityDropped(Random par1Random) {
		
		return par1Random.nextInt(2) + 1;
	}
}