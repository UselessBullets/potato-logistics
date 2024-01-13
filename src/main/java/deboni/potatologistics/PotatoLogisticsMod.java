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
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sunsetsatellite.catalyst.Catalyst;
import sunsetsatellite.catalyst.core.util.MpGuiEntry;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.RecipeHelper;
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
