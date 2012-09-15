package oreCraft.common;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityExplode extends Entity
	{
	public int explode;

	public EntityExplode(World world, EntityLiving entityliving)
	{
		super(world);
		setSize(2.0F, 2.0F);
		explode = 0;
	}

	protected void entityInit()
	{
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate()
	{
		super.onUpdate();
		explode++;
		if(explode >= 1)
		{
			this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 3.0F);
			setDead();
		}
	}

	/**
	* (abstract) Protected helper method to write subclass entity data to NBT.
	*/
	public void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
	}

/**
* (abstract) Protected helper method to read subclass entity data from NBT.
*/
	public void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
	}

	public float getCollisionBorderSize()
	{
		return 2.0F;
	}

	public float getShadowSize()
	{
		return 0.0F;
	}

}