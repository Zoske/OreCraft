package oreCraft.common;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemIronStick extends Item {
	
	 public ItemIronStick(int i) {
	        super(i);
	        maxStackSize = 64;
	        this.setItemName("ironStick");
	        this.setIconIndex(1);
	        this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	    }
	 public String getTextureFile() {
		 
	            return "/OreCraftItems.png";
	    }
}