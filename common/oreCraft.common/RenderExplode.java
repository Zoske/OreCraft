package oreCraft.common;

import net.minecraft.src.Entity;
import net.minecraft.src.Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RenderExplode extends Render {

	public void RenderElements()
	{

	}
	/**
	* Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	* handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	* (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	* double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	*/
	
	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
		// TODO Auto-generated method stub
		
	}
}