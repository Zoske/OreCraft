package oreCraft.common;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorAdam implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
		IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		 	switch (world.provider.worldType) {
		 	
		 	case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		 	case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		 	}
		 }
			private void generateSurface(World world, Random random, int blockX, int blockZ) 
		 {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(20);
			int Zcoord = blockZ + random.nextInt(16);
			  
			  (new WorldGenMinable(OreCraft.oreAdamantium.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
		 
			int Xcoord1 = blockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(64);
			int Zcoord1 = blockZ + random.nextInt(16);
			   
			 (new WorldgeneratorCrypt()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		 
		 }
		 private void generateNether(World world, Random random, int blockX, int blockZ) 
		 {
			 
		 }

	}

