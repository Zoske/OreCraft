package oreCraft.common;

import java.util.Random;
import java.io.PrintStream;

import net.minecraft.src.Block;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;
 
public class WorldGenCrypt extends WorldGenerator {
	
	public WorldGenCrypt() {}
   
	public boolean generateC(World world, Random rand, int x, int y, int z) {
	   
		if(world.getBlockId(x, y, z)!= Block.leaves.blockID || world.getBlockId(x, y + 1, z)!= 0) {
				
			return false;
		}
		
			int block = OreCraft.blockDarkstone.blockID;
			int test = Block.cobblestone.blockID;                       
			
			for (int i = 0; i<5; i++) {
				
				world.setBlockWithNotify(x + i, y, z, block); // x
				world.setBlockWithNotify(x, y + i, z, block); // y
                world.setBlockWithNotify(x, y, z + i, block); // z
			}
			
			for (int i = 0; i<5; i++) {
                world.setBlockWithNotify(x + i, y + 1, z, block); // xy
                world.setBlockWithNotify(x + i, y + 2, z, block);
                world.setBlockWithNotify(x + i, y + 3, z, block);
                world.setBlockWithNotify(x + i, y + 4, z, block);
                world.setBlockWithNotify(x + i, y + 5, z, block);
			}
			for (int i = 0; i<5; i++) {
                world.setBlockWithNotify(x + i, y + 1, z + 5, block); // xy (front)
                world.setBlockWithNotify(x + i, y + 2, z + 5, block);
                world.setBlockWithNotify(x + i, y + 3, z + 5, block);
                world.setBlockWithNotify(x + i, y + 4, z + 5, block);
                world.setBlockWithNotify(x + i, y + 5, z + 5, block);
			}
			for (int i = 0; i<5; i++) {
                world.setBlockWithNotify(x + i, y, z + 1, block); // xz 
                world.setBlockWithNotify(x + i, y, z + 2, block); 
                world.setBlockWithNotify(x + i, y, z + 3, block); 
                world.setBlockWithNotify(x + i, y, z + 4, block); 
                world.setBlockWithNotify(x + i, y, z + 5, block); 
			}
			for (int i = 0; i<5; i++) {
                world.setBlockWithNotify(x + i, y + 5, z + 1, block); // xz (ceiling)
                world.setBlockWithNotify(x + i, y + 5, z + 2, block);
                world.setBlockWithNotify(x + i, y + 5, z + 3, block);
                world.setBlockWithNotify(x + i, y + 5, z + 4, block);
			}
   //         for (int i = 0; i<5; i++) {
    //        	world.setBlockWithNotify(x, y + i, z + 1, block);
   //         	world.setBlockWithNotify(x, y + i, z + 2, block);
   //         	world.setBlockWithNotify(x, y + i, z + 3, block);
    //        	world.setBlockWithNotify(x, y + i, z + 4, block);
    //            }  
   //        for (int i = 0; i<5; i++) {
           // 	world.setBlockWithNotify(x + 5, y + i, z + 1, block);
            //	world.setBlockWithNotify(x + 5, y + i, z + 2, block);
           // 	world.setBlockWithNotify(x + 5, y + i, z + 3, block);
            //	world.setBlockWithNotify(x + 5, y + i, z + 4, block);
             //   } 

				// Air Filling //
	            
				world.setBlockWithNotify(x + 1, y + 1, z + 1, test); 
				world.setBlockWithNotify(x + 1, y + 1, z + 2, test);
				world.setBlockWithNotify(x + 1, y + 1, z + 3, test);
				world.setBlockWithNotify(x + 1, y + 1, z + 4, test);

				world.setBlockWithNotify(x + 2, y + 1, z + 1, test);
				world.setBlockWithNotify(x + 3, y + 1, z + 1, test);
				
			
         return true;
	}

	@Override
	public boolean generate(World var1, Random var2, int var3, int var4,
			int var5) {
		// TODO Auto-generated method stub
		return false;
	}  
}