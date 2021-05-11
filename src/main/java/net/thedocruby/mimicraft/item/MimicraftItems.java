package net.thedocruby.mimicraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thedocruby.mimicraft.block.MimicraftBlocks;

public class MimicraftItems {
    public static final Mimicream MIMICREAM = new Mimicream(new FabricItemSettings().group(ItemGroup.MISC));
    public static final BlockItem MIMICREAM_BLOCK_ITEM = new BlockItem(MimicraftBlocks.MIMICREAM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final MemoryCream MEMORY_CREAM = new MemoryCream(new FabricItemSettings().group(ItemGroup.MISC));
    public static final MemoryCream ACTIVATED_MEMORY_CREAM = new ActivatedMemoryCream(new FabricItemSettings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("mimicraft", "mimicream"), MIMICREAM);
        Registry.register(Registry.ITEM, new Identifier("mimicraft", "mimicream_block"), MIMICREAM_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("mimicraft", "memory_cream"), MEMORY_CREAM);
        Registry.register(Registry.ITEM, new Identifier("mimicraft", "activated_memory_cream"), ACTIVATED_MEMORY_CREAM);
    }
}
