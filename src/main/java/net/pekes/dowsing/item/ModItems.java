package net.pekes.dowsing.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pekes.dowsing.DowsingMod;
import net.pekes.dowsing.item.custom.DowsingRodItem;

public class ModItems {

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.DOWSING_ITEMS).maxDamage(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DowsingMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        DowsingMod.LOGGER.info("Registering mod items for " + DowsingMod.MOD_ID);

    }
}
