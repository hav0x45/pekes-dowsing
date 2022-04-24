package net.pekes.dowsing.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pekes.dowsing.DowsingMod;

public class ModItemGroup {

    public static final ItemGroup DOWSING_ITEMS = FabricItemGroupBuilder.build(new Identifier(DowsingMod.MOD_ID, "dowsing"),
            () -> new ItemStack(ModItems.DOWSING_ROD));

}
