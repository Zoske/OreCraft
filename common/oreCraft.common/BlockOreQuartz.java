package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockOreQuartz extends Block
{
    public BlockOreQuartz(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(5F);
        this.setResistance(3F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setBlockName("quartz");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
    	return "/OreCraftBlocks.png";
    }

    public int idDropped(int par1, Random par2Random, int par3) {
    	
        return OreCraft.amethyst.shiftedIndex;
    }
    public int quantityDropped(Random par1Random) {
    	
        return 1;
    }
}