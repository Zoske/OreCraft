package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;

public class BlockOreSulphur extends Block
{
    public BlockOreSulphur(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(2F);
        this.setResistance(1F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setBlockName("sulphur");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
    	return "/MoresTexturesBlocks.png";
    }
 
    /** Breaking Sulphur ore blocks you always get gunpowder, but you have a chanse to get Cristallized Coal **/
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par2Random.nextInt(9 - par3 * 3) == 0 ? OreCraft.cCoal.shiftedIndex : Item.gunpowder.shiftedIndex;
    }
    
    
    public int quantityDropped(Random par1Random)
    {
        return 2 + par1Random.nextInt(4);
    }
    
  /*  
    World worldObj = ModLoader.getMinecraftInstance().theWorld;
    
    boolean exploded = false;
    
    private void explode(int x, int y, int z, float meta)
    {
    	if(!exploded)
    	{
	    	exploded = true;
	        worldObj.createExplosion(null, x, y, z, 2F);
    	}
    }
    
    public void onBlockDestroyedByPlayer(World world, int x, int z, int y, float F) {
    	
    	explode(x, y, z, 2F);
    }
    */
    
}