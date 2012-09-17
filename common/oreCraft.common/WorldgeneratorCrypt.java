/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/
package oreCraft.common;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class WorldgeneratorCrypt extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			Block.stone.blockID,
			Block.oreIron.blockID,
			Block.oreCoal.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public WorldgeneratorCrypt() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 0, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, 0);
		world.setBlock(i + 1, j + 1, k + 2, 0);
		world.setBlock(i + 1, j + 1, k + 3, 0);
		world.setBlock(i + 1, j + 1, k + 4, 0);
		world.setBlock(i + 1, j + 1, k + 5, 0);
		world.setBlock(i + 1, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, 0);
		world.setBlock(i + 1, j + 2, k + 2, 0);
		world.setBlock(i + 1, j + 2, k + 3, 0);
		world.setBlock(i + 1, j + 2, k + 4, 0);
		world.setBlock(i + 1, j + 2, k + 5, 0);
		world.setBlock(i + 1, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 3, k + 1, 0);
		world.setBlock(i + 1, j + 3, k + 2, 0);
		world.setBlock(i + 1, j + 3, k + 3, 0);
		world.setBlock(i + 1, j + 3, k + 4, 0);
		world.setBlock(i + 1, j + 3, k + 5, 0);
		world.setBlock(i + 1, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 4, k + 1, 0);
		world.setBlock(i + 1, j + 4, k + 2, 0);
		world.setBlock(i + 1, j + 4, k + 3, 0);
		world.setBlock(i + 1, j + 4, k + 4, 0);
		world.setBlock(i + 1, j + 4, k + 5, 0);
		world.setBlock(i + 1, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 1, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, 0);
		world.setBlock(i + 2, j + 1, k + 2, 0);
		world.setBlockAndMetadata(i + 2, j + 1, k + 3, Block.chest.blockID, 5);
		world.setBlock(i + 2, j + 1, k + 4, 0);
		world.setBlock(i + 2, j + 1, k + 5, 0);
		world.setBlock(i + 2, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 2, k + 1, 0);
		world.setBlock(i + 2, j + 2, k + 2, 0);
		world.setBlock(i + 2, j + 2, k + 3, 0);
		world.setBlock(i + 2, j + 2, k + 4, 0);
		world.setBlock(i + 2, j + 2, k + 5, 0);
		world.setBlock(i + 2, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 3, k + 1, 0);
		world.setBlock(i + 2, j + 3, k + 2, 0);
		world.setBlock(i + 2, j + 3, k + 3, 0);
		world.setBlock(i + 2, j + 3, k + 4, 0);
		world.setBlock(i + 2, j + 3, k + 5, 0);
		world.setBlock(i + 2, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 4, k + 1, 0);
		world.setBlock(i + 2, j + 4, k + 2, 0);
		world.setBlock(i + 2, j + 4, k + 3, 0);
		world.setBlock(i + 2, j + 4, k + 4, 0);
		world.setBlock(i + 2, j + 4, k + 5, 0);
		world.setBlock(i + 2, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 2, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 1, k + 1, 0);
		world.setBlock(i + 3, j + 1, k + 2, 0);
		world.setBlock(i + 3, j + 1, k + 3, 0);
		world.setBlock(i + 3, j + 1, k + 4, 0);
		world.setBlock(i + 3, j + 1, k + 5, 0);
		world.setBlock(i + 3, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 2, k + 1, 0);
		world.setBlock(i + 3, j + 2, k + 2, 0);
		world.setBlock(i + 3, j + 2, k + 3, 0);
		world.setBlock(i + 3, j + 2, k + 4, 0);
		world.setBlock(i + 3, j + 2, k + 5, 0);
		world.setBlock(i + 3, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 3, k + 1, 0);
		world.setBlock(i + 3, j + 3, k + 2, 0);
		world.setBlock(i + 3, j + 3, k + 3, 0);
		world.setBlock(i + 3, j + 3, k + 4, 0);
		world.setBlock(i + 3, j + 3, k + 5, 0);
		world.setBlock(i + 3, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 4, k + 1, 0);
		world.setBlock(i + 3, j + 4, k + 2, 0);
		world.setBlock(i + 3, j + 4, k + 3, 0);
		world.setBlock(i + 3, j + 4, k + 4, 0);
		world.setBlock(i + 3, j + 4, k + 5, 0);
		world.setBlock(i + 3, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 3, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 1, k + 1, 0);
		world.setBlock(i + 4, j + 1, k + 2, 0);
		world.setBlock(i + 4, j + 1, k + 3, 0);
		world.setBlock(i + 4, j + 1, k + 4, 0);
		world.setBlock(i + 4, j + 1, k + 5, 0);
		world.setBlock(i + 4, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 2, k + 1, 0);
		world.setBlock(i + 4, j + 2, k + 2, 0);
		world.setBlock(i + 4, j + 2, k + 3, 0);
		world.setBlock(i + 4, j + 2, k + 4, 0);
		world.setBlock(i + 4, j + 2, k + 5, 0);
		world.setBlock(i + 4, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 3, k + 1, 0);
		world.setBlock(i + 4, j + 3, k + 2, 0);
		world.setBlock(i + 4, j + 3, k + 3, 0);
		world.setBlock(i + 4, j + 3, k + 4, 0);
		world.setBlock(i + 4, j + 3, k + 5, 0);
		world.setBlock(i + 4, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 4, k + 1, 0);
		world.setBlock(i + 4, j + 4, k + 2, 0);
		world.setBlock(i + 4, j + 4, k + 3, 0);
		world.setBlock(i + 4, j + 4, k + 4, 0);
		world.setBlock(i + 4, j + 4, k + 5, 0);
		world.setBlock(i + 4, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 4, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 1, k + 1, 0);
		world.setBlock(i + 5, j + 1, k + 2, 0);
		world.setBlock(i + 5, j + 1, k + 3, 0);
		world.setBlock(i + 5, j + 1, k + 4, 0);
		world.setBlock(i + 5, j + 1, k + 5, 0);
		world.setBlock(i + 5, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 2, k + 1, 0);
		world.setBlock(i + 5, j + 2, k + 2, 0);
		world.setBlock(i + 5, j + 2, k + 3, 0);
		world.setBlock(i + 5, j + 2, k + 4, 0);
		world.setBlock(i + 5, j + 2, k + 5, 0);
		world.setBlock(i + 5, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 3, k + 1, 0);
		world.setBlock(i + 5, j + 3, k + 2, 0);
		world.setBlock(i + 5, j + 3, k + 3, 0);
		world.setBlock(i + 5, j + 3, k + 4, 0);
		world.setBlock(i + 5, j + 3, k + 5, 0);
		world.setBlock(i + 5, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 4, k + 1, 0);
		world.setBlock(i + 5, j + 4, k + 2, 0);
		world.setBlock(i + 5, j + 4, k + 3, 0);
		world.setBlock(i + 5, j + 4, k + 4, 0);
		world.setBlock(i + 5, j + 4, k + 5, 0);
		world.setBlock(i + 5, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 5, j + 5, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 0, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 1, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 1, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 1, k + 2, 0);
		world.setBlock(i + 6, j + 1, k + 3, 0);
		world.setBlock(i + 6, j + 1, k + 4, 0);
		world.setBlock(i + 6, j + 1, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 1, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 2, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 2, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 2, k + 2, 0);
		world.setBlock(i + 6, j + 2, k + 3, 0);
		world.setBlock(i + 6, j + 2, k + 4, 0);
		world.setBlock(i + 6, j + 2, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 2, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 3, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 4, k + 6, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 0, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 1, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 2, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 3, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 4, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 5, OreCraft.blockDarkstone.blockID);
		world.setBlock(i + 6, j + 5, k + 6, OreCraft.blockDarkstone.blockID);

		return true;
	}
}