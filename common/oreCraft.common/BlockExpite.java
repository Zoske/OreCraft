package oreCraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityXPOrb;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockExpite extends Block
{
    public BlockExpite(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(3F);
        this.setResistance(2F);
        this.setStepSound(Block.soundGlassFootstep);
        this.setLightValue(0.1F);
        this.setBlockName("expite");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
    		return "/MoresTexturesBlocks.png";
    }
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            EntityXPOrb entityxporb = new EntityXPOrb(par1World);
            entityxporb.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            par1World.spawnEntityInWorld(entityxporb);
        }

        super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
    }
}