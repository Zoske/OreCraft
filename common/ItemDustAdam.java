package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemDustAdam extends Item {
	
	 public ItemDustAdam(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("dustAdam");
	        this.setIconIndex(0);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/MoresTexturesItems.png";
	    }
}