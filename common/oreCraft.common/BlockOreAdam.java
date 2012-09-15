package oreCraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockOreAdam extends Block
{
    public BlockOreAdam(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(5F);
        this.setResistance(5F);
        this.setStepSound(Block.soundMetalFootstep);
        this.setBlockName("oreAdamantium");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public String getTextureFile()
    {
            return "/OreCraftBlocks.png";
    }
}