package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemAmethyst extends Item {
	
	 public ItemAmethyst(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("amethyst");
	        this.setIconIndex(4);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/OreCraftItems.png";
	    }
}