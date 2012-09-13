package oreCraft.common;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityExplode extends Entity {
	
	public EntityExplode(World par1World) {
		super(par1World);
	}

	public int detonateDelay = 0;
	
	// Definitly wrong here
	
	public void onLiving() {
		detonateDelay++;
		if(detonateDelay >= 1) {
			this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 1.0F);
		}	
	}
	

	@Override
	protected void entityInit() {

	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1) {
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1) {
		
	}
}