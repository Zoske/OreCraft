package oreCraft.common;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Achievement;
import net.minecraft.src.BaseMod;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.Configuration;

@Mod(modid = "OreCraft", name = "OreCraft Mod", version = "0.5.4")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class OreCraft {
	
	@SidedProxy(clientSide = "oreCraft.client.ClientProxy", serverSide = "oreCraft.common.CommonProxy")
	public static CommonProxy proxy;
	
	//private static Minecraft minecraft = ModLoader.getMinecraftInstance();
	//private static boolean jumpKeyDown = false;
	
	public static Block oreAdamantium;
	public static Block blockDarkstone;
	public static Block expite;
	public static Block oreLightGem;
	public static Block blockAdam;
	public static Block dyte;
	public static Block quartz;
	public static Block sulphur;
	
	public static Item dustAdam;
	public static Item ironStick;
	public static Item lightGem;
	public static Item ingotAdam;
	public static Item amethyst;
	public static Item core;
	public static Item cCoal;
	
	public static Item hammer;
	
	public static Item adamHat;
	public static Item adamChest;
	public static Item adamLegs;
	public static Item adamBoots;
	public static Item energyChest;
	public static Item energyBoots;
	
	public static EnumToolMaterial EnumToolMaterialHammer = EnumHelper.addToolMaterial("hammer", 3, 9999, 10.0F, 3, 10);
	public static EnumArmorMaterial EnumArmorMaterialAdam = EnumHelper.addArmorMaterial ("adamArmor", 35, new int[] {4,9,7,5}, 5);
	public static EnumArmorMaterial EnumArmorMaterialEnergy = EnumHelper.addArmorMaterial ("energyArmor", 50, new int[] {1,10,3,6}, 10);
	
	//public static Achievement Notch = (new Achievement(50, "Notch's Power", 5, 5, OreCraft.hammer, null).setSpecial().registerAchievement());

	
	@PreInit
    public void preInit(FMLPreInitializationEvent event) {
            
            Configuration oreCraftConfig = new Configuration(event.getSuggestedConfigurationFile());

            oreCraftConfig.load();
          
            int BlockOreAdamID = oreCraftConfig.getOrCreateBlockIdProperty("oreAdamantium", 150).getInt();
            int BlockDarkstoneID = oreCraftConfig.getOrCreateBlockIdProperty("oreDarkstone", 151).getInt();
            int BlockExpiteID = oreCraftConfig.getOrCreateBlockIdProperty("expite", 152).getInt();
            int BlockOreLightGemID = oreCraftConfig.getOrCreateBlockIdProperty("oreLightGem", 153).getInt();
            int BlockAdamID = oreCraftConfig.getOrCreateBlockIdProperty("blockAdam", 154).getInt();
            int BlockBlockDyteID = oreCraftConfig.getOrCreateBlockIdProperty("dyte", 155).getInt();
            int BlockQuartzID = oreCraftConfig.getOrCreateBlockIdProperty("quartz", 156).getInt();
            int BlockSulphurID = oreCraftConfig.getOrCreateBlockIdProperty("sulphur", 157).getInt();
            
            int ItemDustAdamID = oreCraftConfig.getOrCreateBlockIdProperty("dustAdam", 400).getInt();
            int ItemIronStickID = oreCraftConfig.getOrCreateBlockIdProperty("ironStick", 401).getInt();
            int ItemLightGemID = oreCraftConfig.getOrCreateBlockIdProperty("lightGem", 402).getInt();
            int ItemIngotAdamID = oreCraftConfig.getOrCreateBlockIdProperty("ingotAdamantium", 403).getInt();
            int ItemAmethystID = oreCraftConfig.getOrCreateBlockIdProperty("amethyst", 404).getInt();
            int ItemCoreID = oreCraftConfig.getOrCreateBlockIdProperty("core", 405).getInt();
            int ItemCCoalID = oreCraftConfig.getOrCreateBlockIdProperty("cCoal", 406).getInt();
            
            int ItemHammerID = oreCraftConfig.getOrCreateBlockIdProperty("hammer", 500).getInt();
            
            int ItemAdamHatID = oreCraftConfig.getOrCreateBlockIdProperty("adamHat", 501).getInt();
            int ItemAdamChestID = oreCraftConfig.getOrCreateBlockIdProperty("adamChest", 502).getInt();
            int ItemAdamLegsID = oreCraftConfig.getOrCreateBlockIdProperty("adamLegs", 503).getInt();
            int ItemAdamBootsID = oreCraftConfig.getOrCreateBlockIdProperty("adamBoots", 504).getInt();
            int ItemEnergyChestID = oreCraftConfig.getOrCreateBlockIdProperty("energyChest", 505).getInt();
            int ItemEnergyBootsID = oreCraftConfig.getOrCreateBlockIdProperty("energyBoots", 506).getInt();
            
            oreCraftConfig.save();
            
           // addEMCValues();
    }
	
	@Init
	public void load(FMLInitializationEvent event) {
        
		oreAdamantium = new BlockOreAdam(150, 0);
		blockDarkstone = new BlockDarkstone (151, 1);
        expite = new BlockExpite (152, 2);
        oreLightGem = new BlockOreLightGem (153, 3);
        blockAdam = new BlockAdamantium (154, 4);
        dyte = new BlockDyte (155, 5);
        quartz = new BlockOreQuartz (156, 6);
        sulphur = new BlockOreSulphur (157, 7);
        
        dustAdam = new ItemDustAdam (400);
        ironStick = new ItemIronStick (401);
        lightGem = new ItemLightGem (402);
        ingotAdam = new ItemIngotAdam (403);
        amethyst = new ItemAmethyst (404);
        core = new ItemCore (405);
        cCoal = new ItemCCoal (406);
        
        hammer = new ItemHammer (500, EnumToolMaterialHammer);
		
        adamHat = new ItemAdamHat(501, EnumArmorMaterialAdam, ModLoader.addArmor("adamArmor"), 0);
        adamChest = new ItemAdamChest(502, EnumArmorMaterialAdam, ModLoader.addArmor("adamArmor"), 1);
        adamLegs = new ItemAdamLegs(503, EnumArmorMaterialAdam, ModLoader.addArmor("adamArmor"), 2);
        adamBoots = new ItemAdamBoots(504, EnumArmorMaterialAdam, ModLoader.addArmor("adamArmor"), 3);
        energyChest = new ItemEnergyChest (505, EnumArmorMaterialEnergy, ModLoader.addArmor("energyArmor"), 1);
        energyBoots = new ItemEnergyBoots (506, EnumArmorMaterialEnergy, ModLoader.addArmor("energyArmor"), 3);
       
		
        // Name //
		
		LanguageRegistry.addName(oreAdamantium, "Adamantium Ore");
   	 	LanguageRegistry.addName(blockDarkstone, "Darkstone");
   	 	LanguageRegistry.addName(expite, "Expite");
   	 	LanguageRegistry.addName(oreLightGem, "Light Gem");
   	 	LanguageRegistry.addName(blockAdam, "Block of Adamantium");
   	 	LanguageRegistry.addName(dyte, "Dyte");
   	 	LanguageRegistry.addName(quartz, "Quartz");
   	 	LanguageRegistry.addName(sulphur, "Sulphur");

   	 	LanguageRegistry.addName(dustAdam, "Adamantium Dust");
   	 	LanguageRegistry.addName(ironStick, "Iron Stick");
   	 	LanguageRegistry.addName(lightGem, "Light Dust");
   	 	LanguageRegistry.addName(ingotAdam, "Adamantium Ingot");
   	 	LanguageRegistry.addName(amethyst, "Amethyst");
   	 	LanguageRegistry.addName(core, "Redstone Core");
   	 	LanguageRegistry.addName(cCoal, "Crystallized Coal");
   	 	
   	 	LanguageRegistry.addName(hammer, "Notch's Hammer");
   	 	
   	 	LanguageRegistry.addName(adamHat, "Adamantium Helmet");
   	 	LanguageRegistry.addName(adamChest, "Adamantium Chestplate");
   	 	LanguageRegistry.addName(adamLegs, "Adamantium Leggins");
   	 	LanguageRegistry.addName(adamBoots, "Adamantium Boots");
   	 	LanguageRegistry.addName(energyChest, "Energy Chestplate");
   	 	LanguageRegistry.addName(energyBoots, "Energy Boots");
   	 	
   	 	
   	 	// Register //
   	 	
   	 	GameRegistry.registerBlock(oreAdamantium);
    	GameRegistry.registerBlock(blockDarkstone);
    	GameRegistry.registerBlock(expite);
    	GameRegistry.registerBlock(oreLightGem);
    	GameRegistry.registerBlock(blockAdam);
    	GameRegistry.registerBlock(dyte);
    	GameRegistry.registerBlock(quartz);
    	GameRegistry.registerBlock(sulphur);
   	 	
    	
    	// Recipes //
        
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { "#  ", "#  ", "  ", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { " # ", " # ", "   ", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { "  #", "  #", "   ", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { "   ", "#  ", "#  ", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { "   ", " # ", " # ", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(ironStick), new Object[] { "   ", "  #", "  #", '#', Item.ingotIron });
    	GameRegistry.addRecipe(new ItemStack(blockAdam), new Object[] { "###", "###", "###", '#', ingotAdam });
    	GameRegistry.addRecipe(new ItemStack(Block.glowStone), new Object[] {"XXX", "XXX", "XXX", 'X', lightGem});
    	GameRegistry.addRecipe(new ItemStack(blockDarkstone, 8), new Object[] {"XXX", "X#X", "XXX", 'X', Block.obsidian, '#', lightGem});
    	GameRegistry.addRecipe(new ItemStack(hammer), new Object[] {"XXX", "XOX", " S ", 'X', ingotAdam, 'S', ironStick, 'O', core});
    	GameRegistry.addShapelessRecipe(new ItemStack(ingotAdam, 9), new Object[] { new ItemStack(blockAdam) });
    	GameRegistry.addRecipe(new ItemStack(core), new Object [] { "X#X", "#D#", "X#X", 'X', Item.redstone, '#', amethyst, 'D', Item.diamond});
    	
    	GameRegistry.addRecipe(new ItemStack(adamHat), new Object[] {"XXX", "X X", "   ", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(adamHat), new Object[] {"   ", "XXX", "X X", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(adamChest), new Object[] {"X X", "XXX", "XXX", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(adamLegs), new Object[] {"XXX", "X X", "X X", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(adamBoots), new Object[] {"X X", "X X", "   ", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(adamBoots), new Object[] {"   ", "X X", "X X", 'X', ingotAdam});
    	GameRegistry.addRecipe(new ItemStack(energyChest), new Object[] {"XOX", "XCX", "XXX", 'X', ingotAdam, 'O', adamChest, 'C', core});
    	GameRegistry.addRecipe(new ItemStack(energyBoots), new Object[] {"XXX", "XOX", "XCX", 'X', ingotAdam, 'O', adamBoots, 'C', core});
    	
    	
    	// Smelting //
    	
    	GameRegistry.addSmelting(oreAdamantium.blockID, new ItemStack(dustAdam), 0.5F); 
    	GameRegistry.addSmelting(dustAdam.shiftedIndex, new ItemStack(ingotAdam), 1.0F); 
    	GameRegistry.addSmelting(Block.gravel.blockID, new ItemStack(Block.cobblestone), 0.1F); 
    	
    	
    	// Fuel //
    	
    	GameRegistry.registerFuelHandler(new ItemCrystallizedCoalFuel());
    	
    	
    	// Ore Generation //
    	
    	GameRegistry.registerWorldGenerator(new WorldgeneratorAdam());
    	GameRegistry.registerWorldGenerator(new WorldgeneratorExpite());
    	GameRegistry.registerWorldGenerator(new WorldgeneratorLightgem());
    	GameRegistry.registerWorldGenerator(new WorldgeneratorDyte());
    	GameRegistry.registerWorldGenerator(new WorldgeneratorQuartz());
    	GameRegistry.registerWorldGenerator(new WorldgeneratorSuphur());
    	
    	GameRegistry.registerWorldGenerator(new WorldgeneratorCrypt());
    	
    	// Dungeon Loot //
    	
    	DungeonHooks.addDungeonLoot(new ItemStack(ingotAdam), 1, 1, 3);
    	DungeonHooks.addDungeonLoot(new ItemStack(amethyst), 6, 2, 6);
    	DungeonHooks.addDungeonLoot(new ItemStack(cCoal), 6, 2, 6);
    	
    	// Setting Harvest Level //
    	
    	MinecraftForge.setBlockHarvestLevel(oreAdamantium, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(blockAdam, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(blockDarkstone, "pickaxe", 3);
        
        
        LanguageRegistry.instance().addStringLocalization("entity.Explode.name", "en_US", "Explode");
        EntityRegistry.registerGlobalEntityID(EntityExplode.class, "Explode", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityExplode.class, "Explode", 1, this, 128, 1, false);
        
        
        
    	proxy.registerRenderThings();
        proxy.initCustomRarityTypes();
	}
	/*
	public boolean onTickInGame(float f, Minecraft minecraft) {
		if(minecraft.thePlayer.inventory.armorItemInSlot(0) != null)
        {
			EntityPlayer Player = ModLoader.getMinecraftInstance().thePlayer;
            ItemStack itemstack = minecraft.thePlayer.inventory.armorItemInSlot(0);
            MoresMod _tmp = this;
            if(itemstack.itemID == energyBoots.shiftedIndex) {
            	
                if (Keyboard.isKeyDown(minecraft.gameSettings.keyBindJump.keyCode) && minecraft.thePlayer.motionY > 0.00) {
                
                	minecraft.thePlayer.motionY += 0.066D;
                }
                
                minecraft.thePlayer.stepHeight = 1.0F;
                minecraft.thePlayer.fallDistance = 0.0F;
            }   
        }
		return true;
	}
	*/ 
}
