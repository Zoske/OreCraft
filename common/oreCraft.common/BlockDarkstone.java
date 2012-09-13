package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockDarkstone extends Block {
	
    public BlockDarkstone(int par1, int par2) {
    	
        super(par1, par2, Material.rock);
        this.setHardness(4F);
        this.setResistance(5F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setLightValue(0.8F);
        this.setBlockName("oreDarkstone");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

        if (par5Random.nextInt(75) == 0)
        {
            par1World.spawnParticle("depthsuspend", (float)par2 + par5Random.nextFloat(), (float)par3 + 1.5F, (float)par4 + par5Random.nextFloat(), 20.0D, 20.0D, 20.0D);
        }
    }
    
    public String getTextureFile() {
    	
            return "/MoresTexturesBlocks.png";
    }
}