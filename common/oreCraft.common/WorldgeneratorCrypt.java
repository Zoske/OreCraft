package oreCraft.common;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorCrypt implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
		IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		 	switch (world.provider.worldType) {
		 	
		 	case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		 	case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		 	}
		 }
			private void generateSurface(World world, Random rand, int x, int z) 
		 {
				for (int c = 0; c< 12; c++) {
		    		int RandPosX = x + rand.nextInt(16);
		    		int RandPosZ = z + rand.nextInt(16);
		    		int RandPosY = rand.nextInt(200);
		    		(new WorldGenCrypt()).generate(world, rand, RandPosX, RandPosZ, RandPosY);
		    	}
		 }
		 
		 private void generateNether(World world, Random random, int blockX, int blockZ) 
		 {
			 
		 }

	}

