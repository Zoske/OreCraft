package oreCraft.common;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockAdamantium extends Block
{
    public BlockAdamantium(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(10F);
        this.setResistance(8F);
        this.setStepSound(Block.soundMetalFootstep);
        this.setBlockName("blockAdam");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
            return "/MoresTexturesBlocks.png";
    }
    
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5, EntityPlayer player) {
    	player.worldObj.createExplosion(player, player.posX, player.posY, player.posZ, 3.0F);
    }
}