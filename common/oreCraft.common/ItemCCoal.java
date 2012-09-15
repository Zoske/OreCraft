package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemCCoal extends Item {
	
	 public ItemCCoal(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("cCoal");
	        this.setIconIndex(5);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/OreCraftItems.png";
	    }
}