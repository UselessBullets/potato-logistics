package deboni.potatologistics;

import deboni.potatologistics.items.ItemWireSpool;
import deboni.potatologistics.items.Potato;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemHelper;

import static deboni.potatologistics.PotatoLogisticsMod.MOD_ID;

public class PotatoItems {
    private static int itemNum = PotatoLogisticsMod.config.getInt("starting_item_id");;
    public static Item itemPotato = ItemHelper.createItem(MOD_ID, new Potato("Potato", itemNum++, 5, true), "potato", "potato.png");
    public static Item itemWrench = ItemHelper.createItem(MOD_ID, new Item("Wrench", itemNum++), "wrench", "wrench.png").setMaxStackSize(1);
    public static Item itemAutoBasket = ItemHelper.createItem(MOD_ID, new ItemPlaceable("Auto Basket", itemNum++, PotatoBlocks.blockAutoBasket), "auto_basket", "auto_basket.png");
    public static Item itemIronGear = ItemHelper.createItem(MOD_ID, new Item("Iron Gear", itemNum++), "iron_gear", "iron_gear.png");
    public static Item itemSteelGear = ItemHelper.createItem(MOD_ID, new Item("Steel Gear", itemNum++), "steel_gear", "steel_gear.png");
    public static Item itemEnergyConnector = ItemHelper.createItem(MOD_ID, new ItemPlaceable("Energy Connector", itemNum++, PotatoBlocks.blockEnergyConnector), "energy_connector", "energy_connector.png");
    public static Item itemWireSpool = ItemHelper.createItem(MOD_ID, new ItemWireSpool("Wire Spool", itemNum++), "wire_spool", "wire_spool.png");
    public static  Item itemRedstoneAlloy = ItemHelper.createItem(MOD_ID, new Item("Redstone Alloy", itemNum++), "redstone_alloy", "redstone_alloy.png");
    public static  Item itemRedstoneIronMix = ItemHelper.createItem(MOD_ID, new Item("Redstone Iron Mix", itemNum++), "redstone_iron_mix", "redstone_iron_mix.png");
    public static void init(){}
}
