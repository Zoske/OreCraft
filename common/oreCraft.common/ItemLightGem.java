package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemLightGem extends Item {
	
	 public ItemLightGem(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("lightGem");
	        this.setIconIndex(2);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/OreCraftItems.png";
	    }
}