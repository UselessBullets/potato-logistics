package deboni.potatologistics;

import deboni.potatologistics.blocks.BlockAdvancedDispenser;
import deboni.potatologistics.blocks.BlockAutoBasket;
import deboni.potatologistics.blocks.BlockAutoCrafter;
import deboni.potatologistics.blocks.BlockBlockCrusher;
import deboni.potatologistics.blocks.BlockBlockPlacer;
import deboni.potatologistics.blocks.BlockCoil;
import deboni.potatologistics.blocks.BlockEnergyConnector;
import deboni.potatologistics.blocks.BlockFilter;
import deboni.potatologistics.blocks.BlockFurnaceBurner;
import deboni.potatologistics.blocks.BlockMiningDrill;
import deboni.potatologistics.blocks.BlockPipe;
import deboni.potatologistics.blocks.BlockPotato;
import deboni.potatologistics.blocks.BlockStirlingEngine;
import deboni.potatologistics.blocks.BlockTestAreaMaker;
import deboni.potatologistics.blocks.BlockTreeChopper;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

import static deboni.potatologistics.PotatoLogisticsMod.MOD_ID;

public class PotatoBlocks {
    private static int blockNum = PotatoLogisticsMod.config.getInt("starting_block_id");
    public static Block blockPotato = new BlockBuilder(MOD_ID)
            .setTextures("potato.png")
            .build(new BlockPotato("potato", blockNum++, Material.wood));;
    public static Block blockPipe = new BlockBuilder(MOD_ID)
            .setTextures("pipe.png")
            .setLightOpacity(0)
            .setHardness(0.1f)
            .setBlockModel(new BlockModelRenderBlocks(151))
            .build(new BlockPipe("pipe", blockNum++, Material.glass, false));;
    public static Block blockDirectionalPipe = new BlockBuilder(MOD_ID)
            .setTextures("directional_pipe.png")
            .setLightOpacity(0)
            .setHardness(0.1f)
            .setBlockModel(new BlockModelRenderBlocks(151))
            .build(new BlockPipe("directional_pipe", blockNum++, Material.glass, true));;
    public static Block blockFilter = new BlockBuilder(MOD_ID)
            .setTextures("block_filter.png")
            .setLightOpacity(0)
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockFilter("filter", blockNum++, Material.wood));;
    public static Block blockAutoBasket = new BlockBuilder(MOD_ID)
            .setTopTexture(4, 9)
            .setBottomTexture("auto_basket_bottom.png")
            .setSideTextures("auto_basket_sides.png")
            .setLightOpacity(0)
            .setHardness(0.1f)
            .setBlockModel(new BlockModelRenderBlocks(150))
            .build(new BlockAutoBasket("auto_basket", blockNum++, Material.cloth));;
    public static Block blockBlockCrusher = new BlockBuilder(MOD_ID)
            .setSideTextures(14, 3)
            .setTopTexture("block_crusher_front.png")
            .setBottomTexture("block_crusher_back.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockBlockCrusher("block_crusher", blockNum++, Material.stone));;
    public static Block blockBlockPlacer = new BlockBuilder(MOD_ID)
            .setSideTextures(14, 3)
            .setTopTexture("block_placer_front.png")
            .setBottomTexture("block_crusher_back.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockBlockPlacer("block_placer", blockNum++, Material.stone));;
    public static Block blockTreeChopper = new BlockBuilder(MOD_ID)
            .setSideTextures("iron_machine_side.png")
            .setNorthTexture("iron_machine_block.png")
            .setTopTexture("tree_chopper_front.png")
            .setBottomTexture("iron_machine_out.png")
            .setLightOpacity(0)
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .setBlockModel(new BlockModelRenderBlocks(152))
            .build(new BlockTreeChopper("tree_chopper", blockNum++, Material.metal));;
    public static Block blockTreeChopperSaw = new BlockBuilder(MOD_ID)
            .setTextures("tree_chopper_saw.png")
            .setTags(BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockTreeChopper("tree_chopper_saw", blockNum++, Material.metal));;

    public static Block blockIronMachineBlock = new BlockBuilder(MOD_ID)
            .setTextures("iron_machine_block.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("iron_machine_block", blockNum++, Material.metal));;
    public static Block blockSteelMachineBlock = new BlockBuilder(MOD_ID)
            .setTextures("steel_machine_block.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("steel_machine_block", blockNum++, Material.metal));;

    public static Block blockTestAreaMaker = new BlockBuilder(MOD_ID)
            .setTextures("potato.png")
            .build(new BlockTestAreaMaker("test_area_maker", blockNum++, Material.metal));;
    public static Block blockMiningDrill = new BlockBuilder(MOD_ID)
            .setSideTextures("mining_drill_sides.png")
            .setTopTexture("mining_drill_top.png")
            .setBottomTexture("mining_drill_bottom.png")
            .setLightOpacity(0)
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockMiningDrill("mining_drill", blockNum++, Material.metal));;
    public static Block blockEnergyConnector = new BlockBuilder(MOD_ID)
            .setTextures("energy_connector.png")
            .setLightOpacity(0)
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
            .setBlockModel(new BlockModelRenderBlocks(153))
            .build(new BlockEnergyConnector("energy_connector", blockNum++, Material.metal));;
    public static Block blockAdvancedDispenser = new BlockBuilder(MOD_ID)
            .setTextures("iron_machine_side.png")
            .setTopTexture("iron_machine_block.png")
            .setBottomTexture("iron_machine_block.png")
            .setNorthTexture("advanced_dispenser_front.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAdvancedDispenser("advanced_dispenser", blockNum++));;

    public static Block blockFurnaceBurner = new BlockBuilder(MOD_ID)
            .setTopBottomTexture("iron_machine_block.png")
            .setSideTextures("furnace_burner.png")
            .setHardness(2.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockFurnaceBurner("furnace_burner", blockNum++, Material.metal));;
    public static Block blockFurnaceBurnerOn = new BlockBuilder(MOD_ID)
            .setTopBottomTexture("iron_machine_block.png")
            .setSideTextures("furnace_burner_on.png")
            .setHardness(2.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockFurnaceBurner("furnace_burner_on", blockNum++, Material.metal));;
    public static Block blockStirlingEngine = new BlockBuilder(MOD_ID)
            .setTextures("iron_machine_block.png")
            .setHardness(2.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .setBlockModel(new BlockModelRenderBlocks(154))
            .build(new BlockStirlingEngine("stirling_engine", blockNum++, Material.metal));;
    public static Block blockCoil = new BlockBuilder(MOD_ID)
            .setTopTexture("coil_block_top.png")
            .setBottomTexture("coil_block_bottom.png")
            .setSideTextures("coil_block_sides.png")
            .setHardness(2.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockCoil("coil", blockNum++, Material.metal));
    public static Block blockAutoCrafter = new BlockBuilder(MOD_ID)
            .setTextures("iron_machine_side.png")
            .setTopTexture("auto_crafter_top.png")
            .setBottomTexture("iron_machine_block.png")
            .setNorthTexture("auto_crafter_front.png")
            .setHardness(1.5f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAutoCrafter("auto_crafter", blockNum++, Material.metal));
    public static void init(){}
}
