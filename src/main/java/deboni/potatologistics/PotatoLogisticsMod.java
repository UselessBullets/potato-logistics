package deboni.potatologistics;

import deboni.potatologistics.blocks.entities.TileEntityAutoBasket;
import deboni.potatologistics.blocks.entities.TileEntityAutoCrafter;
import deboni.potatologistics.blocks.entities.TileEntityBurner;
import deboni.potatologistics.blocks.entities.TileEntityCoil;
import deboni.potatologistics.blocks.entities.TileEntityEnergyConnector;
import deboni.potatologistics.blocks.entities.TileEntityFilter;
import deboni.potatologistics.blocks.entities.TileEntityMiningDrill;
import deboni.potatologistics.blocks.entities.TileEntityPipe;
import deboni.potatologistics.blocks.entities.TileEntityStirlingEngine;
import deboni.potatologistics.blocks.entities.TileEntityTreeChopper;
import deboni.potatologistics.gui.ContainerAutoCrafter;
import deboni.potatologistics.gui.ContainerBurner;
import deboni.potatologistics.gui.ContainerFilter;
import deboni.potatologistics.gui.GuiAutoCrafter;
import deboni.potatologistics.gui.GuiBurner;
import deboni.potatologistics.gui.GuiFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sunsetsatellite.catalyst.Catalyst;
import sunsetsatellite.catalyst.core.util.MpGuiEntry;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;

public class PotatoLogisticsMod implements GameStartEntrypoint {
    public static final String MOD_ID = "potatologistics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ConfigHandler config;


    static {
        Properties prop = new Properties();
        prop.setProperty("starting_block_id","1999");
        prop.setProperty("starting_item_id","17999");
        config = new ConfigHandler(MOD_ID,prop);
        config.updateConfig();
    }




//    @Override
//    public void onInitialize() {
//
//
////        RecipeHelper.Crafting.createShapelessRecipe(PotatoItems.itemPotato, 1, new Object[]{Item.clay, Item.dustSugar, Item.dustGlowstone});
////        RecipeHelper.Crafting.createShapelessRecipe(PotatoItems.itemPotato, 9, new Object[]{PotatoBlocks.blockPotato});
////        RecipeHelper.Crafting.createShapelessRecipe(PotatoItems.itemWireSpool, 1, new Object[]{PotatoItems.itemWireSpool});
////        RecipeHelper.Crafting.createShapelessRecipe(PotatoItems.itemRedstoneIronMix, 1, new Object[]{Item.ingotIron, Item.dustRedstone, Item.dustRedstone, Item.dustRedstone});
////
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockPotato, 1, new Object[]{"AAA", "AAA", "AAA", 'A', PotatoItems.itemPotato});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockPipe, 16, new Object[]{"   ", "ABA", "   ", 'A', Item.ingotIron, 'B', Block.glass});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockDirectionalPipe, 16, new Object[]{"   ", "ABC", "   ", 'A', Item.ingotIron, 'B', Block.glass, 'C', Item.ingotGold});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemWrench, 1, new Object[]{" A ", "AA ", "  A", 'A', Item.ingotIron, 'B', Block.glass});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockFilter, 1, new Object[]{"ABA", "BCB", "ABA", 'A', Block.planksOak, 'B', Item.dustRedstone, 'C', Block.mesh});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemAutoBasket, 1, new Object[]{"AAA", "CBC", "CCC", 'A', Item.leather, 'B', Item.dustRedstone, 'C', Item.wheat});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockBlockCrusher, 1, new Object[]{"ABA", "ECF", "ADA", 'A', Block.cobbleStone, 'B', Block.obsidian, 'C', Item.toolPickaxeDiamond, 'D', Block.pistonBaseSticky, 'E', PotatoBlocks.blockPipe, 'F', Item.dustRedstone});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockBlockPlacer, 1, new Object[]{"ADA", "ACA", "ABA", 'A', Block.cobbleStone, 'B', PotatoBlocks.blockPipe, 'C', Item.dustRedstone, 'D', Block.pistonBase});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockTreeChopper, 1, new Object[]{"AAA", "BCD", "AEA", 'A', Item.ingotIron, 'B', Item.toolAxeDiamond, 'C', PotatoBlocks.blockIronMachineBlock, 'D', PotatoBlocks.blockPipe, 'E', Item.dustRedstone});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockMiningDrill, 1, new Object[]{"ADA", "CBC", "AEA", 'A', Item.ingotSteel, 'B', Item.toolPickaxeDiamond, 'C', PotatoBlocks.blockSteelMachineBlock, 'D', PotatoBlocks.blockPipe, 'E', Item.dustRedstone});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemIronGear, 1, new Object[]{" A ", "A A", " A ", 'A', Item.ingotIron});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemSteelGear, 1, new Object[]{" A ", "A A", " A ", 'A', Item.ingotSteel});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockIronMachineBlock, 1, new Object[]{"AAA", "BCB", "AAA", 'A', Item.ingotIron, 'B', PotatoItems.itemIronGear, 'C', PotatoItems.itemRedstoneAlloy});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockSteelMachineBlock, 1, new Object[]{"AAA", "BCB", "AAA", 'A', Item.ingotSteel, 'B', PotatoItems.itemSteelGear, 'C', PotatoItems.itemRedstoneAlloy});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemWireSpool, 8, new Object[]{" A ", "ABA", " A ", 'A', PotatoItems.itemRedstoneAlloy, 'B', Item.stick});
////        RecipeHelper.Crafting.createRecipe(PotatoItems.itemEnergyConnector, 4, new Object[]{" A ", "BAB", "BAB", 'A', Item.ingotIron, 'B', Item.brickClay});
////        RecipeHelper.Crafting.createRecipe(PotatoBlocks.blockAutoCrafter, 1, new Object[]{"RRR", "ICI", "IGI", 'R', Item.dustRedstone, 'I', Item.ingotIron, 'C', Block.workbench, 'G', PotatoItems.itemIronGear});
////
////        RecipeHelper.Smelting.createRecipe(PotatoItems.itemRedstoneAlloy, PotatoItems.itemRedstoneIronMix);
//
////        if (EnergyAPI.generator != null) {
////            RecipeHelper.Crafting.createRecipe(EnergyAPI.generator, 1, new Object[]{"AAA", "ABA", "ACA", 'A', Item.ingotIron, 'B', blockIronMachineBlock, 'C', Block.furnaceStoneIdle});
////        }
//    }

    @Override
    public void beforeGameStart() {
        LOGGER.info("PotatoLogistics initialized.");

        EntityHelper.Core.createTileEntity(TileEntityFilter.class, "filter.tile");
        EntityHelper.Core.createTileEntity(TileEntityBurner.class, "furnace_burner.tile");
        EntityHelper.Core.createSpecialTileEntity(TileEntityPipe.class, new TileEntityRendererPipe(), "pipe.tile");
        EntityHelper.Core.createTileEntity(TileEntityAutoBasket.class, "auto_basket.tile");
        EntityHelper.Core.createTileEntity(TileEntityTreeChopper.class, "tree_chopper.tile");
        EntityHelper.Core.createTileEntity(TileEntityStirlingEngine.class, "stirling_engine.tile");
        EntityHelper.Core.createTileEntity(TileEntityCoil.class, "coil.tile");
        EntityHelper.Core.createSpecialTileEntity(TileEntityMiningDrill.class, new TileEntityRendererMiningDrill(), "mining_drill.tile");
        EntityHelper.Core.createSpecialTileEntity(TileEntityEnergyConnector.class, new TileEntityRendererEnergyConnector(), "energy_connector.tile");
        EntityHelper.Core.createTileEntity(TileEntityAutoCrafter.class, "auto_crafter.tile");

        Catalyst.GUIS.register("Filter", new MpGuiEntry(TileEntityFilter.class, GuiFilter.class, ContainerFilter.class));
        Catalyst.GUIS.register("Coal Burner", new MpGuiEntry(TileEntityBurner.class, GuiBurner.class, ContainerBurner.class));
        Catalyst.GUIS.register("Auto Crafter", new MpGuiEntry(TileEntityAutoCrafter.class, GuiAutoCrafter.class, ContainerAutoCrafter.class));

        PotatoBlocks.init();
        PotatoItems.init();
    }

    @Override
    public void afterGameStart() {

    }
}
