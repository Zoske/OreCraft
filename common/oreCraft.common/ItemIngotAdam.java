package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemIngotAdam extends Item {
	
	 public ItemIngotAdam(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("ingotAdamantium");
	        this.setIconIndex(3);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/MoresTexturesItems.png";
	    }
}