package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BlockDyte extends Block
{
    public BlockDyte(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setHardness(3F);
        this.setResistance(2F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setBlockName("dyte");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
    	return "/MoresTexturesBlocks.png";
    }
    
    public int quantityDropped (Random random) {
    	
        return 1 + random.nextInt(2);
}


public int getItemDamage() {

        return getItemDamage();
}

public int damageDropped(int i, ItemStack ItemStack) {
	
        return getItemDamage();
}

@Override
protected int damageDropped( int i ) {
	Random random = new Random();
    i = random.nextInt(16);
    
    if(i == 1){
    	return 1;
    }else if(i == 2){
    	return 2;
    }else if(i == 3){
    	return 3;
    }else if(i == 4){
    	return 4;
    }else if(i == 5){
    	return 5;
    }else if(i == 6){
    	return 6;
    }else if(i == 7){
    	return 7;
    }else if(i == 8){
    	return 8;
    }else if(i == 9){
    	return 9;
    }else if(i == 10){
    	return 10;
    }else if(i == 11){
    	return 11;
    }else if(i == 12){
    	return 12;
    }else if(i == 13){
    	return 13;
    }else if(i == 14){
    	return 14;
    }else if(i == 15){
    	return 15;
    }else{
    	return 16;
    }
}

	@Override
	public int idDropped( int i, Random random, int j ) {
		return Item.dyePowder.shiftedIndex;
	}
}