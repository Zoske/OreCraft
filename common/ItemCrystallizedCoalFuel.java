package oreCraft.common;

import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class ItemCrystallizedCoalFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		 if(fuel.itemID == OreCraft.cCoal.shiftedIndex)
			 return 3000;
		 else
			 return 0;
	}

}
