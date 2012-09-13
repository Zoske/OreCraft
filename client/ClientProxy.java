package oreCraft.client;

import oreCraft.common.CommonProxy;
import net.minecraft.src.EnumRarity;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.client.MinecraftForgeClient;
import static common.lib.CustomItemRarity.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderThings() {
    	MinecraftForgeClient.preloadTexture("/MoresTexturesBlocks.png");
    	MinecraftForgeClient.preloadTexture("/MoresTexturesItems.png");
    }
    @Override
    public void initCustomRarityTypes() {
    	EnumHelperClient.addRarity(BLACK, COLOR_BLACK, DISPLAY_NAME_BLACK);
    	EnumHelperClient.addRarity(GREEN, COLOR_GREEN, DISPLAY_NAME_GREEN);
    	EnumHelperClient.addRarity(CYAN, COLOR_CYAN, DISPLAY_NAME_CYAN);
    	EnumHelperClient.addRarity(RED, COLOR_RED, DISPLAY_NAME_RED);
    	EnumHelperClient.addRarity(PURPLE, COLOR_PURPLE, DISPLAY_NAME_PURPLE);
    	EnumHelperClient.addRarity(ORANGE, COLOR_ORANGE, DISPLAY_NAME_ORANGE);
    	EnumHelperClient.addRarity(LIGHTG, COLOR_LIGTHG, DISPLAY_NAME_LIGHTG);
    	EnumHelperClient.addRarity(DARKG, COLOR_DARKG, DISPLAY_NAME_DARKG);
    	EnumHelperClient.addRarity(BLUE, COLOR_BLUE, DISPLAY_NAME_BLUE);
    	EnumHelperClient.addRarity(LIGHTGREEN, COLOR_LIGHTGREEN, DISPLAY_NAME_LIGHTGREEN);
    	EnumHelperClient.addRarity(LIGHTC, COLOR_LIGHTC, DISPLAY_NAME_LIGHTC);
    	EnumHelperClient.addRarity(LIGHTR, COLOR_LIGHTR, DISPLAY_NAME_LIGHTR);
    	EnumHelperClient.addRarity(PINK, COLOR_PINK, DISPLAY_NAME_PINK);
    	EnumHelperClient.addRarity(YELLOW, COLOR_YELLOW, DISPLAY_NAME_YELLOW);    	
    }

    @Override
    public EnumRarity getCustomRarityType(String customRarity) {
        for (EnumRarity rarity : EnumRarity.class.getEnumConstants()) {
            if (rarity.name().equals(customRarity))
                return rarity;
        }
        return EnumRarity.common;
    }
}